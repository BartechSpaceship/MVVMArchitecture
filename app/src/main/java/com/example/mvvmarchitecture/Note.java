package com.example.mvvmarchitecture;
//First create a Entity for the ROOM so that we have a place to store the data


import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "note_table")//Room is accessed through this
public class Note {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String title;
    private String description;
    private int priority;


    public Note(String title, String description, int priority) {
        this.title = title;
        this.description = description;
        this.priority = priority;
    }

    //this is the only value that needs a setter because its not in the constructor
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }
}
