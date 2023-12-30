import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dogumYili,zodyak;
        System.out.print("Doğum Yılınızı Giriniz: ");
        dogumYili = input.nextInt();
        zodyak = dogumYili % 12;

        if (zodyak % 12 == 0) {
            System.out.println("Çin zodyağı burcunuz: Maymun ");
        } else if (zodyak == 1) {
            System.out.println("Çin zodyağı burcunuz: Horoz");
        } else if (zodyak == 2) {
            System.out.println("Çin zodyağı burcunuz: Köpek");
        } else if (zodyak == 3) {
            System.out.println("Çin zodyağı burcunuz: Domuz");
        } else if (zodyak == 4) {
            System.out.println("Çin zodyağı burcunuz: Fare");
        } else if (zodyak == 5) {
            System.out.println("Çin zodyağı burcunuz: Öküz");
        } else if (zodyak == 6) {
            System.out.println("Çin zodyağı burcunuz: Kaplan");
        } else if (zodyak == 7) {
            System.out.println("Çin zodyağı burcunuz: Tavşan");
        } else if (zodyak == 8) {
            System.out.println("Çin zodyağı burcunuz: Ejderha");
        } else if (zodyak == 9) {
            System.out.println("Çin zodyağı burcunuz: Yılan");
        } else if (zodyak == 10) {
            System.out.println("Çin zodyağı burcunuz: At");
        } else if (zodyak == 11) {
            System.out.println("Çin zodyağı burcunuz: Koyun");
        }
    }
}
