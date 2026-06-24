import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int maiorProducao = -1;
        int diaMaiorProducao = 0;
        int totalManha = 0;
        int totalTarde = 0;
        int opcao = 1;

        do {
            int dia = 0;
            do {
                System.out.print("Digite o dia: ");
                dia = s.nextInt();
                if (dia < 1 || dia > 30) {
                    System.out.println("Dia inválido!");
                }
            } while (dia < 1 || dia > 30);

            System.out.print("Quantas peças foram produzidas pela manhã? ");
            int pecasManha = s.nextInt();

            System.out.print("Quantas peças foram produzidas pela tarde? ");
            int pecasTarde = s.nextInt();

            int producaoAtual = pecasManha + pecasTarde;
            double valorRecebido = 0.0;

            if (dia <= 15) {
                if (producaoAtual > 100 && pecasManha >= 30 && pecasTarde >= 30) {
                    valorRecebido = producaoAtual * 0.80;
                } else {
                    valorRecebido = producaoAtual * 0.50;
                }
            } else {
                valorRecebido = (pecasManha * 0.40) + (pecasTarde * 0.30);
            }
            System.out.println("Valor que o funcionário receberá no dia: R$" + valorRecebido);

            totalManha += pecasManha;
            totalTarde += pecasTarde;

            if (producaoAtual > maiorProducao) {
                maiorProducao = producaoAtual;
                diaMaiorProducao = dia;
            }

            System.out.println("Novo funcionário (1.sim 2.não)? ");
            opcao = s.nextInt();
            System.out.println();

        } while (opcao == 1);

        System.out.println("RESULTADOS FINAIS");
        System.out.println("O dia em que ocorreu a maior produção foi o dia: " + diaMaiorProducao);

        if (totalManha > totalTarde) {
            System.out.println("O período em que o funcionário mais produziu foi a MANHÃ, com um total de: "
                    + totalManha + " peças.");
        } else {
            System.out.println("O período em que o funcionário mais produziu foi a TARDE, com um total de: "
                    + totalTarde + " peças.");
        }

        s.close();
    }
}