import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) throws Exception {
      Scanner s = new Scanner(System.in);
      System.out.print("Digite o número: ");
        int n = s.nextInt();
        int numero = 1;

        for (int linha = 1; linha <= n; linha++) {
            for (int col = 1; col <= linha; col++) {
                System.out.print(numero + " ");
                numero++;
            }
            System.out.println();
        }
      s.close();
    }
}
