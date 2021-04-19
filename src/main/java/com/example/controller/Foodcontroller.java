package com.example.controller;

import com.example.dao.Food;
import com.example.service.Foodservice;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

import java.util.List;


@Controller("/food")
public class Foodcontroller {

    private Foodservice foodService;

    public Foodcontroller(Foodservice foodService) {
        this.foodService = foodService;
    }

    @Get("/random")
    public Food getFoodChoice() {
       return foodService.getFoodChoice();
    }

    @Get("/search/{searchString}")
    public List<Food> searchFood(@PathVariable String searchString) {
        return foodService.searchFoodHavingWords(searchString);
    }

}
