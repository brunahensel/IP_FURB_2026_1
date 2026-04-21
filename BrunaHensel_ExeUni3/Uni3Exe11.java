import java.util.Scanner;

public class Uni3Exe11 {
    //entrada: temperatura em C°
    //processo: Faren = (9/5) °C + 32
    //saida: temperatura em °F
     public static void main(String[] args) throws Exception {
        Scanner temp = new Scanner(System.in);
        System.out.print("Digite a temperatura em C°: ");
        Float graus = temp.nextFloat();

        float Faren = (graus * 9/5) + 32;

        System.out.print("A temperatura é de: " + Faren + "°F");

        temp.close();
    }
}
