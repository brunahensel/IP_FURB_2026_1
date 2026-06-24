import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int totalTrechos = 0;
        int trechosNegados = 0;
        int trechosLongosAceitos = 0;

        System.out.print("Valor máximo do pedágio: ");
        double limiteAstolfo = s.nextDouble();

        System.out.print("Valor do pedágio: ");
        double pedagioTrecho = s.nextDouble();

        while (pedagioTrecho >= 0) {
            System.out.print("Distância do trecho: ");
            int distanciaTrecho = s.nextInt();

        if (pedagioTrecho > limiteAstolfo) {
            trechosNegados++;
        }
        if (distanciaTrecho > 150 && pedagioTrecho <= limiteAstolfo) {
            trechosLongosAceitos++;
        }

        totalTrechos++;

        System.out.print("Valor do pedágio: ");
        pedagioTrecho = s.nextDouble();

        }

        System.out.println("Trechos com valor acima: " + trechosNegados);
        System.out.println("Quantidade de trechos informados: " + totalTrechos);
        System.out.println("Trechos acima de 150km com valor aceito: " + trechosLongosAceitos);
        
        s.close();
    }
}
