import java.util.Scanner;

public class laba1 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("ВВедите число: ");
        int a = in.nextInt();
        System.out.print("Введите число: ");
        int b = in.nextInt();
        System.out.print("Введите число: ");
        int c = in.nextInt();
        System.out.print("Введите число: ");
        int d = in.nextInt();
        int x =0;
        if (a<b &a<c&a<d)x =a;

            else if (b<a&b<c&b<d)x =b;
                else if (c<a&c<b&c<d)x =c;
                    else if (d<b&d<c&d<a)x =d;

                        System.out.println( "Минимальное число= " +x);
                        in.close();
    }
            }
