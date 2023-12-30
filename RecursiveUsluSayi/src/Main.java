import java.util.Scanner;

public class Main {

    static int power(int x,int y){
        if (y > 0 ){
            return x * power(x, y-1);
        }else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Taban değerini giriniz : ");
        int base = input.nextInt();

        System.out.print("Üs değerini giriniz : ");
        int exponent = input.nextInt();

        int result = power(base , exponent);
        System.out.println("Sonuç : " +result);
    }
}