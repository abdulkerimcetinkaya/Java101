public class Main {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++){
            boolean asal = true;

            for (int k = 2; k <= i/2; k++){
                if (i%k == 0 ){
                    asal = false;
                    break;
                }
            }
            if (asal){
                System.out.println(i);
            }
        }
    }
}
