import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Canal: ");
        int canal = s.nextInt();
        int pessoasCanal4 = 0;
        int pessoasCanal5 = 0;
        int pessoasCanal9 = 0;
        int pessoasCanal12 = 0;
        float TotalPessoas = 0;

        while (canal != 0) {
            System.out.print("Pessoas: ");
            int pessoas = s.nextInt();

            switch (canal) {
                case 4:
                    pessoasCanal4 += pessoas;
                    break;
                 case 5:
                    pessoasCanal5 += pessoas;
                    break;
                case 9:
                    pessoasCanal9 += pessoas;
                    break;
                case 12:
                    pessoasCanal12 += pessoas;
            }

            TotalPessoas += pessoas;
               
            System.out.print("Canal: ");
            canal = s.nextInt();

        }

            float percentualCanal4 = (pessoasCanal4 / TotalPessoas) * 100;
            float percentualCanal5 = (pessoasCanal5 / TotalPessoas) * 100;
            float percentualCanal9 = (pessoasCanal9 / TotalPessoas) * 100;
            float percentualCanal12 = (pessoasCanal12 / TotalPessoas) * 100;

            System.out.println("Percentual de audiência do canal 4: " + percentualCanal4);
            System.out.println("Percentual de audiência do canal 5: " + percentualCanal5);
            System.out.println("Percentual de audiência do canal 9: " + percentualCanal9);
            System.out.println("Percentual de audiência do canal 12: " + percentualCanal12);


        s.close();
    }
}