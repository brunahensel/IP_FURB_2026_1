import java.util.Scanner;

public class Uni2Exe19 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o valor de B: ");
        int B = s.nextInt();

        System.out.print("Digite o valor de C: ");
        int C = s.nextInt();

        System.out.print("Digite o valor de D: ");
        int D = s.nextInt();

        int A = B;

        System.out.println("Valor de A: " + A);
        s.close();
    }
}