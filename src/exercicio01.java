import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] x = new int[10];
        //obs: Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;


        for (int i = 0; i <x.length; i++){
            System.out.print("Valor --> ");
            x[i] = sc.nextInt();
            if (x[i] > max){
                max = x [i];
            }
        }

        System.out.println("Maior é igual a: "+max);

    }
}
