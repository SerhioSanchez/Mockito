package org.example.MockitoTask.services;

public class MovieManager {
    private int amountFilms = 10;
    private MovieObject[] movie = new MovieObject[0];

    public MovieManager() {
    }

    public MovieManager(int amountFilms) {
        this.amountFilms = amountFilms;
    }

    public void addFilm(MovieObject item) {
        MovieObject[] newMovie = new MovieObject[movie.length + 1];
        for (int i = 0; i < movie.length; i++) {
            newMovie[i] = movie[i];
        }
        newMovie[movie.length] = item;
        movie = newMovie;
    }

    public MovieObject[] findAll() {
        return movie;
    }

    public MovieObject[] findLast() {
        int resultLength = movie.length;
        if (resultLength > amountFilms) {
            resultLength = amountFilms;
        }
        MovieObject[] newMovie = new MovieObject[resultLength];
        int index = 0;
        for (int i = movie.length - 1; i >= movie.length - resultLength; i--) {
            newMovie[index] = movie[i];
            index++;
        }
        return newMovie;
    }
}