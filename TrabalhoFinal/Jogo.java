import java.util.Random;
import java.util.Scanner;

public class Jogo {

    Random random;
    Scanner scanner;

    public Jogo() {
        random = new Random();
        scanner = new Scanner(System.in);
    }

    public void jogar() {

        System.out.println("\nBEM-VINDO AO JOGO ILHA DOS TESOUROS!         ");
        String desejaJogar;
//primeira partida smp roda pelo menos uma vez
        do {
            executarPartida();
            desejaJogar = perguntarSeDesejaReiniciar();

        } while (desejaJogar.equals("S"));

        System.out.println("\nObrigado por jogar! Até a proxima exploração! ");
        scanner.close();
    }

    void executarPartida() {

        // variaveis de configuração declaradas dentro do código
        int tamanhoIlha = 15;
        int maxJogadas = 8;
        int numTesouros = 5;
        int numArmadilhas = 5;

        // vetores da partida
        String[] ilha = new String[tamanhoIlha];        //vetor principal
        boolean[] exploradas = new boolean[tamanhoIlha]; //vetor auxiliar

        // estado da partida
        int jogadasRestantes = maxJogadas;
        int pontuacao = 0;
        int tesourosEncontrados = 0;
        int armadilhasAtivadas = 0;
        int vaziosExplorados = 0;

        iniciarIlha(ilha, numTesouros, numArmadilhas);
        iniciarControleExplorado(exploradas);
        int totalTesouros = contarTesourosNaIlha(ilha);

        boolean sair = false;

        while (!sair && jogadasRestantes > 0 && tesourosEncontrados < totalTesouros) {
            exibirMenu();
            int opcao = lerOpcaoMenu();

            switch (opcao) {
                case 1:
                    mostrarInstrucoes(maxJogadas);
                    break;
                case 2:
                    mostrarMapa(ilha, exploradas);
                    break;
                case 3:
                    int posicao = lerPosicaoParaExplorar(exploradas, tamanhoIlha);

                    exploradas[posicao] = true;
                    String item = ilha[posicao];
                    int pontos = calcularPontuacao(item);
                    pontuacao += pontos;

                    if (item.equals("OURO") || item.equals("DIAMANTE") || item.equals("RUBI")) {
                        tesourosEncontrados++;
                        System.out.println("Parabéns! Você encontrou um tesouro: " + item + " (" + pontos + " pontos)");
                    } else if (item.equals("BURACO") || item.equals("COBRA") || item.equals("ESPINHOS")) {
                        armadilhasAtivadas++;
                        System.out.println("Cuidado! Você caiu em uma armadilha: " + item + " (" + pontos + " pontos)");
                    } else {
                        vaziosExplorados++;
                        System.out.println("Que pena! Posição VAZIA. (0 pontos)");
                    }

                    jogadasRestantes--;

                    if (jogadasRestantes <= 0 || tesourosEncontrados >= totalTesouros) {
                        System.out.println("\nFim das jogadas ou todos os tesouros encontrados!");
                    }
                    break;
                case 4:
                    mostrarStatus(pontuacao, jogadasRestantes, tesourosEncontrados,
                            totalTesouros, armadilhasAtivadas, vaziosExplorados);
                    break;
                case 5:
                    System.out.println("Saindo do jogo...");
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        }

        mostrarResultadoFinal(pontuacao, jogadasRestantes, tesourosEncontrados,
                totalTesouros, armadilhasAtivadas, vaziosExplorados);
    }

    void iniciarIlha(String[] ilha, int numTesouros, int numArmadilhas) {
        for (int i = 0; i < ilha.length; i++) {
            ilha[i] = "VAZIO";
        }

        String[] tesourosPossiveis = { "OURO", "DIAMANTE", "RUBI" };
        String[] armadilhasPossiveis = { "BURACO", "COBRA", "ESPINHOS" };

        distribuirItens(ilha, numTesouros, tesourosPossiveis); //p colocar os 5 tesouros
        distribuirItens(ilha, numArmadilhas, armadilhasPossiveis); //p colocar as 5 armadilhas
    }

    void distribuirItens(String[] ilha, int quantidade, String[] tiposPossiveis) {
        int colocados = 0;

        while (colocados < quantidade) {
            int posicao = random.nextInt(ilha.length); // sorteia uma posição de 0 a 14

            if (ilha[posicao].equals("VAZIO")) { // verifica se a posiçao está vazia
                String item = tiposPossiveis[random.nextInt(tiposPossiveis.length)]; // sorteia um item do tipo possível
                ilha[posicao] = item; // coloca o item na ilha
                colocados++; // incrementa o contador de itens colocados
            }
        }
    }

    void iniciarControleExplorado(boolean[] exploradas) { //reseta o vetor auxiliar
        for (int i = 0; i < exploradas.length; i++) {
            exploradas[i] = false; //marca todas as posiçoes como nn exploradas no inicio do jogo
        }
    }

    int contarTesourosNaIlha(String[] ilha) { //é int pq ta retornando o número do contador q tbm é int
        int contador = 0;
        for (int i = 0; i < ilha.length; i++) {
             if (ilha[i].equals("OURO") || ilha[i].equals("DIAMANTE")
                || ilha[i].equals("RUBI")) {
                contador++;
            }
        }
        return contador;
    }

    void exibirMenu() {
        System.out.println("\n==== ILHA DOS TESOUROS ====");
        System.out.println("1 - Mostrar instruções");
        System.out.println("2 - Mostrar mapa");
        System.out.println("3 - Jogar");
        System.out.println("4 - Mostrar status");
        System.out.println("5 - Sair");
        System.out.println("Escolha uma opção: ");
    }

    int lerOpcaoMenu() {
        int opcao = scanner.nextInt();
        scanner.nextLine(); //limpa o scanner
        return opcao;
    }
// -------

    void mostrarInstrucoes(int maxJogadas) {
        System.out.println("INSTRUÇÕES DO JOGO:");
        System.out.println("\nVocê tem " + maxJogadas + " jogadas para encontrar os tesouros escondidos na ilha.");
        System.out.println("Para explorar uma posição, escolha a opção 'Jogar' e informe um número de 0 a 14.");
        System.out.println("Cada posição pode conter um tesouro, uma armadilha ou estar vazia.");
        System.out.println("\nOs tesouros 'RUBI', 'DIAMANTE' e 'OURO' valem pontos diferentes:");
        System.out.println("  - RUBI: 15 pontos");
        System.out.println("  - DIAMANTE: 20 pontos");
        System.out.println("  - OURO: 10 pontos");
        System.out.println("\nMas cuidado com as armadilhas 'BURACO', 'COBRA' e 'ESPINHOS', que reduzem sua pontuação:");
        System.out.println("  - BURACO: -5 pontos");
        System.out.println("  - COBRA: -10 pontos");
        System.out.println("  - ESPINHOS: -7 pontos");
        System.out.println("\nBoa sorte na sua exploração!");
    }

    void mostrarMapa(String[] ilha, boolean[] exploradas) {
        System.out.println("   MAPA DA ILHA     ");
            for (int i = 0; i < ilha.length; i++) {
            if (exploradas[i]) {

                System.out.println("Posição " + i + ": " + ilha[i]);
            } else {
                System.out.println("Posição " + i + ": ?");
            }
        }
    }

    int lerPosicaoParaExplorar(boolean[] exploradas, int tamanhoIlha) {
        int posicao;

        do {
            System.out.print("\nDigite a posição que deseja explorar (0 a " + (tamanhoIlha - 1) + "): ");
            posicao = scanner.nextInt();

            if (posicao < 0 || posicao >= tamanhoIlha) {
                System.out.println("Posição inválida! Escolha um número de 0 a " + (tamanhoIlha - 1) + ".");
            } else if (exploradas[posicao]) {
                System.out.println("Você já explorou essa posição! Escolha outra.");
            }
        } while (posicao < 0 || posicao >= tamanhoIlha || exploradas[posicao]);

        return posicao;
    }

    int calcularPontuacao(String item) {
        if (item.equals("OURO")) return 10;
        else if (item.equals("DIAMANTE")) return 20;
        else if (item.equals("RUBI")) return 15;
        else if (item.equals("BURACO")) return -5;
        else if (item.equals("COBRA")) return -10;
        else if (item.equals("ESPINHOS")) return -7;
        else return 0;
    }

    void mostrarStatus(int pontuacao, int jogadasRestantes, int tesourosEncontrados,
                       int totalTesouros, int armadilhasAtivadas, int vaziosExplorados) {
        System.out.println("     STATUS DO JOGADOR     ");
        System.out.println("Pontuação atual     : " + pontuacao);
        System.out.println("Jogadas restantes    : " + jogadasRestantes);
        System.out.println("Tesouros encontrados : " + tesourosEncontrados + " de " + totalTesouros);
        System.out.println("Armadilhas ativadas  : " + armadilhasAtivadas);
        System.out.println("Posições vazias      : " + vaziosExplorados);
    }

    void mostrarResultadoFinal(int pontuacao, int jogadasRestantes, int tesourosEncontrados,
                              int totalTesouros, int armadilhasAtivadas, int vaziosExplorados) {
        System.out.println("      FIM DA PARTIDA       ");
        mostrarStatus(pontuacao, jogadasRestantes, tesourosEncontrados,
                totalTesouros, armadilhasAtivadas, vaziosExplorados);

        if (tesourosEncontrados >= totalTesouros) {
            System.out.println("Você encontrou TODOS os tesouros da ilha!");
        } else if (jogadasRestantes <= 0) {
            System.out.println("\nSuas jogadas acabaram! Fim da exploração.");
        } else {
            System.out.println("\nVocê encerrou a exploração mais cedo.");
        }
        System.out.println("\nPontuação final: " + pontuacao + " pontos.");
    }

    String perguntarSeDesejaReiniciar() {
        String resposta;

        do {
            System.out.print(" Deseja jogar novamente? (S/N): ");
            resposta = scanner.next();
            resposta = resposta.toUpperCase();

            if (!resposta.equals("S") && !resposta.equals("N")) {
                System.out.println("Resposta inválida! Digite S para sim ou N para não.");
            }
        } while (!resposta.equals("S") && !resposta.equals("N"));

        return resposta;
    }

}
