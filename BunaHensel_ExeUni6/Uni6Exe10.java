import java.util.Scanner;

public class Uni6Exe10 {

    public Uni6Exe10() {
        Scanner s = new Scanner(System.in);
        int[] vetor = new int[50];
        int quantidade = 0;
        int opcao = 0;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Incluir valor");
            System.out.println("2 - Pesquisar valor");
            System.out.println("3 - Alterar valor");
            System.out.println("4 - Excluir valor");
            System.out.println("5 - Mostrar valores");
            System.out.println("6 - Ordenar valores");
            System.out.println("7 - Inverter valores");
            System.out.println("8 - Sair do sistema");
            System.out.print("Escolha uma opção: ");
            opcao = s.nextInt();

            switch (opcao) {
                case 1:
                    quantidade = incluirValor(vetor, quantidade, s);
                    break;
                case 2:
                    pesquisarValor(vetor, quantidade, s);
                    break;
                case 3:
                    alterarValor(vetor, quantidade, s);
                    break;
                case 4:
                    quantidade = excluirValor(vetor, quantidade, s);
                    break;
                case 5:
                    mostrarValores(vetor, quantidade);
                    break;
                case 6:
                    ordenarValores(vetor, quantidade);
                    break;
                case 7:
                    inverterValores(vetor, quantidade);
                    break;
                case 8:
                    System.out.println("Sistema encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 8);

        s.close();
    }

    // Opção 1
    public int incluirValor(int[] vetor, int quantidade, Scanner s) {
        if (quantidade < 50) {
            System.out.print("Digite o valor para incluir: ");
            vetor[quantidade] = s.nextInt();
            System.out.println("Valor incluído com sucesso!");
            quantidade++;
        } else {
            System.out.println("Erro: Vetor cheio!");
        }
        return quantidade;
    }

    // Opção 2
    public void pesquisarValor(int[] vetor, int quantidade, Scanner s) {
        if (quantidade == 0) {
            System.out.println("Vetor vazio. Não há nada para pesquisar.");
            return;
        }

        System.out.println("Digite um valor para buscar no vetor: ");
        int valorBuscar = s.nextInt();
        for (int i = 0; i < quantidade; i++) {
            if (vetor[i] == valorBuscar) {
                System.out.println("O valor " + valorBuscar + " foi encontrado na posição " + i + ".");
                return;
            }
        }
        System.out.println("Número não encontrado no vetor.");
    }

    // Opção 3
    public void alterarValor(int[] vetor, int quantidade, Scanner s) {
        System.out.println("Digite um valor para alterar no vetor: ");
        int valorAlterar = s.nextInt();
        for (int i = 0; i < quantidade; i++) {
            if (vetor[i] == valorAlterar) {
                System.out.println("Digite o número novo: ");
                int numeroNovo = s.nextInt();
                vetor[i] = numeroNovo;
                return;
            }
        }
        System.out.println("Número não encontrado no vetor.");
    }

    // Opção 4
    public int excluirValor(int[] vetor, int quantidade, Scanner s) {
        if (quantidade == 0) {
            System.out.println("Vetor vazio! Não há o que excluir.");
            return quantidade;
        }

        System.out.print("Digite o valor que deseja excluir: ");
        int valorExcluir = s.nextInt();

        for (int i = 0; i < quantidade; i++) {
            if (vetor[i] == valorExcluir) {
                for (int j = 0; j < quantidade - 1; j++) {
                    vetor[j] = vetor[j + 1];
                }
                System.out.println("Valor excluído com sucesso!");
                quantidade--;
                return quantidade;
            }
        }
        System.out.println("Número não encontrado no vetor.");
        return quantidade;
    }

    // Opção 5
    public void mostrarValores(int[] vetor, int quantidade) {
        if (quantidade == 0) {
            System.out.println("Vetor vazio.");
            return;
        }
        System.out.print("Vetor atual: ");
        for (int i = 0; i < quantidade; i++) {
            System.out.print("[" + vetor[i] + "] ");
        }
        System.out.println();
    }

    // Opção 6
    public void ordenarValores(int[] vetor, int quantidade) {
        if (quantidade <= 1) {
            System.out.println("Não há elementos suficientes para ordenar.");
            return;
        }

        for (int i = 0; i < quantidade - 1; i++) {
            for (int j = 0; j < quantidade - 1; j++) {

                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
        System.out.println("Vetor ordenado com sucesso!");
    }

    // Opção 7
    public void inverterValores(int[] vetor, int quantidade) {
        if (quantidade <= 1) {
            System.out.println("Não há elementos suficientes para inverter.");
            return;
        }
        int temp = 0;
        for (int i = 0; i < quantidade / 2; i++) {
            int fim = quantidade - 1 - i;
            temp = vetor[i];
            vetor[i] = vetor[fim];
            vetor[fim] = temp;
        }
        System.out.println("Vetor invertido com sucesso!");
    }

    public static void main(String[] args) throws Exception {
        new Uni6Exe10();
    }
}