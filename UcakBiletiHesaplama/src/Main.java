import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
        Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
        Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve
        sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

        -> Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
           Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        -> Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        -> Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        -> Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        -> Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
        */

        // Mesafe, yaş ve yolculuk tipi bilgilerini kullanıcıdan alın
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        int mesafe = scanner.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        int yas = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        int yolculukTipi = scanner.nextInt();

        // Girdi doğrulama kontrolü
        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
            return;
        }

        // Normal Tutar
        double normalTutar = mesafe * 0.10;

        // Yaş İndirimi
        double yasIndirimi = normalTutar * 0.10;

        // İndirimli Tutar
        double indirimliTutar = normalTutar - yasIndirimi;

        // Gidiş-Dönüş Bilet İndirimi
        double gidisDonusIndirimi = indirimliTutar * 0.20;

        // Toplam Tutar
        double toplamTutar = (indirimliTutar - gidisDonusIndirimi) * (yolculukTipi == 2 ? 2 : 1);

        // Sonuçları yazdır
        System.out.println("Normal Tutar = " + normalTutar + " TL");
        System.out.println("Yaş İndirimi = " + yasIndirimi + " TL");
        System.out.println("İndirimli Tutar = " + indirimliTutar + " TL");
        System.out.println("Gidiş Dönüş Bilet İndirimi = " + gidisDonusIndirimi + " TL");
        System.out.println("Toplam Tutar = " + toplamTutar + " TL");


    }
}
