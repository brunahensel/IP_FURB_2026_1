import java.util.Scanner;

public class Uni2Exe4 {
    public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);

        double notaA = s.nextDouble();
        double notaB = s.nextDouble();

        double pesoA = 3.5;
        double pesoB = 7.5;

        double media = (notaA * pesoA + notaB * pesoB) / (pesoA + pesoB);

        System.out.println(media);

        s.close();
    }
}