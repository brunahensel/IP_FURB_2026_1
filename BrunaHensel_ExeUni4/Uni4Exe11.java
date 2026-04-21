import java.util.Scanner;

public class Uni4Exe11 {

    /* entrada: nasc1 nasc2 e nasc3 
    se nasc1 = nasc2  && nasc1 != nasc3 || nasc1 = nasc3 && nasc3 != nasc2 || nasc2 = nasc3 && nasc2 != nasc1 então são GEMEOS
    se senão nasc1 = nasc2 e nasc1 = nasc3 então nasc1 nasc2 nasc3 sao TRIGEMEOS
    senão então nasc1 nasc2 nasc3 sao APENAS IRMAOS */

    public static void main(String[] args) throws Exception {
        Scanner g = new Scanner(System.in);

            double nasc1 = g.nextDouble();
            double nasc2 = g.nextDouble();
            double nasc3 = g.nextDouble();

        if (nasc1 == nasc2 && nasc1 != nasc3 || nasc1 == nasc3 && nasc1 != nasc2 || nasc2 == nasc3 && nasc2 != nasc1) {
            System.out.print("GÊMEOS");
        } 
        else if ( nasc1 == nasc2 && nasc1 == nasc3) {
            System.out.print("TRIGÊMEOS");
        } else {
            System.out.print("APENAS IRMÃOS");
        }

         g.close();
    }
}