package com.aula.workshopmongo.dto;

import java.io.Serializable;
import java.sql.Date;

public class CommentDTO implements Serializable {
    private String text;
    private java.util.Date date;
    private AuthorDTO author;

    public CommentDTO(String text, java.util.Date parse, AuthorDTO author){
    }

    public CommentDTO(String text, Date date, AuthorDTO author) {
        this.text = text;
        this.date = date;
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public java.util.Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public AuthorDTO getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDTO author) {
        this.author = author;
    }
}
