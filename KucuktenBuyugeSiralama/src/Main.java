import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c,d,min,max;
        Scanner input = new Scanner(System.in);

        System.out.print("1.Sayı : ");
        a = input.nextInt();

        System.out.print("2.Sayı : ");
        b = input.nextInt();

        System.out.print("3.Sayı : ");
        c = input.nextInt();

        min = Math.min(Math.min(a, b), c);
        max = Math.max(Math.max(a, b), c);

        int middle = a + b + c - min - max;

        System.out.println("Girilen sayılar küçükten büyüğe sıralı: " + min + " < " + middle + " < " + max);
    }
}
