package com.example.bookexample.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue // the id is generated by the JPA repository
    private long id;

    private String author; // This is the first author of the book
    private String title; // This is the title of the book

    //TODO: Here we need to add the part for the library, for now it is just a placeholder as I don't have time to implement it now.

    private String editor;


    // this is the constructor
    public Book(String author, String title) {
        this.author = author;
        this.title = title;
        this.editor = editor;
    }

    public Book() {
        //TODO: we need to revise the implementation here
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String name) {
        this.author = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public long getId() { return id;}

    public String getEditor() {return editor;}

    public void setEditor(String editorName) {this.editor = editorName;}

    public void injectId(long id) { this.id = id;}
    // not providing the public Setter with the expected name setId renders fields in the generated GridCrud uneditable
    // Alternative: use setId() and omit the Id from the Crud forms
}
