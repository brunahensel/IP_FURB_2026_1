import java.util.Scanner;

public class Uni5Exe1 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int numero = 0;
    
        for (int contador = 1; contador <= 20; contador++) {
            numero = s.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Ímpar");
        }
    }
        
        s.close();
    }
}