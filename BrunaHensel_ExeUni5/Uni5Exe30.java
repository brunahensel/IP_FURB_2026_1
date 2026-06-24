import java.util.Scanner;

public class Uni5Exe30 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Número de início da sequência: ");
        int N = s.nextInt();
        System.out.print("Decremento da sequência: ");
        int K = s.nextInt();
        System.out.print("Tamanho da mochila: ");
        int M = s.nextInt();

        String todosElementos = "";
        String elementosDentro = "";
        String elementosFora = "";
        int somaDentro = 0;
        int somaFora = 0;

        for (int i = N; i > 0; i -= K) {
            todosElementos += i + " ";
            if (i <= M) {
                elementosDentro += i + " ";
                somaDentro += i;
                M -= i;
            } else {
                elementosFora += i + " ";
                somaFora += i;
            }
        }

        System.out.println("--- RESULTADO DA MOCHILA ---");
        System.out.println("Elementos a serem colocados: " + todosElementos);
        System.out.println("Elementos que - entraram - na mochila: " + elementosDentro);
        System.out.println("Elementos de ficaram - fora -  da mochila: " + elementosFora);
        System.out.println("Soma dos elementos que entraram: " + somaDentro);
        System.out.println("Soma dos elementos que ficaram fora: " + somaFora);

        s.close();
    }
}
