import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kullaniciAdi, parola;
        int bakiye = 1500;
        int secim;
        int kalanHak = 3;


        while (kalanHak > 0){
            System.out.print("Kullanıcı Adınızı Giriniz : ");
            kullaniciAdi = input.nextLine();
            System.out.print("Parolanızı Giriniz : ");
            parola = input.nextLine();

            if(kullaniciAdi.equals("123") && parola.equals("123")){
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1 - Para Yatırma\n2 - Para Çekme\n3 - Bakiye Sorgulama\n4 - Çıkış Yap");
                    System.out.print("Yapmak İstediğiniz İşlemi Seçiniz: ");
                    secim = input.nextInt();

                    switch (secim){
                        case 1:
                            System.out.println("Tutarınız: " + bakiye);
                            System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
                            int yatirilacakTutar;
                            yatirilacakTutar = input.nextInt();
                            bakiye += yatirilacakTutar;
                            System.out.println("Yeni tutarınız: " + bakiye);
                            break;

                        case 2:
                            int cekilecektutar;
                            System.out.println("Tutarınız: " + bakiye);
                            System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                            cekilecektutar = input.nextInt();
                            bakiye -= cekilecektutar;
                            System.out.println("Yeni tutarınız: " + bakiye);
                            if (bakiye < cekilecektutar){
                                System.out.println("Bakiyeniz Yetersiz");
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + bakiye);
                    }


                }while (secim != 4);
                System.out.println("Tekrar Görüşmek Üzere!");
                break;

            }else{
                kalanHak--;
                System.out.println("Giriş Bilgileri Hatalı. Tekrar Deneyiniz");
                if (kalanHak == 0){
                    System.out.println("Hesabınız Bloke Edildi.");
                }else {
                    System.out.println("Kalan Hakkınız : " + kalanHak);
                }
            }
        }
    }
}
