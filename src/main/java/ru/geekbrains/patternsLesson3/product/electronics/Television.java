package ru.geekbrains.patternsLesson3.product.electronics;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Television implements Electronics {
    private Long id;
    private String title;
    private String brand;
    private boolean smartTv;
    private boolean WiFi;
    private boolean HDMI;
    private Integer USB;
    private String OS;
}
