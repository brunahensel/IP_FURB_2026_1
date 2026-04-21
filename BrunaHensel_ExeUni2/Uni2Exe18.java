import java.util.Scanner;

public class Uni2Exe18 {
    public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);

        System.out.print("Digite o comprimento da parede (m): ");
        double comprimento = s.nextDouble();

        System.out.print("Digite a altura da parede (m): ");
        double altura = s.nextDouble();

        double area = comprimento * altura;
        int azulejos = (int) Math.ceil(area * 9); /*math.ceil arredonda sempre pra cima */
        double total = azulejos * 12.50;

        System.out.println("Azulejos necessários: " + azulejos);
        System.out.println("Valor total: R$ " + total);

        s.close();
    }
}