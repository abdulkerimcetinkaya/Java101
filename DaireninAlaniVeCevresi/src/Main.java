import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        Pi sayısını = 3.14 alınız.
        Formül : (𝜋 * (r*r) * 𝛼) / 360
         */
        double yaricap,merkezAcisi,daireDilimiAlani;

        Scanner input = new Scanner(System.in);

        // π sayısı
        double pi = 3.14;

        System.out.print("Yarıçapı (r) Giriniz: ");
        yaricap = input.nextDouble();

        System.out.print("Merkez Açısının Ölçüsü (𝛼) Giriniz: ");
        merkezAcisi = input.nextDouble();

        // Daire dilimi alanını hesapla
        daireDilimiAlani = (pi * (yaricap * yaricap) * merkezAcisi) / 360;

        System.out.println("Daire Dilimi Alanı: " + daireDilimiAlani);
    }
}
