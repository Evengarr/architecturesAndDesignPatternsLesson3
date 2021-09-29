package ru.geekbrains.patternsLesson3.product.electronics;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Computer implements Electronics {
    private Long id;
    private String title;
    private String color;
    private String brand;
    private Integer RAM;
    private Integer HDD;
    private Double CPU;
}
