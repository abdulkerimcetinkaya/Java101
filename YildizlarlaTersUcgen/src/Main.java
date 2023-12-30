import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int sayi = input.nextInt();


        for (int i = sayi; i >= 1; i--){
            // Boşluk koyma
            for (int k = 1; k <= sayi - i; k++){
                System.out.print(" ");
            }

            // yıldız koyma
            for (int j = 1; j <= 2 * i - 1; j++ ){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
