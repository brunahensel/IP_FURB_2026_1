import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) throws Exception {
       Scanner s = new Scanner(System.in);
       int pontosD = 0;
       int pontosE = 0;
       String jogada = s.next();

       while (!( (pontosD >= 21 || pontosE >= 21) && Math.abs(pontosD - pontosE) >= 2)) {
            if (jogada.equals("D")) {
                pontosD++;
            } else if (jogada.equals("E")) {
                pontosE++;
            }

            jogada = s.next();
       }

        if (pontosD > pontosE) {
                System.out.println("Jogador da direita venceu!");
            } else {
                System.out.println("Jogador da esquerda venceu!");
            }

       s.close();
    }
}
