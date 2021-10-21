package tasks.leveltwo;

import tasks.leveltwo.classesfortask.Cat;
import tasks.leveltwo.classesfortask.Fish;
import tasks.leveltwo.classesfortask.Person;
import tasks.leveltwo.classesfortask.Women;

/*
Создайте объект типа Cat(кот), объект типа Dog (собака), объект типа Fish (рыбка) и объект типа Woman.
Присвойте каждому животному владельца (owner).
 */
public class TaskFour {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setOwner(new Person("Vasya", 11));

        Fish fish = new Fish();
        fish.setOwner(new Person("Max", 12));

        Women women = new Women();
        women.setOwner(new Person("Husband", 33));

    }
}
