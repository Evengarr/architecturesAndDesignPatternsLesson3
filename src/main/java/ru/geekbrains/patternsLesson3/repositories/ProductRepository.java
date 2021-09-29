package ru.geekbrains.patternsLesson3.repositories;

import org.springframework.stereotype.Repository;
import ru.geekbrains.patternsLesson3.product.abstractFactory.AbstractProductFactory;

import java.util.Optional;

@Repository
public interface ProductRepository {

    Optional<AbstractProductFactory> findById(AbstractProductFactory product, Long id);

    void deleteById(AbstractProductFactory product, Long id);

    AbstractProductFactory save(AbstractProductFactory product);
}