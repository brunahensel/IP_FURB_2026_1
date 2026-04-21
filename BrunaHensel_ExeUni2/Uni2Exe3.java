import java.util.Scanner;

public class Uni2Exe3 {
    public static void main(String[] args) throws Exception {
         Scanner s = new Scanner(System.in);

        double raio = s.nextDouble();

        double area = raio * raio * 3.14159;

        System.out.println(area);

        s.close();
    }
}