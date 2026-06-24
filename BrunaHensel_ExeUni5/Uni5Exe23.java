import java.util.Scanner;

public class Uni5Exe23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char continuar;

        do {
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Nº de produtos: ");
            int n = sc.nextInt();

            double total = 0;
            for (int i = 1; i <= n; i++) {
                System.out.print("Preço do produto " + i + ": ");
                double preco = sc.nextDouble();
                System.out.print("Quantidade: ");
                total += preco * sc.nextInt();
            }
            sc.nextLine();

            System.out.printf("Vendedor: %s | Vendas: R$ %.2f | Salário: R$ %.2f%n", nome, total, total * 0.30);

            System.out.print("Mais um vendedor? s/n: ");
            continuar = sc.nextLine().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        sc.close();
    }
}