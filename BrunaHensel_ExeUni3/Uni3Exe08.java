import java.util.Scanner;

public class Uni3Exe08 {
    //entrada: valor em dólar recebido, cotação do dólar
    //processo: qtdreais = vdolar * cotacao
    //saida: valor em reais à devolver
    public static void main(String[] args) throws Exception {
        Scanner cambio = new Scanner(System.in);
        System.out.print("Valor em dólar recebido: ");
        float vdolar = cambio.nextFloat();
        System.out.print("Cotação do dólar hoje: ");
        float cotacao = cambio.nextFloat();

        float qtdreais = vdolar * cotacao;

        System.out.print("O atendente deve devolver R$" + qtdreais +  " para o cliente.");

        cambio.close();

    }
}
