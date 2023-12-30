import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, enBuyuk = 0, enKucuk = 0;
        System.out.print("Kaç Adet sayı Gireceksiniz ? ");
        int sayac = input.nextInt();

        for (int i = 1; i <= sayac; i++){
            System.out.print(i+".Sayıyı giriniz : ");
            sayi = input.nextInt();

            if (i == 1){
                enBuyuk = sayi;
                enKucuk = sayi;
            }

            if (sayi > enBuyuk){
                enBuyuk = sayi;
            }

            if (sayi < enKucuk){
                enKucuk = sayi;
            }


        }

        System.out.println("En Büyük Değer : " + enBuyuk);
        System.out.println("En Küçük Değer : " + enKucuk);
    }
}
