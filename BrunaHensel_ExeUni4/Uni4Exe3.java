import java.util.Scanner;

/* entrada: dois numeros inteiros
num1, num2
if - se o num1 > num2 digite "o valor num1 é maior que o valor num2" 
else - se não digite "o valor num2 é maior que o valor num1" */

public class Uni4Exe3 {
    public static void main(String[] args) throws Exception {
        Scanner numeros = new Scanner(System.in);

        System.out.print("primeiro número: ");
        int num1 = numeros.nextInt();
        System.out.print("segundo número: ");
        int num2 = numeros.nextInt();

        if ( num1 > num2) {
            System.out.print("o valor " + num1 + " é maior que o valor " + num2);
        }
        else {
            System.out.print("o valor " + num2 + " é maior que o valor " + num1);
        }

        numeros.close();
    }
}
