import java.util.Scanner;

public class Uni4Exe19 {
    /* coordenadas X e Y
    se X == 0 && Y == 0 - quad0
    se X > 0 && Y > 0 - quad1 
    se X < 0 && Y > 0 - quad2
    se X < 0 && Y < 0 - quad3
    se X > 0 && Y < 0 - quad4 */
    public static void main(String[] args) throws Exception {
       Scanner quadrantes = new Scanner(System.in); 
        System.out.print("Ponto X: ");
        int X = quadrantes.nextInt();
        System.out.print("Ponto Y: ");
        int Y = quadrantes.nextInt();

        if (X == 0 && Y == 0) {
            System.out.print("Quadrante 0");
        } else if ( X > 0 && Y > 0) {
            System.out.print("Quadrante 1");
        } else if (X < 0 && Y > 0) {
            System.out.print("Quadrante 2");
        } else if (X < 0 && Y < 0) {
            System.out.print("Quadrante 3");
        } else if (X > 0 && Y < 0) {
            System.out.print("Quadrante 4");
        }
                
       quadrantes.close();
    }
}
