package com.interviewdot.ILoveJavaProgramming;

import java.util.ArrayList;
import java.util.List;

import static com.interviewdot.ILoveJavaProgramming.FoodType.FRUIT;
import static com.interviewdot.ILoveJavaProgramming.FoodType.MILK_PRODUCTS;
import static com.interviewdot.ILoveJavaProgramming.FoodType.VEGETABLE;

public class RemoveFruits {

    public static void main(String[] args) {
        List<Food> foods = new ArrayList<>();
        Food apple = new Food("apple", FRUIT);
        Food banana = new Food("banana", FRUIT);
        Food potato = new Food("potato", VEGETABLE);
        Food tomato = new Food("tomato", VEGETABLE);
        Food cheese = new Food("cheese", MILK_PRODUCTS);
        Food onion = new Food("onion", VEGETABLE);
        Food curd = new Food("curd", MILK_PRODUCTS);
        addFood(foods, apple, banana, potato, tomato, cheese, onion, curd);

        foods.removeIf(food -> food.foodType.equals(FRUIT));

        foods.forEach(System.out::println);
    }

    private static void addFood(
            List<Food> foods,
            Food apple,
            Food banana,
            Food potato,
            Food tomato,
            Food cheese,
            Food onion,
            Food curd
    ) {
        foods.add(apple);
        foods.add(banana);
        foods.add(potato);
        foods.add(tomato);
        foods.add(cheese);
        foods.add(onion);
        foods.add(curd);
    }

}

class Food {
    String name;
    FoodType foodType;

    Food(String name, FoodType foodType) {
        this.name = name;
        this.foodType = foodType;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

enum FoodType {
    VEGETABLE,
    FRUIT,
    MILK_PRODUCTS
}






