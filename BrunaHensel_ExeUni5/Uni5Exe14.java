import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int abaixo10 = 0, entre10e20 = 0, acima20 = 0;
        double totalCompra = 0, totalVenda = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Nome da mercadoria " + i + ": ");
            String nome = sc.nextLine();

            System.out.print("Preço de compra: ");
            double pc = sc.nextDouble();

            System.out.print("Preço de venda: ");
            double pv = sc.nextDouble();
            sc.nextLine();

            double lucro = (pv - pc) / pc * 100;

            if (lucro < 10) abaixo10++;
            else if (lucro <= 20) entre10e20++;
            else acima20++;

            totalCompra += pc;
            totalVenda += pv;
        }

        System.out.println("\nLucro < 10%: " + abaixo10);
        System.out.println("Lucro entre 10% e 20%: " + entre10e20);
        System.out.println("Lucro > 20%: " + acima20);
        System.out.printf("Total compras: R$ %.2f%n", totalCompra);
        System.out.printf("Total vendas: R$ %.2f%n", totalVenda);
        System.out.printf("Lucro total: R$ %.2f%n", totalVenda - totalCompra);

        sc.close();
    }
}