import java.util.Scanner;

public class Uni3Exe06 {
    //entrada: pesoCliente
    //processo: valor =  pesoCliente * 25
    // total = (pesoCliente - pesoPrato) * precoKilo;
    // precoKilo = R$25.0
    // pesoPrato = 0.75 
    //  saida: total

public static void main(String[] args) {
    Scanner restaurante = new Scanner(System.in);
    System.out.print("Digite o peso do prato em Kg: ");
    double pesoCliente = restaurante.nextDouble();

    double pesoPrato = 0.75;
    double precoKilo = 25;

    double total = (pesoCliente - pesoPrato) * precoKilo;

    System.out.print("Total a pagar: R$ " + total);

    restaurante.close();

}
}