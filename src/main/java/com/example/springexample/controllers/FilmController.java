//package com.example.springexample.controllers;
//
//import com.example.springexample.exceptions.FilmNotFoundException;
//import com.example.springexample.models.Film;
//import com.example.springexample.repositories.FilmRepository;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class FilmController {
//
//    private final FilmRepository filmRepository;
//
//    public FilmController(FilmRepository filmRepository) {
//        this.filmRepository = filmRepository;
//    }
//
//    @GetMapping("/films")
//    List<Film> all() {
//        return filmRepository.findAll();
//    }
//
//    @PostMapping("/films")
//    Film newFilm(@RequestBody Film newFilm) {
//        return filmRepository.save(newFilm);
//    }
//
//    @GetMapping("/films/{id}")
//    Film one(@PathVariable Long id) {
//        return filmRepository.findById(id).orElseThrow(() -> new FilmNotFoundException(id));
//    }
//
//    @PutMapping("/films/{id}")
//    Film replaceFilm(@RequestBody Film newFilm, @PathVariable Long id) {
//        return filmRepository.findById(id).map(film -> {
//            film.setName(newFilm.getName());
//            film.setRelease_date(newFilm.getRelease_date());
//            return filmRepository.save(film);
//        }).orElseGet(() -> {
//            newFilm.setId(id);
//            return filmRepository.save(newFilm);
//        });
//    }
//
//    @DeleteMapping("/films/{id}")
//    void deleteFilm(@PathVariable Long id) {
//        filmRepository.deleteById(id);
//    }
//}
