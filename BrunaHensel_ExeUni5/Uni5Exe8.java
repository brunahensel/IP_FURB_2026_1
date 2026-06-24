import java.util.Scanner;

public class Uni5Exe8 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int menorNegativo = 0;
        int somaPositivo = 0;
        int mediaPositivo = 0;

        for (int i = 0; i < n; i++) {
            int num = s.nextInt();

            if (num < 0) {
                if (menorNegativo == 0 || num < menorNegativo) {
                    menorNegativo = num;
                }
            }

            if (num > 0) {
                somaPositivo = somaPositivo + num;
                mediaPositivo = mediaPositivo + 1;

            }
        } 

        System.out.println("Menor valor negativo: " + menorNegativo);
        System.out.println("Média dos números positivos: " + (somaPositivo/mediaPositivo));


        s.close();

    }
}