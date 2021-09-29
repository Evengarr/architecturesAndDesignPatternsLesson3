package ru.geekbrains.patternsLesson3.product.abstractFactory;

import ru.geekbrains.patternsLesson3.product.food.Bakery;
import ru.geekbrains.patternsLesson3.product.food.Dessert;
import ru.geekbrains.patternsLesson3.product.food.MilkProducts;

public class FoodFactory implements AbstractProductFactory{
    public Bakery createdBakery() {
        return new Bakery();
    }

    public Dessert createdDesserts() {
        return new Dessert();
    }

    public MilkProducts createdMilkProducts() {
        return new MilkProducts();
    }
}
