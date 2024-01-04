import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {2,5,32,-36,-52,45,1};

        Scanner input = new Scanner(System.in);
        System.out.print("Bir Değer Giriniz : ");
        int sayi = input.nextInt();

        int min = list[0];
        int max = list[0];

        for (int i : list){
            if (i < min){
                min = i;
            }
            if (i > max){
                max = i;
            }
        }

        for (int i : list){
            if ( i > sayi && i < max ){
                max = i;
            }
        }

        for (int i : list){
            if ( i < sayi && i > min ){
                min = i;
            }
        }

        System.out.println("--------------------------------------");
        System.out.println("Diziniz : " + Arrays.toString(list));
        System.out.println("Girdiğiniz Değer : " + sayi);
        System.out.println("Girdiğiniz sayıya en yakın küçük sayı : " + min);
        System.out.println("Girdiğiniz sayıya en yakın büyük sayı : " + max);
        System.out.println("--------------------------------------");
    }
}