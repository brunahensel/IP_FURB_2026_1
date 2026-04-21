import java.util.Scanner;

public class Uni2Exe12 {
    /* dx = x2 - x1
    dy = y2 - y1
    distancia = √(dx * dx) + (dy * dy)
    escrever distancia com 4 casas decimais */
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("X1: ");
        double x1 = s.nextDouble();
        System.out.print("X2: ");
        double x2 = s.nextDouble();
        System.out.print("Y1: ");
        double y1 = s.nextDouble();
        System.out.print("Y2: ");
        double y2 = s.nextDouble();

        double dx = x2 - x1;
        double dy = y2 - y1;

        double distancia = Math.sqrt((dx * dx) + (dy * dy));
        System.out.println(distancia);

        s.close();
    }
}