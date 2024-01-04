public class Main {
    public static void main(String[] args) {
        int[] list = {2,4,8,16,32};
        double sum = 0.0;
        for (int i: list){
            sum += 1.0/i;
        }

        System.out.println(list.length / sum);

    }
}