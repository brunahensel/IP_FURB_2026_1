import java.util.Scanner;

public class Uni3Exe09 {
    // entrada: raio e altura
    // processo: 3,1415 * raio² * altura
    // volume = pi * raio² * altura
    // saída: volume da lata de óleo

    public static void main(String[] args) throws Exception {
        
        Scanner oleo = new Scanner(System.in);
        System.out.print("raio: ");
        float raio = oleo.nextFloat();
        System.out.print("altura: ");
        float altura = oleo.nextFloat();

        float volume = 3.141592f * (raio * raio ) * altura;
        System.out.print("O volume da lata de óleo é: " + volume );

        oleo.close();

    }
}
