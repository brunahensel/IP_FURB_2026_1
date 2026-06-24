import java.util.Scanner;

public class Uni5Exe9 {
    /* ENTRADA: valor de n e pra cada aluno nome e idade
    se tiver 18 anos imprime o nome
    qtd acima de 20 conta quantos alunos tem idade +20 e imprime
     */
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        int contador = 0;
        String nomes = "";

        for(int i = 1; i <= n; i++) {
            System.out.print("Nome: ");
            String nome = s.nextLine();
            System.out.print("Idade: ");
            int idade = s.nextInt();
            s.nextLine();
            
            if (idade == 18) {
                nomes = nomes + nome + "\n";
            } if (idade >= 20) {
                contador++;
            }
        }

        System.out.println("Quantidade de alunos que tem idade acima de 20 anos: " + contador);
        System.out.println("Nomes dos alunos que tem 18 anos: " + nomes );

        s.close();
    }
}
