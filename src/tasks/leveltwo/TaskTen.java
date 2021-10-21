package tasks.leveltwo;

/*
Вывод текста на экран
Написать функцию, которая выводит переданную строку (слово) на экран три раза, но в одной строке.
Слова должны быть разделены пробелом и не должны сливаться в одно.
 */
public class TaskTen {
    public static void main(String[] args) {
        funcPrintStringThreeTime("Java Must have");
    }

    private static void funcPrintStringThreeTime(String value) {
        for (int i = 0; i < 3; i++) {
            System.out.printf("%s ", value);
        }
    }
}
