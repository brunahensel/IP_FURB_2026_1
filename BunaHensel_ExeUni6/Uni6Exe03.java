import java.util.Scanner;

public class Uni6Exe03 {

    // construtor
    public Uni6Exe03() {
        Scanner s = new Scanner(System.in);
        double vetor[] = new double[12];

        // ler valores
        ler(vetor, s);

        // ajuste
        ajuste(vetor);

        // escrita
        escrita(vetor);

        s.close();
    }

    public void ler(double vetor[], Scanner s) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor do índice " + i + " para o vetor: ");
            vetor[i] = s.nextInt();
        }
    }

    public void ajuste(double vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            if ((int) vetor[i] % 2 == 0) {
                vetor[i] = vetor[i] * 1.02;
            } else {
                vetor[i] = vetor[i] * 1.05;
            }
        }
    }

    public void escrita(double vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Posição [" + i + "]: " + String.format("%.2f", vetor[i]));
        }
    }

    public static void main(String[] args) throws Exception {
        new Uni6Exe03();
    }
}
