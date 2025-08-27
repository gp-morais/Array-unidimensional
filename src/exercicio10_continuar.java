import java.util.Random;

public class exercicio10_continuar {
    public static void main(String[] args) {
        Random rd = new Random();
        int [] x = new int [10];

        //preenchimento e impressão antes da ordenação
        System.out.println("Antes da ordenação");
        for (int i = 0; i < x.length; i++) {
            x[i] = rd.nextInt(20);
            System.out.print(x[i] + " ");
        }

        //lógica para ordenadar (crescente)

        System.out.println("\nDepois da ordenação");
        for (int i = 0; i < x.length; i++) {

            System.out.print(x[i] + " ");
        }

    }
}
