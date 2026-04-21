import java.util.Scanner;

public class Uni3Exe13 {
    //entrada: altura e comprimento em metros
    //processo: area = altura * comprimento
    // valorm = area * 12,50
    // valortotal = valorm * 9
    //saida: valor final gasto com azulejos

    public static void main(String[] args) throws Exception {
      Scanner azulejos = new Scanner(System.in);
      System.out.print("altura (m): ");
      float altura = azulejos.nextFloat();
      System.out.print("comprimento (m): ");
      float comprimento = azulejos.nextFloat();

      float area = altura * comprimento;
      float valorm = area* 12.5f;
      float valortotal = valorm * 9;

        System.out.print("O valor final é :" + " R$" + valortotal);
    }
}
