import java.util.ArrayList;

public class Vetor {

    public static void main(String[] args) {
        ArrayList<Integer> vetor = new ArrayList<Integer>();
        ArrayList<Integer> pares = new ArrayList<Integer>();

        for (int i = 1; i <5; i++){
            vetor.add(i);
            if (i % 2 ==0){
                pares.add(i);
            }
        }for (Integer n :pares){
            System.out.println(n);
        }
    }
}
