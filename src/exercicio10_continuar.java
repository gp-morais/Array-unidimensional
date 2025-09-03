import java.util.Random;

public class exercicio10_continuar {
    public static void main(String[] args) {
        Random rd = new Random();
        int [] x = new int [10];
        int aux;

        //preenchimento e impressão antes da ordenação
        System.out.println("Antes da ordenação");
        for (int i = 0; i < x.length; i++) {
            x[i] = rd.nextInt(10);
            System.out.print(x[i] + " ");
        }

        //lógica para ordenadar (crescente)
        for (int j = 0; j < x.length-1; j++) {

            for (int i = 0; i < x.length - 1; i++) {

                if (x[i] > x[i + 1]) {

                    aux = x[i];
                    x[i] = x[i + 1];
                    x[i + 1] = aux;
                }
            }
        }

        System.out.println("\nDepois da ordenação");
        for (int i = 0; i < x.length; i++) {

            System.out.print(x[i] + " ");
        }

    }
}
