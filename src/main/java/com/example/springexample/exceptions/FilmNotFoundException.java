package com.example.springexample.exceptions;

public class FilmNotFoundException extends RuntimeException {
    public FilmNotFoundException(Long id) {
        super("Cound not find film " + id);
    }
}
