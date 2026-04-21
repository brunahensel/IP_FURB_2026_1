import java.util.Scanner;

public class Uni2Exe1 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Valor 1: ");
        int valor1 = s.nextInt();
        System.out.print("Valor 2: ");
        int valor2 = s.nextInt();

        int soma = valor1 + valor2;

        System.out.print("soma: " + soma);
        
        s.close();
    }
}
