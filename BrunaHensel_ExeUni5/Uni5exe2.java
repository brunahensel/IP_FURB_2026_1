import java.util.Scanner;

public class Uni5exe2 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int somaPares = 0;
        int somaImpares = 0;

        for (int contador = 1; contador <= 100 && contador >= 1; 
            contador++) {
            if (contador % 2 == 0) {
                somaPares = somaPares + contador; 
        } else
            somaImpares = somaImpares + contador;
        } 

        System.out.println("Soma dos números pares: " + somaPares);
        System.out.println("Soma dos números ímpares: " + somaImpares);

        s.close();
    }
}