import java.util.Scanner;

public class Uni4Exe12 {

    /* entrada: lado1, lado2, lado3
    se lado1, lado2, lado3 podem ser os comprimentos dos lados de um triângulo true >>>
    se lado1 == lado2 && lado1 == lado3 então É equilátero. 
    senão se  lado1 == lado2 && lado1 != lado3 || lado2 == lado3 && lado2 != lado1 || lado1 == lado3 && lado1 != lado2 É isóceles. 
    senão se lado1 != lado2 && lado1 != lado3 É escaleno. 

    se lado1, lado2, lado3 podem ser os comprimentos dos lados de um triângulo false >>>
    Não formam um triangulo. */

    public static void main(String[] args) throws Exception {
        Scanner triangulo = new Scanner(System.in);
        int lado1 = triangulo.nextInt();
        int lado2 = triangulo.nextInt();
        int lado3 = triangulo.nextInt();

        if ( lado1 >= lado2 + lado3 || lado2 >= lado1 + lado3 || lado3 >= lado1 + lado2) {
            System.out.print("Não formam um triangulo.");
        } else if (lado1 == lado2 && lado1 == lado3) {
            System.out.print("É equilátero.");    
        } else if (lado1 == lado2 && lado1 != lado3 || lado2 == lado3 && lado2 != lado1 || lado1 == lado3 && lado1 != lado2) {
            System.out.print("É isóceles.");
        } else {
            System.out.print("É escaleno.");
        }

        triangulo.close();
        
    }
}
