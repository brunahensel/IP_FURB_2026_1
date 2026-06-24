/* preciso começar com um while que proíbe o usuario de criar um vetor maior que 20,
 ai fora desse while eu crio o for principal que varre o vetor
e dentro desse for eu crio mais um while 
e depois mais um for */

import java.util.Scanner;

public class Uni6Exe07 {
    public Uni6Exe07() {
        Scanner s = new Scanner(System.in);
        int N = 0;

        while (N <= 0 || N > 20) {
            System.out.print("Digite o tamanho (n) do vetor: ");
            N = s.nextInt();
        }

        int[] vetor = new int[N];

        inserirValor(vetor, s);
        ordenarValor(vetor);
        exibirValor(vetor);

        s.close();
    }

    public void inserirValor(int[] vetor, Scanner s) {
          for (int i = 0; i < vetor.length; i++) {
            boolean repetido = true;

            while (repetido) {
                System.out.println("Digite um número:");
                int numeroDig = s.nextInt();

                repetido = false;

                for (int j = 0; j < i; j++) {
                    if (numeroDig == vetor[j]) {
                        System.out.println("Número repetido.");
                        repetido = true;
                        break;
                    }
                }

                if (!repetido) {
                    vetor[i] = numeroDig;
                }
            }
        }
    }

    public void ordenarValor(int[] vetor) {
         for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j +1];
                    vetor[j + 1] = aux;
                }
            }
        }
    }

    public void exibirValor(int[] vetor) {
        System.out.print("Vetor ordenado: ");
    
        for (int i = 0; i < vetor.length; i++) {
        System.out.print("[" + vetor[i] + "]");
        }
    }

    public static void main(String[] args) throws Exception {
        new Uni6Exe07();
    }
}
