import java.util.Scanner;

/* entrada: numero
converter o numero float para um int
se o numero for igual então é inteiro
se o numero for diferente é decimal
 */

public class Uni4Exe4 {
    public static void main(String[] args) throws Exception {
        Scanner decimal = new Scanner(System.in);
        System.out.print("Digite um número: ");

        float numero = decimal.nextFloat();
        int numero2 = (int) numero;

        if ( numero == numero2) {
            System.out.print("Casas decimais não foram digitadas." );  
        }
        else {
            System.out.print("Casas decimais foram digitadas.");
        }

        decimal.close();
    }
}