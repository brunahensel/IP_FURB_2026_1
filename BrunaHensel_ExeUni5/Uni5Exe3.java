import java.util.Scanner;

public class Uni5Exe3 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        double soma = 0;
    
        for (int n = 1; n <= 100; n++) {
            soma = soma + (1.0 / n);
        }
            System.out.println(soma);

        s.close();
    }
}