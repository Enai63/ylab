package tasks.leveltwo;
/*
Минимум трёх чисел
Написать функцию, которая вычисляет минимум из трёх чисел.
 */
public class TaskSeven {
    public static void main(String[] args) {

        System.out.println(minThreeNumber(1, 2, 3));
        System.out.println(minThreeNumber(3, 4, 5));
        System.out.println(minThreeNumber(2, 2, 5));
        System.out.println(minThreeNumber(-5, -2, 5));

    }

    public static int minThreeNumber(int firstValue, int twoValue, int threeValue) {
        int result = 0;
        if (firstValue < twoValue) {
            result = firstValue < threeValue ? firstValue : threeValue;
        } else {
            result = twoValue < threeValue ?  twoValue : threeValue;
        }
        return result;
    }
}
