import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe34 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        
        int opcao = 0;
        int contasEncerradas = 0;

        DecimalFormat df = new DecimalFormat("0.00");

        while (opcao != 3) {
            System.out.println("\n--- MENU DO HOTEL ---");
            System.out.println("(1) Encerrar a conta de um hóspede");
            System.out.println("(2) Verificar número de contas encerradas");
            System.out.println("(3) Sair");
            System.out.print("Escolha uma opção: ");
            opcao = s.nextInt();

            if (opcao == 1) {
                s.nextLine(); 
                System.out.print("Digite o nome do hóspede: ");
                String nome = s.nextLine();
                System.out.print("Digite o número de diárias: ");
                int diarias = s.nextInt();

                double taxaServico;
                if (diarias < 15) {
                    taxaServico = 7.50;
                } else if (diarias == 15) {
                    taxaServico = 6.50;
                } else {
                    taxaServico = 5.00;
                }

                double totalPagar = (50.00 * diarias) + (taxaServico * diarias);

                System.out.println("\nHóspede: " + nome);
                System.out.println("Total a ser pago: R$ " + df.format(totalPagar));
                
                contasEncerradas++; 

            } else if (opcao == 2) {
                System.out.println("\nNúmero total de hóspedes que deixaram o hotel: " + contasEncerradas);
            } else if (opcao == 3) {
                System.out.println("Finalizando o sistema do hotel. Até logo!");
            } else {
                System.out.println("Opção inválida. Escolha entre 1, 2 ou 3.");
            }
        }

        s.close();
    }
}