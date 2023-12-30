import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi, sayac = 1, toplam = 0;

        System.out.print("Sayı Giriniz : ");
        sayi = input.nextInt();

        while (sayac <= sayi / 2){
            if (sayi % sayac == 0){
                toplam += sayac;
            }
            sayac++;
        }

        if (sayi == toplam){
            System.out.println(sayi + " Bir Mükemmel Sayıdır.");
        }else {
            System.out.println(sayi + " Bir Mükemmel Sayı Değildir!");
        }


    }
}
