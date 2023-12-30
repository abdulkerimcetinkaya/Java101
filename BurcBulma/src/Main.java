import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int gun,ay;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum gününüzün gününü giriniz: ");
        gun = input.nextInt();

        System.out.print("Doğum ayınızı giriniz: ");
        ay = input.nextInt();

        if ((ay == 3 && gun >= 21 && gun <= 31) || (ay == 4 && gun >= 1 && gun <= 20)) {
            System.out.println("Koç Burcu");
        } else if ((ay == 4 && gun >= 21 && gun <= 30) || (ay == 5 && gun >= 1 && gun <= 21)) {
            System.out.println("Boğa Burcu");
        } else if ((ay == 5 && gun >= 22 && gun <= 31) || (ay == 6 && gun >= 1 && gun <= 22)) {
            System.out.println("İkizler Burcu");
        } else if ((ay == 6 && gun >= 23 && gun <= 30) || (ay == 7 && gun >= 1 && gun <= 22)) {
            System.out.println("Yengeç Burcu");
        } else if ((ay == 7 && gun >= 23 && gun <= 31) || (ay == 8 && gun >= 1 && gun <= 22)) {
            System.out.println("Aslan Burcu");
        } else if ((ay == 8 && gun >= 23 && gun <= 31) || (ay == 9 && gun >= 1 && gun <= 22)) {
            System.out.println("Başak Burcu");
        } else if ((ay == 9 && gun >= 23 && gun <= 30) || (ay == 10 && gun >= 1 && gun <= 22)) {
            System.out.println("Terazi Burcu");
        } else if ((ay == 10 && gun >= 23 && gun <= 31) || (ay == 11 && gun >= 1 && gun <= 21)) {
            System.out.println("Akrep Burcu");
        } else if ((ay == 11 && gun >= 22 && gun <= 30) || (ay == 12 && gun >= 1 && gun <= 21)) {
            System.out.println("Yay Burcu");
        } else if ((ay == 12 && gun >= 22 && gun <= 31) || (ay == 1 && gun >= 1 && gun <= 21)) {
            System.out.println("Oğlak Burcu");
        } else if ((ay == 1 && gun >= 22 && gun <= 31) || (ay == 2 && gun >= 1 && gun <= 19)) {
            System.out.println("Kova Burcu");
        } else if ((ay == 2 && gun >= 20 && gun <= 29) || (ay == 3 && gun >= 1 && gun <= 20)) {
            System.out.println("Balık Burcu");
        } else {
            System.out.println("Geçersiz tarih");
        }
    }
}
