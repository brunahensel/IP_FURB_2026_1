import java.util.Scanner;

public class Uni4Exe9 {
    public static void main(String[] args) throws Exception {
        Scanner n = new Scanner(System.in);
        System.out.println("Escreva dois números inteiros: ");
        int num1 = n.nextInt();
        int num2 = n.nextInt();

        int resto = num1 % num2;
        if (resto == 0) {
        System.out.print("Os valores são múltiplos."); 
        } else 
            System.out.print("Os valores não são múltiplos.");

        n.close();
    }
}