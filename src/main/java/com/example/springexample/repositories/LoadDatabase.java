package com.example.springexample.repositories;

import com.example.springexample.models.Category;
import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(FilmRepository filmRepository, CategoryRepository categoryRepository) {
        return args -> {
            log.info("Preloading " + categoryRepository.save(new Category("Series")));
            log.info("Preloading " + categoryRepository.save(new Category("Movies")));
        };
    }
}
