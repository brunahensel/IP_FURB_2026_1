/* Uni6Exe06.java 
Faça um programa que leia um valor N inteiro. 
crie um vetor do tipo real. 
solicite ao usuário informar essa quantidade N de valores reais para popular o vetor. 
Após ter preenchido o vetor, solicite que o usuário informe um outro valor real. 
Informe para o usuário se este valor informado se encontra cadastrado no vetor. 
Faça um método para ler o vetor e outro, que retorne verdadeiro ou falso, para encontrar o valor. */

import java.util.Scanner;

public class Uni6Exe06 {

    public Uni6Exe06() {
        Scanner s = new Scanner(System.in);
        System.out.print("Informe a quantidade de elementos (N): ");
        int n = s.nextInt();
        double[] vetor = new double[n];

        ler(vetor, s);

        System.out.print("Informe o valor que deseja buscar no vetor: ");
        double valorBusca = s.nextDouble();

        if (buscarValor(vetor, valorBusca)) {
            System.out.println("O valor " + valorBusca + " foi encontrado!");
        } else {
            System.out.println("O valor " + valorBusca + " NÃO foi encontrado.");
        }

        s.close();
    }

    public void ler(double vetor[], Scanner s) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor do índice " + i + " para o vetor: ");
            vetor[i] = s.nextDouble();
        }
    }

    private boolean buscarValor(double vetor[], double numero) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        new Uni6Exe06();
    }
}
