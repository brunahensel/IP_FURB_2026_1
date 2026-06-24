import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o Nº de inscrição: ");
        int inscricao = s.nextInt();

        System.out.print("Digite a altura do atleta: ");
        float altura = s.nextFloat();
        
        float alturaAlto = altura;
        float alturaBaixo = altura;
        int inscricaoAlto = inscricao;
        int inscricaoBaixo = inscricao;
        int qtdAtletas = 0;
        float somaAlturas = 0;
        float mediaAltura = 0;
        
        while (inscricao != 0) {
            qtdAtletas++;
            somaAlturas += altura;

            if (altura > alturaAlto) {
                alturaAlto = altura;
                inscricaoAlto = inscricao;

            } if (altura < alturaBaixo) {
                alturaBaixo = altura;
                inscricaoBaixo = inscricao;
            } 

                  System.out.print("Nº de inscrição: ");
                inscricao = s.nextInt();

                 System.out.print("Altura: ");
                altura = s.nextFloat();
          
            mediaAltura = somaAlturas / qtdAtletas;
        
        }

            System.out.println("O atleta mais baixo tem " + alturaBaixo + " e o seu número de inscrição é " + inscricaoBaixo);
            System.out.println("O atleta mais baixo tem " + alturaAlto + " e o seu número de inscrição é " + inscricaoAlto);
            System.out.println("A altura média do grupo de atletas é: " + mediaAltura);

        s.close();
    }
}
