import java.util.Scanner;

public class Uni5Exe28 {
    // String resposta; // Declaramos a String fora
    // do {
    // 1. Aqui dentro você pede o código do voto (1 a 4)
    // 2. Aqui você coloca o seu Switch
    // 3. Aqui você aumenta o totalVotos++

    // System.out.println("Mais um voto: s (SIM) / n (NÃO)?");
    // resposta = s.next(); // Lê o que o usuário digitar

    // } while (resposta.equalsIgnoreCase("s")); 
    // O loop volta lá para o começo se a resposta for "s" ou "S"

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int votosG1 = 0;
        int votosG2 = 0;
        int votosG3 = 0;
        int votosG4 = 0;
        int totalVotos = 0;

        String resposta;

        do {
            System.out.print("Digite o código do conjunto (1 a 4): ");
            int codigoVoto = s.nextInt();

            switch (codigoVoto) {
                case 1:
                    votosG1++;
                    totalVotos++;
                    break;
                case 2:
                    votosG2++;
                    totalVotos++;
                    break;
                case 3: 
                    votosG3++;
                    totalVotos++;
                    break;
                case 4:
                    votosG4++;
                    totalVotos++;
                    break;
                default:
                    System.out.print("Esse grupo não existe.");
                    break;
            }
            System.out.print("mais um voto: s (SIM) / n (NÃO)? ");
            resposta = s.next();
        } while (resposta.equalsIgnoreCase("s"));

        double percentualG1 = (votosG1 / (double) totalVotos) * 100;
        double percentualG2 = (votosG2 / (double) totalVotos) * 100;
        double percentualG3 = (votosG3 / (double) totalVotos) * 100;
        double percentualG4 = (votosG4 / (double) totalVotos) * 100;

        int maiorVoto = votosG1;
        String vencedor = "Nenhum de nós";

        if (votosG2 > maiorVoto) {
            maiorVoto = votosG2;
            vencedor = "CPM22";

        } if (votosG3 > maiorVoto) {
            maiorVoto = votosG3;
            vencedor = "Skank";

        } if (votosG4 > maiorVoto) {
            maiorVoto = votosG4;
            vencedor = "Jota Quest";
        }

        System.out.println("Total de votos grupo 1: " + votosG1);
        System.out.println("Total de votos grupo 2: " + votosG2);
        System.out.println("Total de votos grupo 3: " + votosG3);
        System.out.println("Total de votos grupo 4: " + votosG4);

        System.out.println("Percentual de votos grupo 1: " + percentualG1 + "%");
        System.out.println("Percentual de votos grupo 2: " + percentualG2 + "%");
        System.out.println("Percentual de votos grupo 3: " + percentualG3 + "%");
        System.out.println("Percentual de votos grupo 4: " + percentualG4 + "%");

        System.out.println("Vencedor: " + vencedor);

        s.close();
    }
}