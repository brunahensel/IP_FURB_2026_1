import java.util.Scanner;

public class Uni3Exe03 { 

     //Entrada: precoLitro, pagamento
    //Saída: O motorista conseguiu colocar: totalLitro litros.
    //Processo:
    //totalLitro = pagamento / precoLitro
    //Fluxograma: Ler precolitro -> Ler pagamento -> total = pagamento / precoLitro ->escreva"__" + total

public static void main(String[] args) {
    Scanner gasolina = new Scanner(System.in);
    System.out.print("Digite o preço do litro: ");
    float precoLitro = gasolina.nextFloat();
    System.out.print ("Digite o Valor do Pagamento: ");
    float pagamento = gasolina.nextFloat();

    float totalLitro = pagamento / precoLitro;

    System.out.print("Quanto motorista colocou: " + totalLitro + "litros");
    
gasolina.close();

}
}