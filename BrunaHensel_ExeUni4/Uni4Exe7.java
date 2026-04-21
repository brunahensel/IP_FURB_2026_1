import java.util.Scanner;

public class Uni4Exe7 {

    public static void main(String[] args) throws Exception {
        Scanner cartas = new Scanner(System.in);
        System.out.print("Peso da carta em (g): ");
        double pesoCarta = cartas.nextDouble();

        if (pesoCarta <= 50) {
            System.out.print("O valor do selo é R$: 0,45.");
        } else {
            int excesso = (int)(pesoCarta - 50);
            int faixas = (excesso + 19) / 20;  // divisão inteira arredonda para cima
            double total = 0.45 + (faixas * 0.45);
            System.out.print("O valor do selo é R$: " + total);
        }

        cartas.close();
    }
}