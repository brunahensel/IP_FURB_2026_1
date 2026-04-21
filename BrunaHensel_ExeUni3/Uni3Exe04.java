import java.util.Scanner;

public class Uni3Exe04 {
    //entradas: nota1 nota2 nota3 pesos (5, 3, 2)
    //processo:  (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3) = valorNota
    // peso1 + peso2 + peso3 = valorPeso
    // mediaFinal = valorNota / valorPeso
    // saida: mediaFinal 

 public static void main(String[] args) {
    Scanner media = new Scanner(System.in);
    System.out.print("Digite a nota1: ");
    double nota1 = media.nextDouble();
    System.out.print("Digite a nota2: ");
    double nota2 = media.nextDouble();
    System.out.print("Digite a nota3: ");
    double nota3 = media.nextDouble();

    double peso1 = 5.0;
    double peso2 = 3.0;
    double peso3 = 2.0;

    double valorNota = (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3);
    double valorPeso = peso1 + peso2 + peso3;
    double mediaFinal = valorNota / valorPeso;

    System.out.print("A média final do aluno é: " + mediaFinal );

    media.close();
    
 }
}