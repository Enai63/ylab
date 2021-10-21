package tasks.leveltwo;

/*
Закоментарь несколько строк, чтобы на экран вывелось число 19
*/
public class TaskTwo {
    public static void main(String[] args) {
        int x = 1;     /* это число 1 */
        int y = 0;      /* это число 0 */

        y = y + 3 * x;
        //    x = x * 2;
        x = x * 16;
        //   y = y + 2 * x;
        y = y + x;
        /* не наш вариант */
        System.out.println(y);
    }
}
