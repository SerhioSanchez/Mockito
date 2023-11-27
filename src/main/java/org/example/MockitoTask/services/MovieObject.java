package org.example.MockitoTask.services;

public class MovieObject {
    private String name;
    private String genre;
    private String imageUrl;
    private boolean premiereTomorrow;

    public MovieObject() {
    }

    public MovieObject(String name, String genre, String imageUrl,
                       boolean premiereTomorrow) {
        this.name = name;
        this.genre = genre;
        this.imageUrl = imageUrl;
        this.premiereTomorrow = premiereTomorrow;
    }
}
