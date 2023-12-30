import java.util.Scanner;

public class Main {

    public static void patternMethods(int sayi){
        // Temel durum: sayi 0 veya negatifse işlemi sonlandır
        if (sayi <= 0) {
            System.out.print(sayi + " ");
        } else {
            // Çıkarma işlemi ve sonucu ekrana yazdır
            System.out.print(sayi + " ");
            patternMethods(sayi - 5);

            // Ekleme işlemi ve sonucu ekrana yazdır
            System.out.print(sayi + " ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan n değerini al
        System.out.print("Bir sayı girin: ");
        int n = input.nextInt();

        // Recursive metodu çağır
        patternMethods(n);
    }
}
