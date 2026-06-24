import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Número de vezes abastecidas: ");
        int abastecimento = s.nextInt();
        int kmTotal = 0;
        float litroTotal = 0;
    

        for (int i = 0; i < abastecimento; i++) {
           System.out.println("Quilometragem da parada: ");
           int quilometragem = s.nextInt();
           System.out.print("Litros abastecidos da parada: ");
           float litros = s.nextInt();

           kmTotal += quilometragem;
           litroTotal += litros;

           float mediaLitro = quilometragem / litros;

           System.out.println("Parada " + (i + 1) + ": " + mediaLitro + "km por litro");

        }

        float mediaTotal = kmTotal / litroTotal;
        System.out.print("Quilometragem média obtida por litro: " + mediaTotal);

        s.close();
    }
}
