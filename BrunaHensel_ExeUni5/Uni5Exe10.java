import java.util.Scanner;

public class Uni5Exe10 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int contador = 0;

        for (int n = 1000; n <= 9999; n++) {
            int esquerda = n / 100;
            int direita = n % 100;
            int soma = esquerda + direita;
            int quadrado = soma * soma; 

         if (quadrado == n) {
            contador += 1;
            System.out.println(n);
        if (contador == 10) break;
        }
    }
             
        s.close();
    }
}
