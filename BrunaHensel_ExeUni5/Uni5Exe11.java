import java.util.Scanner;

public class Uni5Exe11 {
    public static void main(String[] args) throws Exception {
       Scanner s = new Scanner(System.in);
       int biscoitos = 0;
       int total = 0;

       for (int i = 1; i <= 16; i++) {
            if (i == 1) {
                biscoitos = 1;
            } else if (i == 2) {
                biscoitos = 3;
            } else {
                biscoitos = biscoitos * 3;
            }
            total += biscoitos;
       }

       System.out.print("Total de biscoitos quebrados: " + total);

       s.close();
    }
}
