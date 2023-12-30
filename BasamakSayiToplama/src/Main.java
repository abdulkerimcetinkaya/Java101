import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*Basamak sayılarının toplamını bulan program
         * Kullanıcıdan alınan değer = sayi
         * kullanıcıdan alınan değeri döngüye sokarak 0'a eşit olana kadar modunu alma ve her defasında toplama ekleme*/

        int sayi, toplam = 0, sayac = 0;
        System.out.print("Bir sayı giriniz : ");
        sayi = input.nextInt();

        while(sayi != 0) {
            toplam += sayi % 10;
            sayi /= 10;
            sayac++;
        }

        System.out.println("Sayınız " + sayac + " basamaklı ve basamakların toplamı : " + toplam);
    }
}