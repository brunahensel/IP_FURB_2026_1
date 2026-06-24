import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Nome do aluno: ");
        String nome = s.nextLine();
        
        while (!nome.equals("fim")) {

            System.out.print("Primeira nota: ");
            double nota1 = s.nextDouble();
            System.out.print("Segunda nota: ");
            double nota2 = s.nextDouble();
            s.nextLine();
            double media = (nota1 + nota2) / 2;
            System.out.println("A média do(a) " + nome + " é " + media);

            nome = s.nextLine();
        }
        s.close();
    }
}