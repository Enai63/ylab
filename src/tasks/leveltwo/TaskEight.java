package tasks.leveltwo;
/*
Минимум четырёх чисел
Написать функцию, которая вычисляет минимум из четырёх чисел.
Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b)
 */
public class TaskEight {
    public static void main(String[] args) {
        System.out.println(minFourNumbers(1, 2 , 3, 5));
        System.out.println(minFourNumbers(2, 2, 3 ,7));
        System.out.println(minFourNumbers(4, 5, 10, -4));
    }

    public static int minFourNumbers(int valueOne, int valueTwo, int valueThree, int valueFour) {
        int firstMin = min(valueOne, valueTwo);
        int twoMin = min(valueThree, valueFour);
        return min(firstMin, twoMin);
    }

    public static int min(int firstValue, int twoValue) {
        return firstValue < twoValue ? firstValue : twoValue;
    }
}
