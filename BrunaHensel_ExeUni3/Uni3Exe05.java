import java.util.Scanner;

public class Uni3Exe05 {
 //entrada: quantFrangos
 //processo: gastoTotal = (chipId * quantFrangos) + (chipAli * quantFrangos)
 //saida: gasto da granja com os chips
public static void main(String[] args) {
    Scanner granja = new Scanner(System.in);
    System.out.print("Quantidade de Frangos da Granja: ");
    double quantFrangos = granja.nextDouble();
    double chipId = 4.0;
    double chipAli = 7.0;

    double gastoTotal = (chipId * quantFrangos) + (chipAli * quantFrangos);

    System.out.print("O gasto total para marcar " + quantFrangos + " é: R$" + gastoTotal);

    granja.close();

    }
}