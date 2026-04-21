import java.util.Scanner;

public class Uni03Exe02 {

        //Analise: valor em real
        //Entrada: valor do produto
        //Saida: valor do desconto e valor final dos sapatos
        //Processo: valorProduto * 0,12 = valorDesconto -> (valorProduto - valorDesconto) = valorFinal
        //Fluxograma:  ler valorProduto -> valorProduto * 0,12 -> escrever "O valor do desconto é de: " ->  (valorProduto - valorDesconto) = valorFinal -> escrever: "O valor do par de sapatos com desconto é de: " 

    public static void main(String[] args) {
       Scanner pardesapatos = new Scanner(System.in);
       System.out.print("Digite o valor do sapato: ");
       float valorProduto = pardesapatos.nextFloat();
       
       float valorDesconto = valorProduto * 0.12f;
       float valorFinal = valorProduto - valorDesconto;

       System.out.println("O valor do desconto é de: R$ "+ valorDesconto);
       System.out.println("O valor do par de sapatos com desconto é de: R$ "+ valorFinal);

       pardesapatos.close();
    }
}
