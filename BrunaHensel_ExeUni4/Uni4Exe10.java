import java.util.Scanner;

public class Uni4Exe10 {
    /* entrada: idadeMarquinhos, idadeZezinho e idadeLuluzinha 
    marquinhos < zezinho && marquinhos < luluzinha = marquinhos é caçula
    se zezinho < luluzinha && zezinho < marquinhos então zezinho é o caçula
    else luluzinha é caçula
     */

    public static void main(String[] args) throws Exception {
        Scanner i = new Scanner(System.in);
        System.out.print("Idade do Marquinhos: ");
        double idadeMarquinhos = i.nextDouble();
        System.out.print("Idade do Zezinho: ");
        double idadeZezinho = i.nextDouble();
        System.out.print("Idade da Luluzinha: ");
        double idadeLuluzinha = i.nextDouble();

        if (idadeMarquinhos < idadeZezinho && idadeMarquinhos < idadeLuluzinha) {
            System.out.print("O Marquinhos é o caçula");
        }
        else if (idadeZezinho < idadeMarquinhos && idadeZezinho < idadeLuluzinha) {
            System.out.print("O Zezinho é caçula");
        } else {
            System.out.print("A Luluzinha é a caçula");
        }
        

        i.close();
    }
}
