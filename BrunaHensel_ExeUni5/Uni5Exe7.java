import java.util.Scanner;

public class Uni5Exe7 {
    /* Ler o n
Ler o primeiro número e guarda em maior e menor ao mesmo tempo
Laço a partir do segundo número até n
Ler o próximo número
Se for maior que maior, atualiza maior
Se for menor que menor, atualiza menor
Fora do laço, escreve maior e menor */

    public static void main(String[] args) throws Exception {
        Scanner j = new Scanner(System.in);
        System.out.print("Quantidade de números: ");
        int n = j.nextInt();
        double primeiroNum = j.nextDouble();
        double maior = primeiroNum;
        double menor = primeiroNum;

        for (int i = 2; i <= n; i++) {
            double numero = j.nextDouble();
            if (numero > maior) {
                maior = numero;
            } if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
            
        j.close();
    }
}