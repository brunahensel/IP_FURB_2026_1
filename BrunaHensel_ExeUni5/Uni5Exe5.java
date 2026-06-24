import java.util.Scanner;

public class Uni5Exe5 {
   
    public static void main(String[] args) throws Exception {
        Scanner sequencia = new Scanner(System.in);

        int valor = 8;

        for (int n = 3; n <= 7; n++) {
            // +2
            valor += 2;
            System.out.print(valor + " ");
            // + 2^n - 2
            int continuacao = (int) Math.pow(2, n) - 2;
            valor += continuacao;
            System.out.print(valor + " ");
        }

        sequencia.close();
    }
}
