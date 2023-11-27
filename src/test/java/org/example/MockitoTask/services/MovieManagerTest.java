package org.example.MockitoTask.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {
    @Test
    public void addFilm() {
        MovieManager film = new MovieManager();
        MovieObject first = new MovieObject();
        MovieObject second = new MovieObject();
        MovieObject third = new MovieObject();
        film.addFilm(first);
        film.addFilm(second);
        film.addFilm(third);
        MovieObject[] actual = film.findAll();
        MovieObject[] expected = {first, second, third};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast() {
        MovieManager film = new MovieManager();
        MovieObject first = new MovieObject("Вперед", "мультфильм", "https/..", false);
        MovieObject second = new MovieObject("Отель", "комедия", "https/..", false);
        MovieObject third = new MovieObject("Номер один", "комедия", "https/..", true);
        film.addFilm(first);
        film.addFilm(second);
        film.addFilm(third);
        MovieObject[] actual = film.findLast();
        MovieObject[] expected = {third, second, first};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastAmountFilms() {
        MovieManager film = new MovieManager(9);
        MovieObject first = new MovieObject();
        MovieObject second = new MovieObject();
        MovieObject third = new MovieObject();
        MovieObject fourth = new MovieObject();
        MovieObject fifth = new MovieObject();
        MovieObject sixth = new MovieObject();
        MovieObject seventh = new MovieObject();
        MovieObject eighth = new MovieObject();
        MovieObject ninth = new MovieObject();
        MovieObject tenth = new MovieObject();
        MovieObject eleven = new MovieObject();
        MovieObject twelve = new MovieObject();


        film.addFilm(first);
        film.addFilm(second);
        film.addFilm(third);
        film.addFilm(fourth);
        film.addFilm(fifth);
        film.addFilm(sixth);
        film.addFilm(seventh);
        film.addFilm(eighth);
        film.addFilm(ninth);
        film.addFilm(tenth);
        film.addFilm(eleven);
        film.addFilm(twelve);

        MovieObject[] actual = film.findLast();
        MovieObject[] expected = {twelve, eleven, tenth, ninth, eighth, seventh, sixth, fifth, fourth};
        Assertions.assertArrayEquals(expected, actual);
    }


}