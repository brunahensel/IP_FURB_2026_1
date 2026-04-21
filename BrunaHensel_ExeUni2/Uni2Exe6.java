import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni2Exe6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int num = s.nextInt();
        int horas = s.nextInt();
        double valorHora = s.nextDouble();

        double salario = horas * valorHora;

        System.out.println(num + " " + df.format(salario));

        s.close();
    }
}