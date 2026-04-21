import java.util.Scanner;

public class Uni4Exe24 {
    /* se opção = 1, escreva os 3 valores em ordem crescente
se opção = 2, escreva os 3 valores em ordem decrescente
se opção = 3, escreva os 3 valores de forma que o maior valor fique no meio */
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.print("Valor 1: ");
        int valor1 = s.nextInt();
        System.out.print("Valor 2: ");
        int valor2 = s.nextInt();
        System.out.print("Valor 3: ");
        int valor3 = s.nextInt();

        System.out.print("Digite:\n1 para escrever os 3 valores em ordem crescente\n" +
                "2 para escrever os 3 valores em ordem decrescente\n" +
                "3 para escrever os 3 valores de forma que o maior valor fique no meio\n");

        int opcao = s.nextInt();
        /* Math.min() e Math.max() para encontrar o menor e o maior */
        int menor = Math.min(valor1, Math.min(valor2, valor3));
        int maior = Math.max(valor1, Math.max(valor2, valor3));
        int medio = (valor1 + valor2 + valor3) - menor - maior;

        switch (opcao) {
    case 1:
        System.out.println(menor + " " + medio + " " + maior);
        break;
    case 2:
        System.out.println(maior + " " + medio + " " + menor);
        break;
    case 3:
        System.out.println(menor + " " + maior + " " + medio);
        break;
    default:
        System.out.println("Opção inválida");
        break;
    }

        s.close();
    }
}