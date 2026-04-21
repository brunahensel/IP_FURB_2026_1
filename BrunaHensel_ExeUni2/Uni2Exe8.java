import java.util.Scanner;

public class Uni2Exe8 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int cod1 = s.nextInt();
    int num1 = s.nextInt();
    double valor1 = s.nextDouble();

    int cod2 = s.nextInt();
    int num2 = s.nextInt();
    double valor2 = s.nextDouble();

    double total = num1 * valor1 + num2 * valor2;

    System.out.println(total);

    s.close();
    }
}