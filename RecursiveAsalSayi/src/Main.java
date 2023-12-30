import java.util.Scanner;

public class Main {

    static boolean isPrime(int n, int divisor) {
        // Sayının asal olup olmadığını kontrol eden rekürsif metot
        if (n <= 1) {
            // Eğer sayı 1 veya daha küçükse, asal değildir.
            return false;
        }

        if (n == 2) {
            // Eğer sayı 2 ise, asaldır.
            return true;
        }

        if (divisor * divisor > n) {
            // Eğer bölen n'in karekökünden büyük veya eşitse, asaldır.
            return true;
        }

        if (n % divisor == 0) {
            // Eğer sayı, bölenle bölünebiliyorsa, asal değildir.
            return false;
        }

        // Rekürsif durum: Bir sonraki bölenle devam et.
        return isPrime(n, divisor + 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int number = input.nextInt();

        if (isPrime(number, 2)) {
            System.out.println(number + " bir asal sayıdır.");
        } else {
            System.out.println(number + " bir asal sayı değildir.");
        }
    }
}
