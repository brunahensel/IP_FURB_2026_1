import java.util.Scanner;

public class Uni2Exe5 {
    public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);

    int A = s.nextInt();
    int B = s.nextInt();
    int C = s.nextInt();
    int D = s.nextInt();

    int diferenca = (A * B) - (C * D);

    System.out.println(diferenca);

    s.close();

    }
}