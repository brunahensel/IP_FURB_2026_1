import java.util.Scanner;

public class Uni6Exe4 {

    //Construtor = o nome é igual da classe
    public Uni6Exe4() {
       Scanner s = new Scanner(System.in);
        int TAMANHO = 5;
        int vetor1[] = new int[TAMANHO];
        int vetor2[] = new int[TAMANHO];

     lerValores(s, vetor1, "Vetor 1");
     lerValores(s, vetor2, "Vetor 2");

     int vetorResultante[] = somarVetores(vetor1, vetor2);

      //ler os valores de dois vetores inteiros
      /*for(int i = 0; i < vetor1.length; i++) {
        System.out.print("Digite o valor do índice " + i + " para o vetor 1: ");
        vetor1[i] = s.nextInt();
      }

       for(int i = 0; i < vetor2.length; i++) {
        System.out.print("Digite o valor do índice " + i + " para o vetor 2: ");
        vetor2[i] = s.nextInt();
      }*/

        //*for(int i = 0; i < vetor1.length; i ++) {
            //vetorResultante[i] = vetor1[i] + vetor2[i];
      //}
        //for(int i = 0; i < vetorResultante.length; i++) {
            //System.out.println("Vetor[" + i + "]: " + vetorResultante[i]);
        //}

        imprimir(vetorResultante);
      s.close();
    }

      private void imprimir(int[] valores) {
        for (int i = 0; i < valores.length; i++) {
          System.out.println("Vetor[" + i + "]: " + valores[i]);
        }
      }

      private int[] somarVetores(int[] vetor1, int[] vetor2) {
        int[] vetorSoma = new int[vetor1.length];
        for (int i = 0; i < vetor1.length; i++) {
          vetorSoma[i] = vetor1[i] + vetor2[i];
        }
        return vetorSoma;
      }

      private void lerValores(Scanner s, int[] valores, String nomeVetor) {
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Informe o valor " + (i + 1) + " para o " +
                    nomeVetor + ": ");
            valores[i] = s.nextInt();
        }
    }

    public static void main(String[] args) throws Exception {
        new Uni6Exe4();
    }
}
