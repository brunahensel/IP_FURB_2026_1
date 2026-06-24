import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe33 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int voto1 = 0, voto2 = 0, voto3 = 0, voto4 = 0;
        int nulos = 0, brancos = 0, totalVotos = 0;
        int opcao;

        do {
            System.out.println("\n--- MENU DE VOTAÇÃO ---");
            System.out.println("1, 2, 3, 4 - Candidatos");
            System.out.println("5 - Voto Nulo");
            System.out.println("6 - Voto em Branco");
            System.out.println("0 - Encerrar a votação");
            System.out.print("Informe seu voto: ");
            opcao = s.nextInt();

            switch (opcao) {
                case 1 -> {
                    voto1++;
                    totalVotos++;
                }
                case 2 -> {
                    voto2++;
                    totalVotos++;
                }
                case 3 -> {
                    voto3++;
                    totalVotos++;
                }
                case 4 -> {
                    voto4++;
                    totalVotos++;
                }
                case 5 -> {
                    nulos++;
                    totalVotos++;
                }
                case 6 -> {
                    brancos++;
                    totalVotos++;
                }
                case 0 -> System.out.println("Encerrando a votação.");
                default -> System.out.println("Opção incorreta. Tente novamente.");
            }

        } while (opcao != 0);

        System.out.println("\n--- RESULTADO FINAL DA ELEIÇÃO ---");
        System.out.println("Total Candidato 1: " + voto1 + " votos");
        System.out.println("Total Candidato 2: " + voto2 + " votos");
        System.out.println("Total Candidato 3: " + voto3 + " votos");
        System.out.println("Total Candidato 4: " + voto4 + " votos");
        System.out.println("Total Votos Nulos: " + nulos);
        System.out.println("Total Votos em Branco: " + brancos);
        System.out.println("Total geral de votos: " + totalVotos);

        if (totalVotos > 0) {
            double percBrancos = ((double) brancos / totalVotos) * 100;
            double percNulos = ((double) nulos / totalVotos) * 100;

            DecimalFormat df = new DecimalFormat("0.00");

            System.out.println("Percentual de votos em branco: " + df.format(percBrancos) + "%");
            System.out.println("Percentual de votos nulos: " + df.format(percNulos) + "%");
        } else {
            System.out.println("Nenhum voto foi registrado.");
        }

        s.close();
    }
}
