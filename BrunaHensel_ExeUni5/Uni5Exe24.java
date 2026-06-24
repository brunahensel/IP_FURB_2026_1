import java.util.Scanner;

public class Uni5Exe24 {
    /*
     * Descreva um algoritmo que leia o limite diário (em quilogramas) e então leia
     * o peso (em gramas) de cada peixe e
     * escreva o peso total da pesca obtido até aquele ponto. Quando o limite diário
     * for excedido escreva uma mensagem e
     * encerre a execução do algoritmo. Para prosseguir com a entrada de dados de
     * pesos de cada peixe
     * o algoritmo deve apresentar a seguinte mensagem: “deseja informar o peso de
     * mais um peixe: s (SIM) / n (NÃO)?”.
     */
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Qual o limite diário de peso? (em kg): ");
        double limiteKg = s.nextDouble();
        double limiteGramas = limiteKg * 1000;
        double pesoTotalGramas = 0;
        String resposta = "s";
        

        do {
            System.out.print("Qual o peso do peixe? (em g): ");
            double pesoPeixe = s.nextDouble();
            pesoTotalGramas += pesoPeixe;
            System.out.println("Peso total da pesca até agora: " + pesoTotalGramas + "g.");

            if (pesoTotalGramas > limiteGramas) {
                System.out.print("Limite diário excedido!");
                break;
            } 
            System.out.println("deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)? ");
            resposta = s.next();
        } while (resposta.equals("s"));

        s.close();
    }
}
