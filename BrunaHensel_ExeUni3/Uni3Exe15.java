import java.util.Scanner;

    public class Uni3Exe15 {
    // entrada: ler numInt
    // processo: qtdCentena = numInt / 100 
    // qtdDez = (numInt / 10) % 10
    // qtdUni = numInt % 10
    // saida: centena, dezena, unidade

    public static void main(String[] args) {

    Scanner n = new Scanner(System.in);
    System.out.print("Digite um número inteiro: ");
    int numeroInt = n.nextInt();
    
    int qtdCentena = numeroInt / 100;
    numeroInt = numeroInt % 100;
    int qtdDez = numeroInt / 10;
    int qtdUni = numeroInt % 10;

    System.out.print("O número tem: " + qtdCentena + " centena(s), " + qtdDez + " dezena(s), " + qtdUni + " unidade(s).");

    n.close();
      
    }
}