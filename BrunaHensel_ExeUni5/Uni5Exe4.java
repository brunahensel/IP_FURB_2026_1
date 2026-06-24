import java.util.Scanner;

public class Uni5Exe4 {

    /*  Declara S = 0 
        Declara n = 1 
    Condição: n <= 20? Se não → vai pro passo 8 
    Calcula numerador = 2 * n + 1 
    Calcula denominador = n * (n + 1) 
    S = S + (numerador / denominador), incrementa n = n + 1 → volta pro passo 4 
    Esceve S  */
    
    public static void main(String[] args) throws Exception {
        Scanner fracao = new Scanner(System.in);
        double s = 0;

        for (int n = 1; n <= 20; n++) {
            double numerador = 2 * n + 1;
            double denominador = n * (n+1);
            s += (numerador / denominador);
        }

        System.out.println(s);

        fracao.close();
    }
}