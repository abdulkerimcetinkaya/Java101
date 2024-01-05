import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] list = {10,10,10,20,20,20,50,50,50,50,30,30,30,90,90,70,70};

        // frekansları saklamak için hashmap kullanımı
        Map<Integer,Integer> frekanslar = new HashMap<>();

        // Dizi üzerinde gezinerek frekansları hesapla

        for (int eleman : list){
            if (frekanslar.containsKey(eleman)){
                // Eleman zaten haritada varsa, frekansı bir artır
                frekanslar.put(eleman, frekanslar.get(eleman) + 1);

            }else {
                // eleman haritada yoksa yeni bir giriş oluştur.
                frekanslar.put(eleman,1);
            }
        }


        // sonuçlar ekrana yazdırıldı
        for (Map.Entry<Integer,Integer> entry : frekanslar.entrySet()){
            int eleman = entry.getKey();
            int frekans = entry.getValue();
            System.out.println(eleman + " sayısı " + frekans + " kere tekrar edildi.");
        }

    }
}