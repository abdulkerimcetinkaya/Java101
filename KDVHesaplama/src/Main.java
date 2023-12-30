import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
        tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı
        hesaplayan programı yazınız.
         */
        Scanner input = new Scanner(System.in);

        System.out.print("Tutarı giriniz (TL): ");
        double tutar = input.nextDouble();

        double kdvOrani;

        if (tutar >= 0 && tutar <= 1000) {
            kdvOrani = 0.18;
        } else {
            kdvOrani = 0.08;
        }

        double kdvTutari = tutar * kdvOrani;
        double toplamTutar = tutar + kdvTutari;

        System.out.println("KDV Oranı: %" + (kdvOrani * 100));
        System.out.println("KDV Tutarı: " + kdvTutari + " TL");
        System.out.println("Toplam Tutar: " + toplamTutar + " TL");
    }
}
