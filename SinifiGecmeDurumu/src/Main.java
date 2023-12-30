import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int matematik,turkce,kimya,fizik,muzik;
        int toplam = 0, dersSayisi = 0;

        System.out.print("Matematik notunuz : ");
        matematik = input.nextInt();

        System.out.print("Türkçe notunuz : ");
        turkce = input.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();

        System.out.print("Müzik notunuz : ");
        muzik = input.nextInt();

        if (matematik >= 0 && matematik <= 100){
            toplam += matematik;
            dersSayisi++;
        }

        if (turkce >= 0 && turkce <= 100){
            toplam += turkce;
            dersSayisi++;
        }

        if (kimya >= 0 && kimya <= 100){
            toplam += kimya;
            dersSayisi++;
        }

        if (fizik >= 0 && fizik <= 100){
            toplam += fizik;
            dersSayisi++;
        }

        if (muzik >= 0 && muzik <= 100){
            toplam += muzik;
            dersSayisi++;
        }

        int ortlama = toplam/dersSayisi;
        if (ortlama >=55){
            System.out.println("Tebrikler Geçtiniz!\nOrtalamanız : " + ortlama);
        }else {
            System.out.println("Sınıfta Kaldınız.\nOrtalamanız : " + ortlama);
        }

    }
}
