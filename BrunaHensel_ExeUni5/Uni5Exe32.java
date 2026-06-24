import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        
        System.out.print("Em que dia da semana cai o dia 1? (1=Dom, 2=Seg, ..., 7=Sab): ");
        int p = s.nextInt();
        
        System.out.print("Quantos dias tem o mês?: ");
        int n = s.nextInt();

        System.out.println("\nDom\tSeg\tTer\tQua\tQui\tSex\tSab");
       

        for (int i = 1; i < p; i++) {
            System.out.print("\t");
        }

        int diaSemanaAtual = p;

        for (int dia = 1; dia <= n; dia++) {
            System.out.print(dia + "\t");

            if (diaSemanaAtual == 7) {
                System.out.println();
                diaSemanaAtual = 1;
            } else {
                diaSemanaAtual++;
            }
        }
        
        System.out.println(); 
        s.close();
    }
}