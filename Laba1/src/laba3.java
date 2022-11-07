import java.util.Scanner;
public class laba3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = in.nextInt();
        System.out.print("Введите число: ");
        int b = in.nextInt();
        System.out.print("Введите число: ");
        int c = in.nextInt();
        System.out.print("Введите число: ");
        int d = in.nextInt();
        System.out.print("Введите число: ");
        int x = in.nextInt();
        int min =0;
        int max= 0;
    
        if (a<b&&a<c&&a<d&&a<x)min =a;
        else if (b<a&&b<c&&b<d&&b<x)min =b;
        else if (c<a&&c<b&&c<d&&c<x)min =c;
        else if (d<a&&d<c&&d<b&&d<x)min =d;
        else if (x<a&&x<c&&x<d&&x<b)min =x;
        System.out.println("Наменьшее:"+ min);
    
        if (a>b&&a>c&&a>d&&a>x)max =a;
        else if (b>a&&b>c&&b>d&&b>x)max =b;
        else if (c>a&&c>b&&c>d&&c>x)max =c;
        else if (d>a&&d>c&&d>b&&d>x)max =d;
        else if (x>a&&x>c&&x>d&&x>b)max =x;
        System.out.println("Наибольшее:"+ max);
        in.close();
}
}