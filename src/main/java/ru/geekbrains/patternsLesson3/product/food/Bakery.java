package ru.geekbrains.patternsLesson3.product.food;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Bakery implements Food {
    private Long id;
    private String title;
    private boolean antibiotics;
    private boolean thickener;

}
