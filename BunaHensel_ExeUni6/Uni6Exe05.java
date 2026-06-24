import java.util.Scanner;

public class Uni6Exe05 {

    public Uni6Exe05() {
        Scanner s = new Scanner(System.in);
        String[] menino = new String[5];
        String[] menina = new String[5];

        String[] perguntas = {
                "Gosta de música sertaneja?",
                "Gosta de futebol?",
                "Gosta de seriados?",
                "Gosta de redes sociais?",
                "Gosta da Oktoberfest?",
        };

        // ler respostas menino
        // ler respostas menina
        leitorRespostas(menino, menina, perguntas, s);

        // comparar
        int afinidade = calcularAfinidade(menino, menina);

        // resultado da afinidade
        resultado(afinidade);
        

        s.close();

    }

    public void leitorRespostas(String[] menino, String[]menina, String perguntas[], Scanner s) {
        System.out.println("Perguntas do Menino: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Pergunta " + (i + 1) + ": " + perguntas[i]);
            System.out.print("Resposta (SIM/NÃO/IND): ");
            menino[i] = s.next();
        }
        System.out.println("Perguntas da Menina: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Pergunta " + (i + 1) + ": " + perguntas[i]);
            System.out.print("Resposta (SIM/NÃO/IND): ");
            menina[i] = s.next();
        }
    }

    public int calcularAfinidade(String menino[], String menina[]) {
        int afinidade = 0;

        for (int i = 0; i < 5; i++) {
            if (menino[i].equalsIgnoreCase(menina[i])) {
                afinidade += 3;
            } else if (menino[i].equalsIgnoreCase("IND") || menina[i].equalsIgnoreCase("IND")) {
                afinidade += 1;
            } else {
                afinidade -= 2;
            }
        }

        return afinidade;
    }

    public void resultado(int afinidade) {
        System.out.println("RESULTADO DA AFINIDADE");
        System.out.println("Pontuação final: " + afinidade);

        if (afinidade == 15) {
            System.out.println("Casem!");
        } else if (afinidade >= 10 && afinidade <= 14) {
            System.out.println("Vocês têm muita coisa em comum!");
        } else if (afinidade >= 5 && afinidade <= 9) {
            System.out.println("Talvez não dê certo :( ");
        } else if (afinidade >= 0 && afinidade <= 4) {
            System.out.println("Vale um encontro.");
        } else if (afinidade <= -1 && afinidade >= -9) {
            System.out.println("Melhor não perder tempo");
        } else if (afinidade == -10) {
            System.out.println("Vocês se odeiam!");
        }
    }
    

    public static void main(String[] args) throws Exception {
        new Uni6Exe05();
    }
}
