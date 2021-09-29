package ru.geekbrains.patternsLesson3.product.food;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Dessert implements Food {
    private Long id;
    private String title;
    private boolean GMO;
    private boolean gluten;
    private Double fatContent;
}
