package com.example.springexample.repositories;

import com.example.springexample.models.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface FilmRepository extends PagingAndSortingRepository<Film, Long> {
}
