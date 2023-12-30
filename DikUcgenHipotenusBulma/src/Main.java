import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
        */

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci kenar uzunluğunu giriniz: ");
        double a = input.nextDouble();

        System.out.print("İkinci kenar uzunluğunu giriniz: ");
        double b = input.nextDouble();

        System.out.print("Üçüncü kenar uzunluğunu giriniz: ");
        double c = input.nextDouble();

        // Üçgenin çevresi
        double u = (a + b + c) / 2;

        // Alan hesaplama
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin Alanı: " + alan);
    }
}
