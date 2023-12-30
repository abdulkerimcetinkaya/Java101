import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int toplam = 0, sayi;

        System.out.print("Sayı adedi giriniz: ");
        int adet = input.nextInt();

        for (int i = 0; i < adet; i++) {
            System.out.print("Bir sayı giriniz: ");
            sayi = input.nextInt();

            if (sayi % 2 == 0 && sayi % 4 == 0) {
                toplam += sayi;
            }
        }

        System.out.println("Girilen çift ve 4'ün katları olan sayıların toplamı: " + toplam);
    }
}