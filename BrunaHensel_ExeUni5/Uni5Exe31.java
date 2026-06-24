import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o número: ");
        int n = s.nextInt();
        int d = 2;

        while (n > 1) {
            while (n % d == 0) {
                System.out.println(n + " | " + d);
                n = n / d;
            }
            d++;
        }
            System.out.println(1);

        s.close();
    }
}
