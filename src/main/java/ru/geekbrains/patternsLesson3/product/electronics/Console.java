package ru.geekbrains.patternsLesson3.product.electronics;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Console implements Electronics {
    private Long id;
    private String title;
    private String brand;
    private Integer HDD;
    private Integer RAM;
}
