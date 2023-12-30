import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

        -> Taksimetre KM başına 2.20 TL tutmaktadır.
        -> Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        -> Taksimetre açılış ücreti 10 TL'dir.
        */

        Scanner input = new Scanner(System.in);

        System.out.print("Gidilen Mesafeyi (KM) Giriniz: ");
        double mesafe = input.nextDouble();

        // Taksimetre açılış ücreti
        double acilisUcreti = 10.0;

        // KM başına ücret
        double kmBasinaUcret = 2.20;

        // Taksimetre tutarı hesapla
        double taksimetreTutari = acilisUcreti + (mesafe * kmBasinaUcret);

        // Minimum ödenecek tutar
        if (taksimetreTutari < 20.0) {
            taksimetreTutari = 20.0;
        }

        System.out.println("Taksimetre Tutarı: " + taksimetreTutari + " TL");
    }
}
