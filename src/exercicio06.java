import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //pergunta quantidade de números
        int x;
        boolean especial = true;


        System.out.print("Digite a quantidade de números: ");
        x = in.nextInt();

        int [] numero = new int[x];

        //entrada de dados
        for (int i = 0; i < numero.length; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            numero[i]= in.nextInt();
        }

        //verifica se o vetor NÃO é especial
        for (int i = 0; i < numero.length-1; i++) {
            if (numero[i] % 2 == numero [i+1]){
                especial = false;
                break;
            }
        }

        if (especial == false){
            System.out.println("O array não é especial");
        } else {
            System.out.println("O array é especial");
        }



    }
}
