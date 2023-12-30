import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int toplam = 0;
        int count = 0;

        System.out.print("Bir sayı Giriniz : ");
        int sayi = input.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                count++;
            }
        }

        if (count > 0) {
            System.out.println("3'e ve 4'e bölünebilen sayıların ortalaması : " + (toplam / count));
        } else {
            System.out.println("3'e ve 4'e bölünebilen sayı bulunamadı.");
        }
    }
}
