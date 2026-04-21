import java.util.Scanner;

    // análise: ok
    // entrada: QUANTIDADE: lata350 , garrafa600 e garrafa2 .
    //processo: multiplique a qtd de cada formato em ml, soma e divide por 1000
    //saída: valor (em litros) de bebida que o cliente comprou
    //processo: qtdComprada = (qtdLatas350 * 350) + (qtdGarrafas600 * 600) + (qtdGarrafas2L * 2000)
    //qtdTotal = qtdComprada / 1000

    public class Uni3Exe07 {

    public static void main(String[] args) {

    Scanner bebida = new Scanner(System.in);
    System.out.print("Quantidade de latas de 350ml: ");
    Float lata350 = bebida.nextFloat();
    System.out.print("Quantidade de garrafas de 600ml: ");
    Float garrafa600 = bebida.nextFloat();
    System.out.print("Quantidade de garrafas de 2L: ");
    Float garrafa2 = bebida.nextFloat();
    
    Float qtdComprada = (lata350 * 350) + (garrafa600 * 600) + (garrafa2 * 2000);  
    Float qtdTotal = qtdComprada / 1000;

    System.out.print("O cliente comprou ao total: " + qtdTotal + " litros");
    
    bebida.close();

    }
}