import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int birinciSayi = 0, ikinciSayi = 1, ucuncusayi,n;

        System.out.print("Bir N Sayısı Giriniz : ");
        n = input.nextInt();

        for (int i = 1; i <=n; i++){
            System.out.print(birinciSayi + ",");
            ucuncusayi = birinciSayi + ikinciSayi;
            birinciSayi = ikinciSayi;
            ikinciSayi = ucuncusayi;
        }


    }
}
