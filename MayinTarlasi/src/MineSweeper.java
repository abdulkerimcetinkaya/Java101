import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber, colNumber;
    String[][] gameMap;
    String[][] mineMap;
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);

    // Constructer tanımlandı
    MineSweeper(int row, int column) {
        this.rowNumber = row;
        this.colNumber = column;
        this.gameMap = new String[row][column];
        this.mineMap = new String[row][column];
    }


    public void run() {
        // bomba sayacı adın da bir değişken tanımlandı ve satır ve sütün sayılarının çarpımının çeyreği kadar mayın oluşturuldu.
        int mineCount = (rowNumber * colNumber) / 4;
        prepareGame(mineCount);
        // oyuna hazırlık fonksiyonu parametre olarak bomba sayacını aldı.
        print(gameMap);
        // yazdırma fonksiyonu paratmetre olarak oyun haritasını aldı.
        while (true) {
            System.out.println("Bir nokta seçin (satır sütun): ");
            int row = scan.nextInt();
            // satır sayısı alındı.
            int col = scan.nextInt();
            // sütün sayısı alındı.
            if (row < 0 || row >= rowNumber || col < 0 || col >= colNumber) {
                System.out.println("Geçersiz koordinatlar, tekrar deneyin.");
                continue;
                // satır 0'dan küçükse veya satır rowNumber'dan büyük eşitse veya sütün 0'dan küçükse veya sütün colNumber'dan büyük eşitse
                // Geçersiz koordinatlar, tekrar deneyin. yazdır ve devam et
            }
            if (gameMap[row][col] != " - ") {
                System.out.println("Bu koordinat daha önce seçildi, başka bir koordinat girin.");
                continue;

            }
            if (mineMap[row][col] == " * ") {
                System.out.println("Mayına bastınız! Oyunu kaybettiniz.");
                print(mineMap);
                break;
            } else {
                gameMap[row][col] = checkMines(row, col);
                print(gameMap);
                if (isWin()) {
                    System.out.println("Tebrikler! Tüm mayınlardan kaçındınız ve oyunu kazandınız.");
                    break;
                }
            }
        }
    }

    public void prepareGame(int mineCount){
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                gameMap[i][j] = " - ";
                mineMap[i][j] = " - ";
            }
        }
        while (mineCount > 0) {
            int row = rand.nextInt(rowNumber);
            int col = rand.nextInt(colNumber);
            if (mineMap[row][col] != " * ") {
                mineMap[row][col] = " * ";
                mineCount--;
            }
        }
    }

    public void print(String[][] map) {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }

    public String checkMines(int row, int col) {
        int count = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (row + i >= 0 && row + i < rowNumber && col + j >= 0 && col + j < colNumber) {
                    if (mineMap[row + i][col + j] == " * ") {
                        count++;
                    }
                }
            }
        }
        return String.valueOf(count);
    }

    public boolean isWin() {
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) {
                if (gameMap[i][j] == " - " && mineMap[i][j] != " * ") {
                    return false;
                }
            }
        }
        return true;
    }
}
