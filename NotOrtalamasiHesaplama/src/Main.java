import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /*
        Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve
        ortalamalarını hesaplayıp ekrana bastırılan programı yazın. Ödev
        Aynı program içerisinde koşullu ifadeler kullanılarak,
        eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" ,
        küçük ise "Sınıfta Kaldı" yazsın.

        Not : If ve Else kullanılmayacak...
         */

        int matemaik,turkce,kimya,fizik,muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        matemaik = input.nextInt();

        System.out.print("Türkçe notunuz : ");
        turkce = input.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();

        System.out.print("Müzik notunuz : ");
        muzik = input.nextInt();

        double avarage = (matemaik + turkce + kimya + fizik + muzik) / 5;
        System.out.println("Ortalamanız : " + avarage);

    }
}