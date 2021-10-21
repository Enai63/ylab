package tasks.levelone;

/*
Условие
1	Объявите переменные name1, name2, name3 типа String.
Сразу же в строке объявления присвойте им какие-нибудь значения.
Значениями могут быть любые строки.
2	Напиши программу, которая выводит на экран надпись:
«Когда я вырасту, то хочу быть паровым экскаватором!» 10 раз.

Раскоментируйте часть кода, чтобы на экран вывелось сообщение "Happy New Year"
 */

public class TaskOne {
    public static void main(String[] args) {
          String name1  = "Когда я вырасту, ";
          String name2 = "то хочу быть паровым ";
          String name3 = "экскаватором!";
        for (int i = 0; i < 10; i++) {
            System.out.println(name1 + name2 + name3);
        }
        String first = "Happy";
        String now = "New";
        String year = "Happy";

        System.out.println(first + " " + now + " " + year);
    }
}
