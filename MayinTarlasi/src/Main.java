import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Mayın Tarlasına Hoşgeldiniz\nLütfen Boyutları Giriniz");
        int row,column;
        System.out.print("Satır Sayısını Giriniz: " );
        row = scan.nextInt();
        System.out.print("Sütün Sayısını Giriniz: ");
        column = scan.nextInt();

        // MineSweeper game = new MineSweeper(row,column);
        MineSweeper game = new MineSweeper(row, column);
        game.run();
    }
}