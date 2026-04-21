import java.util.Scanner;

public class Uni4Exe15 {
    
    /* entrada: meses admitido
    if meses <= 12 - 5%
    else if meses >= 13 && meses <= 48 - 7%
    else - nao informado */

    public static void main(String[] args) throws Exception {
        Scanner i = new Scanner(System.in);
        System.out.print("Digite a quantidade de meses que o funcionário foi admitido: ");
        int meses = i.nextInt();

        if (meses <= 12) {
            System.out.print("O funcionário irá receber 5% de reajuste");
        } else if (meses >= 13 && meses <= 48) {
            System.out.print("O funcionário irá receber 7% de reajuste");
        } else {
            System.out.print("Reajuste não informado");
        }

        i.close();
        
    }
}
