package com.example.service;

import com.example.dao.Food;
import io.micronaut.http.annotation.Get;

import javax.inject.Singleton;
import java.io.LineNumberInputStream;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Singleton
public class Foodservice {

    private static final List<Food> choices = List.of(
            new Food("Rice"),
            new Food("Dalma"),
            new Food("Curry"),
            new Food("Khiri"),
            new Food("Raita"),
            new Food("Biriyani"),
            new Food("Bhaji"),
            new Food("Kaju barfi"),
            new Food("Omlet"),
            new Food("Pudding"),
            new Food("Halwa"),
            new Food("baigan bharta"),
            new Food("Dahi chaat"),
            new Food("Bhindi"),
            new Food("Gulaab jamoon"),
            new Food("Lassi"),
            new Food("Roti"),
            new Food("Daal")
    );


    public Food getFoodChoice() {
        return choices.get(new Random().nextInt(19));
    }

    public List<Food> searchFoodHavingWords(String subSet) {
        return choices.stream().
                filter(food ->
                        food.getName().toLowerCase().contains(subSet))
                .collect(Collectors.toList());
    }
}
