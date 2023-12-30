import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // kullanıcı adı ve şifre
        String KullaniciAdi = "Kerim";
        String Sifre = "1234";

        System.out.print("Kullanıcı Adınızı giriniz: ");
        String girilenKullaniciAdi = scanner.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        String girilenSifre = scanner.nextLine();

        if (girilenKullaniciAdi.equals(KullaniciAdi) && girilenSifre.equals(Sifre)) {
            System.out.println("Giriş başarılı!");
        } else {
            System.out.println("Kullanıcı adı veya şifre yanlış.");

            System.out.print("Şifrenizi sıfırlamak ister misiniz? (Evet/Hayır): ");
            String sifreSifirla = scanner.nextLine();

            if (sifreSifirla.equalsIgnoreCase("Evet")) {
                System.out.print("Yeni şifrenizi giriniz: ");
                String yeniSifre = scanner.nextLine();

                // Eski şifre ile yeni şifrenin aynı olup olmadığını kontrol et
                if (!yeniSifre.equals(Sifre)) {
                    System.out.println("Şifre oluşturuldu.");
                } else {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
            } else {
                System.out.println("Şifre sıfırlama işlemi iptal edildi.");
            }
        }
    }
}
