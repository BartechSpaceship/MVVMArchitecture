package com.example.mvvmarchitecture;
//Then we create the Dao which is a way to access the ROOM

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

//Dao has to be abstract class or interface
//Its interface because we dont tell the class what to do
//Room will tell it what to do when you add the @
@Dao//Tells Room its a Dao
public interface NoteDao {

    @Insert
    void insert(Note note);
    @Update
    void update(Note note);
    @Delete
    void delete(Note note);

    @Query("DELETE FROM note_table")
    void deleteAllNotes();

    //The difference with Live Data is that you can observe whats happening
    @Query("SELECT * FROM note_table ORDER BY priority DESC")
    LiveData<List<Note>> getAllNotes();

}
