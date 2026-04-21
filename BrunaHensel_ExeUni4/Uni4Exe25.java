import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite:\n1 para a Soma de dois números.\n" +
                "2 para a Diferença entre dois números.\n" +
                "3 para o Produto entre dois números.\n" 
                + "4 para a Divisão entre dois números (o denominador não pode ser zero). ");

        int opcao = s.nextInt();

        System.out.print("Valor 1: ");
        int valor1 = s.nextInt();
        System.out.print("Valor 2: ");
        int valor2 = s.nextInt();

        switch (opcao) {
            case 1:
                System.out.print(valor1 + valor2);
                break;
            case 2: 
                System.out.print(valor1 - valor2);
                break;
            case 3:
                System.out.print(valor1 * valor2);
                break;
            case 4:
                if (valor2 == 0) {
                    System.out.print("Opção inválida");
                } else {
                    System.out.print(valor1 / valor2);
                } break;
            default:
                System.out.print("Opção inválida");
                break;
        }

        s.close();

    }
}