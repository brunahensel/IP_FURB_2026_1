import java.util.Scanner;

public class Uni2Exe15 {
    public static void main(String[] args) throws Exception {
             Scanner s = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double valor = s.nextDouble();

        /* converte p centavos */
        int centavos = (int) Math.round(valor * 100);

        int notas100 = centavos / 10000;
        centavos = centavos % 10000;

        int notas50 = centavos / 5000;
        centavos = centavos % 5000;

        int notas20 = centavos / 2000;
        centavos = centavos % 2000;

        int notas10 = centavos / 1000;
        centavos = centavos % 1000;

        int notas5 = centavos / 500;
        centavos = centavos % 500;

        int notas2 = centavos / 200;
        centavos = centavos % 200;

        int moedas1 = centavos / 100;
        centavos = centavos % 100;

        int moedas50 = centavos / 50;
        centavos = centavos % 50;

        int moedas25 = centavos / 25;
        centavos = centavos % 25;

        int moedas10 = centavos / 10;
        centavos = centavos % 10;

        int moedas5 = centavos / 5;
        centavos = centavos % 5;

        int moedas1c = centavos;

        System.out.println("NOTAS:");
        System.out.println(notas100 + " nota(s) de R$ 100.00");
        System.out.println(notas50  + " nota(s) de R$ 50.00");
        System.out.println(notas20  + " nota(s) de R$ 20.00");
        System.out.println(notas10  + " nota(s) de R$ 10.00");
        System.out.println(notas5   + " nota(s) de R$ 5.00");
        System.out.println(notas2   + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moedas1  + " moeda(s) de R$ 1.00");
        System.out.println(moedas50 + " moeda(s) de R$ 0.50");
        System.out.println(moedas25 + " moeda(s) de R$ 0.25");
        System.out.println(moedas10 + " moeda(s) de R$ 0.10");
        System.out.println(moedas5  + " moeda(s) de R$ 0.05");
        System.out.println(moedas1c + " moeda(s) de R$ 0.01");

        s.close();
    }
}