package ru.geekbrains.patternsLesson3.product.abstractFactory;

import ru.geekbrains.patternsLesson3.product.electronics.Computer;
import ru.geekbrains.patternsLesson3.product.electronics.Console;
import ru.geekbrains.patternsLesson3.product.electronics.Television;

public class ElectronicFactory implements AbstractProductFactory{
    public Computer createdComputers() {
        return new Computer();
    }

    public Console createdConsoles() {
        return new Console();
    }

    public Television createdTelevisions() {
        return new Television();
    }
}
