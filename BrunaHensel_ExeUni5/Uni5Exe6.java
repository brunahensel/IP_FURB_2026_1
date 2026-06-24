import java.util.Scanner;

/* criar um contador que le o número de pessoas, 
criar uma variável de altura que vai somando a altura das 20 pessoas e no 
final dividir pela quantidade de pessoas
print que escreva a média da altura
contador, altura, somaAlturas, media */

public class Uni5Exe6 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
    
         double somaAlturas = 0;

        for (int contador = 1; contador <= 20; contador++) {
            System.out.print("Altura: ");
            double altura = s.nextDouble();
            somaAlturas = somaAlturas + altura;
        }

        double media = somaAlturas / 20;
        System.out.print("A média das alturas é: " + media);

        
        s.close();
    }
}