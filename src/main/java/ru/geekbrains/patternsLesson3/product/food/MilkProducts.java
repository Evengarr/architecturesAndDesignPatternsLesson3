package ru.geekbrains.patternsLesson3.product.food;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MilkProducts implements Food {
    private Long id;
    private String title;
    private boolean lactose;
    private boolean GMO;
    private Double fatness;
}
