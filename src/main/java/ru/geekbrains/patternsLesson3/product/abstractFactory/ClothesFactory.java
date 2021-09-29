package ru.geekbrains.patternsLesson3.product.abstractFactory;

import ru.geekbrains.patternsLesson3.product.clothes.Accessories;
import ru.geekbrains.patternsLesson3.product.clothes.Jacket;
import ru.geekbrains.patternsLesson3.product.clothes.Pants;

public class ClothesFactory implements AbstractProductFactory{
    public Accessories createdAccessories() {
        return new Accessories();
    }

    public Jacket createdJackets() {
        return new Jacket();
    }

    public Pants createdPants() {
        return new Pants();
    }
}
