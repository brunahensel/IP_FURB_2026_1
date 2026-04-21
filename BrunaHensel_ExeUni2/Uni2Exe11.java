import java.util.Scanner;

public class Uni2Exe11 {

/* entrada: valor ponto A, valor ponto B, valor ponto C
processo:
a) área triangulo retangulo = valorA * valorC / 2
b) área circulo = 3.14159 * C * C
c) área trapezio = (valorA + valorB) * valorC / 2
d) área quadrado = valorB * valorB
e) área retângulo = valorA * valorB
saída: valor das áreas desejadas */

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Valor A: ");
        double valorA = s.nextDouble();
        System.out.print("Valor B: ");
        double valorB = s.nextDouble();
        System.out.print("Valor C: ");
        double valorC = s.nextDouble();
        
        double triangulo = (valorA * valorC) / 2;
        double circulo = 3.14159 * (valorC * valorC);
        double trapezio = (valorA + valorB) * valorC / 2;
        double quadrado = valorB * valorB;
        double retangulo = valorA * valorB;

        System.out.println("TRIANGULO: " + triangulo);
        System.out.println("CIRCULO: " + circulo);
        System.out.println("TRAPEZIO: " + trapezio);
        System.out.println("QUADRADO: " + quadrado);
        System.out.println("RETANGULO: " + retangulo);

        s.close();
    }
}
