import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni2Exe7 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");

    String nome = s.next();
    double salarioFixo = s.nextDouble();
    double vendas = s.nextDouble();

    double salarioFinal = salarioFixo + (vendas * 0.15);

    System.out.println(df.format(salarioFinal));

        s.close();
    }
}