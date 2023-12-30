import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt();

        System.out.println("*************** 4'ün " + n + " sayısına kadar olan katları *******************");
        for(int i = 1; i <= n; i*=4){
            System.out.println(i);
        }

        System.out.println("*************** 5'in " + n + " sayısına kadar olan katları *******************");

        for (int j = 1; j <= n; j*=5){
            System.out.println(j);
        }

    }
}
