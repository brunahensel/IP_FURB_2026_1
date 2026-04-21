import java.util.Scanner;

public class Uni4Exe18 {

    /* Ler diaVencimento, diaPagamento e valor
    Calcular diferenca = diaVencimento - diaPagamento
    Se diferenca >= 0 → valorFinal = valor - valor * 0.10
    Se diferenca >= -5 && diferenca <= -1 → valorFinal = valor
    Se diferenca < -5 → valorFinal = valor + valor * 0.02 * Math.abs(diferenca)
    Exibir valorFinal  */

    public static void main(String[] args) throws Exception {
        Scanner loja = new Scanner(System.in);
        double diaVencimento = 10;
        System.out.print("Dia do Pagamento: ");
        double diaPagamento = loja.nextDouble();
        System.out.print("Valor da Prestação: ");
        double valor = loja.nextDouble();

        double valorFinal = 0;

        double diferenca = diaVencimento - diaPagamento;

        if (diferenca >= 0) {
            valorFinal = (valor - valor * 0.10);
            System.out.print("O pagamento está em dia. O valor da prestação = R$" + valorFinal);
        } else if (diferenca >= -5 && diferenca <= -1) {
            valorFinal = valor;
            System.out.print("Não será aplicado desconto nem multa. O valor da prestação = R$" + valorFinal);
        } else if (diferenca < -5) {
            valorFinal = valor + valor * 0.02 * Math.abs(diferenca);
            System.out.print("O pagamento está atrasado. Multa de 2% por dia de atraso. Valor da prestação = R$" + valorFinal); 
        } 

        loja.close();
    }
}