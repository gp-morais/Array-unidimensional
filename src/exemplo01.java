import java.util.Scanner;

public class exemplo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] x = new int[5];

        // armazenamento do números (obs: x.length)
        for (int i = 0; i < x.length; i++){
            System.out.print("Valor --> ");
            x[i] = sc.nextInt();
        }
        //impressão dos valores
        for (int i = 0; i < x.length; i++){
            System.out.print(x[i]+" ");
        }

        System.out.println("\n");

        //impressão dos valores ao contrário
        for (int i = x.length-1; i >= 0; i--){
            System.out.print(x[i]+" ");
        }
    }
}
