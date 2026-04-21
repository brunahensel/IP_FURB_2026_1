import java.util.Scanner;

/* Entrada: numero inteiro
Processo: if (numero % 2 == 0)
o numero é par
else
o numero e impar */

public class Uni4Exe2 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = s.nextInt();

        // se o resto da divisão por 2 é zero então é par

        if (numero % 2 == 0) {
            System.out.print("O número é par.");  
        } else {
            System.out.print("O número é ímpar.");
        }

        s.close();
    }
}