import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin Boyutunu Giriniz : ");
        int dizi = input.nextInt();
        int sayi;


        int[] list = new int[dizi];
        for (int i = 0; i < list.length; i++){
            System.out.print("Dizinin " + (i+1) + ". Elemanı : ");
            sayi = input.nextInt();
            list[i] = sayi;

        }
        Arrays.sort(list);
        System.out.println("Sıralama : " + Arrays.toString(list));

    }
}