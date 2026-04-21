import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe20 {
    /* entrada: 3 notas provas
    nota exercicios
    media = (notaP1+notaP2*2+notaP3*3+notaExe) / 7
    se media <= 9 - A
    se media >= 7 && < 9 - B
    se media >= 6 && < 7.5 - C
    se media >= 4 && < 6 - D
    se media < 4 - E  */
    public static void main(String[] args) throws Exception {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner nota = new Scanner(System.in);
        System.out.print("Prova 1: ");
        double notaP1 = nota.nextDouble();
        System.out.print("Prova 2: ");
        double notaP2 = nota.nextDouble();
        System.out.print("Prova 3: ");
        double notaP3 = nota.nextDouble();
        System.out.print("Média Exercícios: ");
        double notaExe = nota.nextDouble();

        String conceito = "";
        String situacao = "";
        double media = (notaP1+notaP2*2+notaP3*3+notaExe) / 7;

        if (media >= 9.0) {
            conceito = "A";
            situacao = "Aprovado";
        } else if (media >= 7 && media < 9) {
             conceito = "B";
            situacao = "Aprovado";
        } else if (media >= 6 && media < 7.5) {
            conceito = "C";
            situacao = "Aprovado";  
        } else if (media >= 4 && media < 6) {
            conceito = "D";
            situacao = "Reprovado"; 
        } else if (media < 4 ) {
            conceito = "E";
            situacao = "Reprovado"; 
        }

        System.out.print("A média de aproveitamento foi: " + df.format(media) + " Conceito: " + conceito + ". " + situacao);

        nota.close();
    }
}
