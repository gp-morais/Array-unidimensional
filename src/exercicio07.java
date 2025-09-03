import java.util.Random;

public class exercicio07 {
    public static void main(String[] args) {

        Random rd = new Random();

        int [] x = new int [rd.nextInt(1, 16)];
        int grau = 0;
        int frequencia;

        for (int i = 0; i < x.length; i++) {
            x[i] = rd.nextInt(2, 10);
            System.out.print(x[i] + " ");
        }

        //descobrir o grau do vetor
        for (int i = 0; i < x.length; i++) {
            frequencia = 0;

            for (int j = 0; j < x.length; j++) {
                if (x[i] == x[j]){
                    frequencia++;
                }
            }

            if (frequencia>grau){
                grau = frequencia;
            }
        }







//        for (int i = 0; i < x.length; i++) {
//            frequencia = 1;
//
//            for (int j = 0; j < x.length; j++) {
//
//                if (x[i] == x[j]){
//                    frequencia ++;
//
//                }
//
//            }
//
//            if (frequencia > grau) {
//                grau = frequencia;
//            }
//
//        }
        System.out.println("\n------------------\n"+grau);


    }
}
