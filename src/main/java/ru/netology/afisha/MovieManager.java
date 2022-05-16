package ru.netology.afisha;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor

public class MovieManager {

    private String[] movie = new String[0];
    private int limitLength = 10;

    public MovieManager(int limitLength) {
        this.limitLength = limitLength;
    }

    public void add(String movieAdd) {
        int length = movie.length + 1;
        String[] tmp = new String[length];
        for (int i = 0; i < length - 1; i++) {
            tmp[i] = movie[i];
        }
        tmp[length - 1] = movieAdd;
        movie = tmp;
    }

    public String[] findAll() {
        return movie;
    }

    public void findLast() {
        int resultLength = movie.length;
        if (resultLength > limitLength) {
            resultLength = limitLength;
        }
        String[] tmp = new String[resultLength];
        int index = movie.length - 1;
        for (int i = 0; i < resultLength; i++) {
            tmp[i] = movie[index - i];
        }
        movie = tmp;
    }
}
