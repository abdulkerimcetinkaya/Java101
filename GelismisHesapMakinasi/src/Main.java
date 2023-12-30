import java.util.Scanner;

public class Main {

    // Toplama Metodu
    static void add(){
        Scanner input = new Scanner(System.in);
        System.out.print("KAÇ ADET SAYI GİRECEKSİNİZ ? : ");
        int counter = input.nextInt();
        int number, result = 0;

        for (int i = 1; i<= counter;i++){
            System.out.print(i + ". Sayı : ");
            number = input.nextInt();
            if(i == 0){
                result += number;
                continue;
            }
            result += number;
        }
        System.out.println("İŞLEM SONUCUNUZ : " + result);
    }

    // Çıkarma Metodu
    static void sub(){
        Scanner input = new Scanner(System.in);
        System.out.print("KAÇ ADET SAYI GİRECEKSİNİZ ? : ");
        int counter = input.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı : ");
            number = input.nextInt();
            result -= number;
        }

        System.out.println("İŞLEM SONUCUNUZ : " + result);
    }

    // Çarpma İşlemi
    static void multi(){
        Scanner input = new Scanner(System.in);
        System.out.print("KAÇ ADET SAYI GİRECEKSİNİZ ? : ");
        int counter = input.nextInt();
        int number, result = 1;

        for (int i = 1; i<= counter; i++){
            System.out.print(i + ". Sayı : ");
            number = input.nextInt();
            if (number == 0){
                result = 0;
            }else {
                result *= number;
            }
        }
        System.out.println("İŞLEM SONUCUNUZ : " + result);
    }
    // Bölme İşlemi
    static void divide() {
        Scanner input = new Scanner(System.in);
        System.out.print("Bölmek istediğiniz sayıyı giriniz: ");
        int dividend = input.nextInt();

        System.out.print("Böleni giriniz: ");
        int divisor = input.nextInt();

        if (divisor == 0) {
            System.out.println("Sıfıra bölme hatası! İkinci sayıyı sıfır giremezsiniz.");
            return;
        }

        int result = dividend / divisor;
        System.out.println("Sonuç: " + result);
    }
    // Üs Alma İşlemi
    static void power() {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini giriniz : ");
        int base = input.nextInt();
        System.out.print("Üs değerini giriniz : ");
        int exponent = input.nextInt();
        int result = 1;

        if (exponent < 0) {
            System.out.println("Üs değeri negatif olamaz.");
            return; // Hata durumunda metoddan çık
        }

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println("Sonuç : " + result);
    }
    // Mod Alma İşlemi
    static void mod(){
        Scanner input = new Scanner(System.in);
        int result = 0;
        System.out.print("İlk Sayıyı giriniz : ");
        int a= input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        int b = input.nextInt();
        result = a%b;

        System.out.println("Cevap : " + result);
    }
    // Dikdörtgen Alan ve Çevre Hesaplama
    static void calc(){
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz : ");
        int a = input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        int b = input.nextInt();
        System.out.println("Dikdörtgenin alanı : " + (a * b));
        System.out.println("Dikdörtgenin çevresi : " + (2 *(a + b)) );
    }

    public static void main(String[] args) {
        int select;
        Scanner input = new Scanner(System.in);

        String menu =
                "1 - Toplama İşlemi\n" +
                        "2 - Çıkarma İşlemi\n" +
                        "3 - Çarpma İşlemi\n" +
                        "4 - Bölme İşlemi\n" +
                        "5 - Üslü Sayı Alma İşlemi\n" +
                        "6 - Mod Alma İşlemi\n" +
                        "7 - Dikdörtgen Alan ve Çevre Hesaplama\n" +
                        "0 - Çıkış Yap ";

        System.out.println(menu);

        while(true){
            System.out.println("============================================");
            System.out.print("BİR İŞLEM SEÇİNİZ : ");
            select = input.nextInt();

            if (select == 0){
                break;
            }
            switch (select){
                case 1 :
                    add();
                    break;
                case 2 :
                    sub();
                    break;
                case 3 :
                    multi();
                    break;
                case 4 :
                    divide();
                    break;
                case 5 :
                    power();
                    break;
                case 6 :
                    mod();
                    break;
                case 7 :
                    calc();
                default:
                    System.out.println("Geçersiz işlem numarası girdiniz!");

            }
        }
    }
}