/* Um cinema pretende fazer uma pesquisa para avaliar o grau de satisfação de seus clientes. 
Trinta deles foram ouvidos e para cada um perguntou-se o sexo (1=feminino 2=masculino),
 uma nota para o cinema (zero até dez, valor inteiro) e a idade.

Baseado nisto faça um programa que informe:
qual a nota média recebida pelo cinema;
qual a nota média atribuída pelos homens;
qual a nota atribuída pela mulher mais jovem;
quantas das mulheres com mais de 50 anos deram nota superior a média recebida pelo cinema. */

import java.util.Scanner;

public class Uni6Exe09 {
    public Uni6Exe09() {
        Scanner s = new Scanner(System.in);
        
        int[] sexos = new int[30];
        int[] notas = new int[30];
        int[] idades = new int[30];

        lerDados(sexos, idades, notas, s);
        processarExibir(sexos, idades, notas, lerDados(sexos, idades, notas, s)); //joga a própria chamada do lerDados direto dentro do parâmetro do próximo método
        
        s.close();
    }

    public double lerDados (int[] sexos, int[] idades, int[] notas, Scanner s) {
        int somaNotasGeral = 0;

        for (int i = 0; i < 30; i++) {
            System.out.println("Digite o sexo (1=Fem / 2=Masc): ");
            sexos[i] = s.nextInt();

            System.out.print("Digite a idade: ");
            idades[i] = s.nextInt();

            System.out.print("Digite uma nota para o cinema de 0 a 10: ");
            int notaDigitada = s.nextInt();

            while (notaDigitada < 0 || notaDigitada > 10) {
            System.out.print("Nota inválida!");
            notaDigitada = s.nextInt();
    }
            notas[i] = notaDigitada;
            somaNotasGeral += notaDigitada;
        }

        double mediaGeral = somaNotasGeral / 30.0;
        return mediaGeral;
    }

    public void processarExibir (int[] sexos, int[] idades, int[] notas, double mediaGeral) {
        int somaNotasHomens = 0;
        int qtdHomens = 0;

        int menorIdadeMulher = Integer.MAX_VALUE;
        int notaMulherMaisNova = 0;

        int qtdMulheres50 = 0;

      
        for (int i = 0; i < 30; i++) {
             //Média dos homens
            if (sexos[i] == 2) {
                somaNotasHomens += notas[i];
                qtdHomens++;
            }
            //Mulher mais jovem, nota dela
            if (sexos[i] == 1 && idades[i] < menorIdadeMulher) {
                menorIdadeMulher = idades[i];
                notaMulherMaisNova = notas[i];
            }
            //Mulheres > 50 anos com nota acima da média geral
            if (sexos[i] == 1 && idades[i] > 50 && notas[i] > mediaGeral) {
                qtdMulheres50++;
            }
        }

        double mediaHomens = 0;
        if (qtdHomens > 0) {
            mediaHomens = (double) somaNotasHomens / qtdHomens;
        }

        System.out.println("Nota média recebida pelo cinema: " + mediaGeral);
        System.out.println("Nota média atribuída pelos homens: " + mediaHomens);
        System.out.println("Nota atribuída pela mulher mais jovem: " + notaMulherMaisNova);
        System.out.println("Mulheres com mais de 50 anos com nota acima da média: " + qtdMulheres50);

    }

    public static void main(String[] args) throws Exception {
        new Uni6Exe09();
    }
}