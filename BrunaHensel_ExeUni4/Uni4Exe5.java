import java.util.Scanner;

public class Uni4Exe5 {

    /* entrada: true/false
    se a entrada for true digite "Sim"
    se não digite "Não" */

    public static void main(String[] args) throws Exception {
       Scanner ceu = new Scanner(System.in);
       System.out.print("a cor é azul?");
    
       boolean corAzul = false;
    
        if (corAzul) {
            System.out.print(" Sim");
        }
        else {
            System.out.print(" Não");
        }

       ceu.close();
    
    }
}