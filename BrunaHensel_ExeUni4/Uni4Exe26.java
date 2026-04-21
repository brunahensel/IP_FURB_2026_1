import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Digite:\n T: para calcular a área de um triângulo de base b e altura h\n" +
                "Q: para calcular a área de um quadrado de lado l\n" +
                "R: para calcular a área de um retângulo de base b e altura h\n" + 
                "C: para calcular a área de um círculo de raio r\n");

        char opcao = s.next().charAt(0);
        
        switch (opcao) {
            case 'T':
                System.out.print("Base: ");
            int base = s.nextInt();
                System.out.print("Altura: ");
            int altura = s.nextInt();
                System.out.print((base * altura) / 2);
                break;

            case 'Q':
                System.out.print("Lado: ");
            int lado = s.nextInt();
                System.out.print(lado * lado);
                break;

            case 'R':
                System.out.print("Base: ");
            int base2 = s.nextInt();
                System.out.print("Altura: ");
            int altura2 = s.nextInt();
                System.out.print(base2 * altura2);
                break;

            case 'C':
                System.out.print("Raio: ");
            int raio = s.nextInt();
            double calculoraio = Math.PI * Math.pow(raio, 2);
                System.out.print(df.format(calculoraio));
                break;
            default:
                System.out.print("Opção inválida");
                break;
        }

        s.close();
    }
}