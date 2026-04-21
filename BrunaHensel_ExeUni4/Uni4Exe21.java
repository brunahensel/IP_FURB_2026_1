import java.util.Scanner;

public class Uni4Exe21 {
    /* imc = massa / altura²
    entrada: peso e altura
    < 18.5	Magreza
    18.5 - 24.9	Saudável
    25.0 - 29.9	Sobrepeso
    30.0 - 34.9	Obesidade Grau I
    35.0 - 39.9	Obesidade Grau II (severa)
    >= 40.0	Obesidade Grau III (mórbida)
     */

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o seu peso: ");
        double peso = s.nextDouble();
        System.out.print("Digite a sua altura: ");
        double altura = s.nextDouble();

        String classificacao = "";
        double imc = peso / (Math.pow(altura, 2));

        if (imc <= 18.5) {
            classificacao = "Magreza";
        } else if (imc > 18.5 && imc <= 24.9 ) {
            classificacao = "Saudável";
        } else if (imc >= 25.0 && imc <= 29.9) {
            classificacao = "Sobrepeso";
        } else if (imc >= 30.0 && imc <= 34.9) {
            classificacao = "Obesidade Grau I";
        } else if (imc >= 35.0 && imc <= 39.9) {
            classificacao = "Obesidade Grau II (severa)";
        } else if (imc >= 40.0) {
            classificacao = "Obesidade Grau III (mórbida)";
        }
        
        System.out.print(classificacao);

        s.close();
    }
}