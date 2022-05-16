package ru.netology.afisha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    @Test
    void shouldAddMovie() {
        MovieManager movieManager = new MovieManager();

        String[] movieTest = new String[] {"F1", "F2", "F3"};
        movieManager.setMovie(movieTest);
        String addMovie = "F4";
        movieManager.add(addMovie);
        String[] expected = new String[] {"F1", "F2", "F3", "F4"};
        String[] actual = movieManager.getMovie();

        assertArrayEquals(expected,actual);
    }

    @Test
    void shouldFindAll() {
        MovieManager movieManager = new MovieManager();

        String[] movieTest = new String[] {"F1", "F2", "F3","F4"};
        movieManager.setMovie(movieTest);
        movieManager.findAll();
        String[] expected = new String[] {"F1", "F2", "F3", "F4"};
        String[] actual = movieManager.getMovie();

        assertArrayEquals(expected,actual);
    }

    @Test
    void shouldFindLast() {
        MovieManager movieManager = new MovieManager(3);

        String[] movieTest = new String[] {"F1", "F2", "F3", "F4"};
        movieManager.setMovie(movieTest);
        movieManager.findLast();
        String[] expected = new String[] {"F4","F3","F2"};
        String[] actual = movieManager.getMovie();

        assertArrayEquals(expected,actual);
    }
}