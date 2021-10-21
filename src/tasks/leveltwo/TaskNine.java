package tasks.leveltwo;

/*
Дублирование строки
Написать функцию, которая выводит переданную строку на экран три раза, каждый раз с новой строки.
 */
public class TaskNine {
    public static void main(String[] args) {
        functionDoubleString("Java Must have");
    }
    
    public static void functionDoubleString(String value) {
        for (int i = 0; i < 3; i++) {
            System.out.println(value);
        }
    }
}
