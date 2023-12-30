import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,k,toplam = 1;

        System.out.print("Üssü alınacak sayıyı giriniz: ");
        n = input.nextInt();
        System.out.print("Üssü giriniz: ");
        k = input.nextInt();

        // n sayısını k kere çarp
        for (int i = 1; i <= k; i++){
            toplam *= n;

        }

        System.out.println(toplam);

    }
}
