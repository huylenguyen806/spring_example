package com.example.springexample.exceptions;

public class CategoryNotFoundException extends RuntimeException {
    public CategoryNotFoundException(Long id) {
        super("Cound not find category " + id);
    }
}
