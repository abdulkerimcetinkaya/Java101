import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklık değeri giriniz: ");
        int sicaklik = input.nextInt();

        String onerilenEtkinlik = (sicaklik < 5) ? "Kayak yapabilirsin."
                : (sicaklik < 15) ? "Sinemaya gidebilirsin."
                : (sicaklik < 25) ? "Pikniğe gidebilirsin."
                : "Yüzmeye gidebilirsin.";

        System.out.println(onerilenEtkinlik);
    }
}
