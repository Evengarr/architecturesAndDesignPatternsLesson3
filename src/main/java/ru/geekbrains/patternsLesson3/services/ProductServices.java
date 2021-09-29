package ru.geekbrains.patternsLesson3.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.geekbrains.patternsLesson3.product.clothes.*;
import ru.geekbrains.patternsLesson3.product.electronics.*;
import ru.geekbrains.patternsLesson3.product.abstractFactory.AbstractProductFactory;
import ru.geekbrains.patternsLesson3.product.food.*;
import ru.geekbrains.patternsLesson3.repositories.ProductRepository;

import java.util.Optional;

import static ru.geekbrains.patternsLesson3.product.enums.TypeClothes.*;
import static ru.geekbrains.patternsLesson3.product.enums.TypeElectronics.*;
import static ru.geekbrains.patternsLesson3.product.enums.TypeFood.*;

@Service
@RequiredArgsConstructor
public class ProductServices {
    private final ProductRepository repository;
    AbstractProductFactory product;

    private static AbstractProductFactory getFactoryByTypeProduct(String type) {
        if (type.equals(COMPUTER) || type.equals(CONSOLE) || type.equals(TELEVISION)) {
            if (type.equals(TELEVISION)) return (AbstractProductFactory) new Television();
            if (type.equals(CONSOLE)) return (AbstractProductFactory) new Console();
            if (type.equals(COMPUTER)) return (AbstractProductFactory) new Computer();
        }
        if (type.equals(ACCESSORIES) || type.equals(JACKET) || type.equals(PANTS)) {
            if (type.equals(JACKET)) return (AbstractProductFactory) new Jacket();
            if (type.equals(ACCESSORIES)) return (AbstractProductFactory) new Accessories();
            if (type.equals(PANTS)) return (AbstractProductFactory) new Pants();

        }
        if (type.equals(BAKERY) || type.equals(DESSERT) || type.equals(MILKPRODUCT)) {
            if (type.equals(BAKERY)) return (AbstractProductFactory) new Bakery();
            if (type.equals(DESSERT)) return (AbstractProductFactory) new Dessert();
            if (type.equals(MILKPRODUCT)) return (AbstractProductFactory) new MilkProducts();
        }

        throw new RuntimeException("Продукт: " + type + " не обнаружен");

    }

    public Optional<AbstractProductFactory> findProductById(String type, Long id) {
        product = getFactoryByTypeProduct(type);
        return repository.findById(product, id);
    }

    public void deletedById(String type, Long id) {
        product = getFactoryByTypeProduct(type);
        repository.deleteById(product, id);
    }

    public AbstractProductFactory createdProduct(AbstractProductFactory product) {
        return repository.save(product);
    }
}
