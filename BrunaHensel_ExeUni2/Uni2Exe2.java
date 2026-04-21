import java.util.Scanner;

public class Uni2Exe2 {
    public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);

        int num1 = s.nextInt();
        int num2 = s.nextInt();

        int multiplicacao = num1 * num2;

        System.out.print(multiplicacao);

        s.close();
    }
}