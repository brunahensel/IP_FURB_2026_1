import java.util.Scanner;

public class Uni2Exe9 {
    public static void main(String[] args) throws Exception {    
    Scanner s = new Scanner(System.in);

    System.out.print("Digite o valor em dólares: ");
    double dolares = s.nextDouble();

    System.out.print("Digite a cotação do dólar: ");
    double cotacao = s.nextDouble();

    double reais = dolares * cotacao;

    System.out.println("Reais a receber: R$" + reais);

    s.close();

    }
}