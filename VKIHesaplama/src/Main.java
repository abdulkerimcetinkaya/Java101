import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kilo (kg) / Boy(m) * Boy(m)

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        double boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        double kilo = input.nextDouble();

        // Vücut Kitle İndeksi hesapla
        double vucutKitleIndeksi = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz: " + vucutKitleIndeksi);
    }
}
