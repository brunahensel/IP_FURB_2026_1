import java.util.Scanner;

public class Uni2Exe16 {
    /* qtd de latas de 350ml
qtd de garrafas de 600ml
qtd de garrafas de 2 litros

qtdComprada = (qtdLatas350 * 350) + (qtdGarrafas600 * 600) + (qtdGarrafas2L * 2000)
qtdTotal = qtdComprada / 1000*/

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("quantidade de latas de 350ml: ");
        int qtdLatas350 = s.nextInt();
        System.out.print("quantidade de garrafas de 600ml: ");
        int qtdGarrafas600 = s.nextInt();
        System.out.print("quantidade de garrafas de 2L: ");
        int qtdGarrafas2L = s.nextInt();

        int qtdComprada = (qtdLatas350 * 350) + (qtdGarrafas600 * 600) + (qtdGarrafas2L * 2000);
        int qtdTotal = qtdComprada / 1000;

        System.out.print("Quantidade em litros comprada: " + qtdTotal + " litros.");
        s.close();
    }
}