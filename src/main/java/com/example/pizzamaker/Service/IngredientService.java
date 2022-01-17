package com.example.pizzamaker.Service;

import com.example.pizzamaker.model.Ingredient;

import java.util.List;

public interface IngredientService {
    Ingredient read(int id);

    List<Ingredient> readAll();

    void create(Ingredient Ingredient);

    Ingredient update(int id, Ingredient Ingredient);

    void delete(int id);
}
