import java.util.Scanner;

public class Uni5Exe19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalLoja = 0;

        System.out.print("Valor da compra: ");
        double compra = sc.nextDouble();

        while (compra != 0) {
            double desconto = compra > 500 ? 0.20 : 0.15;
            double totalPagar = compra - (compra * desconto);

            System.out.printf("Total a pagar: R$ %.2f%n", totalPagar);

            totalLoja += totalPagar;

            System.out.print("Valor da compra: ");
            compra = sc.nextDouble();
        }

        System.out.printf("Total recebido pela loja: R$ %.2f%n", totalLoja);

        sc.close();
    }
}