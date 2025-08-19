import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // qtd de operações
        int qtd;
        System.out.print("Qual a quantidade de números? ");
        qtd = sc.nextInt();

        int [] x = new int[qtd];
        int aux, j;

        //entrada de dados
        for (int i = 0; i < x.length; i++){
            System.out.print("Digite o número: ");
            x[i] = sc.nextInt();
        }

        //saida array original
        System.out.println("Valores antes da inversão: ");
        for(int i = 0; i < x.length; i++){
            System.out.print(x[i]+"  ");
        }

        //inversao array
        j = x.length -1;
        for (int i = 0; i < x.length/2; i++){
            aux = x[i];
            x[i] = x[j];
            x[j] = aux;
            j--;
        }


        System.out.println("\nValores depois da inversão: ");
        for(int i = 0; i < x.length; i++){
            System.out.print(x[i]+"  ");
        }

    }
}
