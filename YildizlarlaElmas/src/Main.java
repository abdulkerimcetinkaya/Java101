import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Satır sayısını giriniz: ");
        int sayi = input.nextInt();

        // Üst kısım
        for (int i = 1; i <= sayi; i++) {
            // Boşluk ekleme
            for (int k = 1; k <= sayi - i; k++) {
                System.out.print(" ");
            }

            // Yıldız ekleme
            for (int j = 1; j < 2 * i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Alt kısım
        for (int i = sayi - 1; i >= 1; i--) {
            // Boşluk ekleme
            for (int k = 1; k <= sayi - i; k++) { // 66
                System.out.print(" ");
            }

            // Yıldız ekleme
            for (int j = 1; j < 2 * i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        input.close();
    }
}
