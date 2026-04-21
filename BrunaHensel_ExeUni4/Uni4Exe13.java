import java.util.Scanner;

public class Uni4Exe13 {

    /* entrada: carta1, carta2. carta3
    1 = AS; 2 = 2; 3 = 3; 7 = 7; 11 = Valete; 12 = Dama; 13 = Rei  
    se (carta1 == 1 || carta1 == 2 || carta1 == 3)
    se (carta2 == 1 || carta2 == 2 || carta2 == 3 )
    se (carta3 == 1 || carta3 == 2 || carta3 == 3 ) */

    public static void main(String[] args) throws Exception {
        Scanner jogo = new Scanner(System.in);

        System.out.print("Carta 1: ");
        int carta1 = jogo.nextInt();
        System.out.print("Carta 2: ");
        int carta2 = jogo.nextInt();
        System.out.print("Carta 3: ");
        int carta3 = jogo.nextInt();

        int contagem = 0;

        if (carta1 == 1 || carta1 == 2 || carta1 == 3) {
            contagem += 1;
        } if (carta2 == 1 || carta2 == 2 || carta2 == 3) {
            contagem += 1;
        } if (carta3 == 1 || carta3 == 2 || carta3 == 3) {
            contagem += 1; }

         if (contagem == 1) {
            System.out.print("TRUCO"); 
        } else if (contagem == 2) {
            System.out.print("SEIS");
        } else if (contagem == 3) {
            System.out.print("NOVE");
        } 

    jogo.close();

    }
}
