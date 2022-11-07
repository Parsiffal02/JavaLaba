import java.util.Scanner;

public class laba2 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = in.nextInt();
        System.out.print("Введите число: ");
        int b = in.nextInt();
        System.out.print("Введите число: ");
        int c = in.nextInt();
        System.out.print("Введите число: ");
        int d = in.nextInt();
if (a >= b && a >= c && a > d) {
    System.out.println(a);
} else if (b >= a && b >= c && b >= d) {
    System.out.println(b);
} else if (c >= a && c >= b && c >= d) {
    System.out.println(c);
} else if (d >= a && d >= b && d >= c) {
    System.out.println( "Максимальное число= " +d);
    in.close();
}
    }
}