import java.util.Scanner;

public class Uni2Exe20 {
    public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);

    System.out.print("Digite o número de dobras: ");
    int dobras = s.nextInt();

    int quadrados = (int) Math.pow(2, dobras);

    System.out.println("Quadrados visíveis: " + quadrados);

        s.close();
    }
}