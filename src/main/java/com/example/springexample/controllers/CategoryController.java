//package com.example.springexample.controllers;
//
//import com.example.springexample.exceptions.CategoryNotFoundException;
//import com.example.springexample.models.Category;
//import com.example.springexample.repositories.CategoryRepository;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class CategoryController {
//
//    private final CategoryRepository categoryRepository;
//
//    public CategoryController(CategoryRepository categoryRepository) {
//        this.categoryRepository = categoryRepository;
//    }
//
//    @GetMapping("/category")
//    List<Category> all() {
//        return categoryRepository.findAll();
//    }
//
//    @PostMapping("/category")
//    Category newCategory(@RequestBody Category newCategory) {
//        return categoryRepository.save(newCategory);
//    }
//
//    @GetMapping("/category/{id}")
//    Category one(@PathVariable Long id) {
//        return categoryRepository.findById(id).orElseThrow(() -> new CategoryNotFoundException(id));
//    }
//
//    @PutMapping("/category/{id}")
//    Category replaceCategory(@RequestBody Category newCategory, @PathVariable Long id) {
//        return categoryRepository.findById(id).map(category -> {
//            category.setName(newCategory.getName());
//            return categoryRepository.save(category);
//        }).orElseGet(() -> {
//            newCategory.setId(id);
//            return categoryRepository.save(newCategory);
//        });
//    }
//
//    @DeleteMapping("/category/{id}")
//    void deleteCategory(@PathVariable Long id) {
//        categoryRepository.deleteById(id);
//    }
//}
