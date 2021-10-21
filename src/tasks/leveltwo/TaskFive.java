package tasks.leveltwo;

/*
Минимум двух чисел
Написать функцию, которая возвращает минимум из двух чисел.
 */
public class TaskFive {
    public static void main(String[] args) {
        System.out.println(min(11, 21));
        System.out.println(min(45, 40));
        System.out.println(min(100, 99));
        System.out.println(min(-50, -45));

    }

    public static int min(int firstValue, int twoValue) {
        return firstValue < twoValue ? firstValue : twoValue;
    }
}
