import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [] media = new double [10];
        double notas;
        int teste=0;

        for (int i = 0; i < media.length; i++) {

            media[i] = 0;
            System.out.println("Aluno " + (i+1) +" -----------");

            for(int j = 0; j < 4; j++){
                System.out.print("Informe a nota "+(j+1)+": ");
                notas = sc.nextDouble();
                media[i] += notas;
            }

            media[i] /=4;

            if (media[i] >=6){
                teste++;
            }

        }
        System.out.println("\n===================");
        for (int i = 0;i<media.length;i++){
            System.out.println("A média do aluno "+ (i+1)+ " é igual a: "+ media[i]);
        }
        System.out.print("\n===================\nO número de alunos aprovados é: "+teste+"\n===================\n");

    }
}
