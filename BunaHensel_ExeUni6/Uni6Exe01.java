import java.util.Scanner;

public class Uni6Exe1 {

    public Uni6Exe1() {
        // Scanner s = new Scanner(System.in);
        int vetor[] = new int[10];

        //for (int i = 0; i < vetor.length; i++)
           /* for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número para a posição " + i + ": ");
            vetor[i] = s.nextInt();  
        } */
            
        vetor = lerDados();

        /*for (int i = 9; i >= 0; i--) {
            System.out.print("Vetor[" + i + "]: " + vetor);
            }*/

        escreverDados(vetor);
        
        // s.close();


    }

    private int[] lerDados() {
        Scanner s = new Scanner(System.in);
        int vetor[] = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número para a posição " + i + ": ");
            vetor[i] = s.nextInt();   
    }

        s.close();

        return vetor;

    }

    private void escreverDados(int vetor[]) {
        for (int i = vetor.length-1; i >= 0; i--) {
            System.out.print("Vetor[" + i + "]: " + vetor);
     }
    }

    public static void main(String[] args) throws Exception {
       new Uni6Exe1();
    }
}