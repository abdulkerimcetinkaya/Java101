import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Girilen sayının harmoniğini hesaplama
        Scanner input = new Scanner(System.in);

        int sayi;
        double sonuc = 0;
        System.out.print("Bir N Sayısı Giriniz: ");
        sayi = input.nextInt();

        for (double i = 1; i <= sayi; i++){
            sonuc += (1.0 /i);
        }

        System.out.println(sonuc);
    }
}
