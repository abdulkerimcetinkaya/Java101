import java.util.Random;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run(){
        if (isCheck()){
            Random rand = new Random();
            int firstHit = rand.nextInt(2);
            if (firstHit == 0){
                System.out.println("Müsabakaya " + this.f1.name + " başlıyor.");
            }

            if (firstHit == 1){
                System.out.println("Müsabakaya " + this.f2.name + " başlıyor.");
            }
            while (this.f1.healt > 0 && this.f2.healt > 0){
                System.out.println("========= Yeni Round ===========");

//                System.out.println(this.f1.name + " sağlık : " + this.f1.healt);
//                System.out.println(this.f2.name + " sağlık : " + this.f2.healt);
//                System.out.println("------------------");

                if (firstHit == 0){
                    this.f2.healt = this.f1.hit(this.f2);
                    this.f1.healt = this.f2.hit(this.f1);
                    if (isWin()){
                        break;
                    }
                }

                if (firstHit == 1){
                    this.f1.healt = this.f2.hit(this.f1);
                    this.f2.healt = this.f1.hit(this.f2);
                    if (isWin()){
                        break;
                    }
                }
            }

        }else {
            System.out.println("Oyuncu sikletleri uyuşmuyor !!");
        }
    }
    boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }
    boolean isWin(){
        if (this.f1.healt == 0){
            System.out.println("-----------------");
            System.out.println(this.f1.name + " Nakavt oldu");
            System.out.println(this.f2.name + " Kazandı");
            return true;
        }

        if (this.f2.healt == 0){
            System.out.println("-----------------");
            System.out.println(this.f2.name + " Nakavt oldu");
            System.out.println(this.f1.name + " Kazandı");
            return true;
        }
        return false;
    }
}
