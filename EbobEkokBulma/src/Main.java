import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi1,sayi2;
        int dongu = 1;
        int ebob = 0;
        int ekok = 0;

        System.out.print("1.Sayıyı giriniz : ");
        sayi1 = input.nextInt();

        System.out.print("2.Sayıyı giriniz : ");
        sayi2 = input.nextInt();

        // Ebob Bulma
        int kucukSayi = Math.min(sayi1,sayi2);
        while (dongu <= kucukSayi){
            if (sayi1 % dongu == 0 && sayi2 % dongu == 0){
                ebob = dongu;
            }
            dongu++;
        }

        // Ekok Bulma
        ekok = (sayi1 * sayi2) / ebob;

        System.out.println("Girdiğiniz Sayıların Ebob'u : " + ebob + "\nGirdiğiniz Sayıların Ekok'u : " + ekok );
    }
}
