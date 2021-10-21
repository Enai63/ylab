package tasks.leveltwo;

public class TaskSix {
    public static void main(String[] args) {
        System.out.println(max(100, 99));
        System.out.println(max(0, 4));
        System.out.println(max(-5, 10));
        System.out.println(max(7, 8));
        System.out.println(max(45, 45));
    }

    public static int max(int valueOne, int valueTwo) {
        return valueOne > valueTwo ? valueOne : valueTwo;
    }
}
