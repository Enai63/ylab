package tasks.leveltwo;

import tasks.leveltwo.classesfortask.Cat;
import tasks.leveltwo.classesfortask.Dog;

/*
Условие
1
Создать объект типа Cat 2 раза.

2
Создать 3 объекта типа Dog (собака) и присвоить им имена "Max", "Bella", "Jack".

3
Напиши программу, которая выводит на экран надпись: «Мне так плохо! Хочу, чтобы все умерли!».

 */
public class TaskOne {
    public static void main(String[] args) {
        Cat tom = new Cat();
        Cat kuzya = new Cat();

        Dog max = new Dog(1, "Max");
        Dog bella = new Dog(2, "Bella");
        Dog jack = new Dog(3, "Jack");

        System.out.println("Мне так плохо! Хочу, чтобы все умерли!");

    }
}
