//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] list =  {1,1,2,2,3,3,4,4,5};

        for (int i = 0; i < list.length; i++){

            boolean isDublicate = false;
            for (int j = i+1 ; j < list.length; j++){
                if (list[i] == list[j] && list[i] % 2 == 0 && !isDublicate){
                    System.out.print(list[i] + ", ");
                    isDublicate = true;
                    break;
                }
            }
        }
    }
}