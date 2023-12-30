import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan n ve r değerlerini al
        System.out.print("n değerini girin: ");
        int n = scanner.nextInt();

        System.out.print("r değerini girin: ");
        int r = scanner.nextInt();

        // Kombinasyonu hesapla ve ekrana yazdır
        if (r > n || n < 0 || r < 0) {
            System.out.println("Geçersiz giriş! n ve r pozitif tamsayılar olmalıdır, r <= n.");
        } else {
            long kombinasyonSonuc = 1;

            // n! / r!
            for (int i = n; i > r; i--) {
                kombinasyonSonuc *= i;
            }

            // (n-r)!
            for (int i = 1; i <= (n - r); i++) {
                kombinasyonSonuc /= i;
            }

            System.out.println("C(" + n + "," + r + ") = " + kombinasyonSonuc);
        }
    }
}
