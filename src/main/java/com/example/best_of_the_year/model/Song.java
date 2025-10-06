package com.example.best_of_the_year.model;

public class Song {

    private String id;

    private String titolo;

    public Song(String id, String titolo) {
        this.id = id;
        this.titolo = titolo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }


}
