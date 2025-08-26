import java.util.Scanner;

public class exercicio04_arrumar {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String[] mes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio",
                "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        double [] temperatura = new double[mes.length];
        double media = 0;

        System.out.println("digite a temperatura dos meses (em ºC)");

        for (int i = 0; i< mes.length; i++){
            System.out.print(mes[i]+": ");
            temperatura [i] = in.nextDouble();

            media += temperatura[i];
        }
        media /= 12;

        System.out.println("\nA média é igual a: "+media);

        for (int i = 0; i < mes.length; i++) {
            if (temperatura[i] > media) {

                System.out.println("\nOs meses acima da média são: ");

                for (int j = 0; j < mes.length; j++) {

                    if (temperatura[j] > media) {

                        System.out.print(mes[j]+"; ");

                    }
                } break;
            }

        }


    }
}
