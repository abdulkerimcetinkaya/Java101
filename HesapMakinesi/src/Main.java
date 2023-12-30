import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Double sayi1,sayi2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hesap Makinesi");
        System.out.print("Birinci sayıyı giriniz: ");
        sayi1 = scanner.nextDouble();

        System.out.print("İkinci sayıyı giriniz: ");
        sayi2 = scanner.nextDouble();

        System.out.print("İşlemi seçiniz (+, -, *, /): ");
        char islem = scanner.next().charAt(0);

        double sonuc = 0;

        switch (islem) {
            case '+':
                sonuc = sayi1 + sayi2;
                break;
            case '-':
                sonuc = sayi1 - sayi2;
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                break;
            case '/':
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                } else {
                    System.out.println("Hata: Sıfıra bölme hatası!");
                    return;
                }
                break;
            default:
                System.out.println("Geçersiz işlem!");
                return;
        }

        System.out.println("Sonuç: " + sonuc);
    }
}
