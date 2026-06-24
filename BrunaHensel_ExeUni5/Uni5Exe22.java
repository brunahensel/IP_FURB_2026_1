public class Uni5Exe22 {
    public static void main(String[] args) {
        double salario = 2000.0;
        double aumento = 1.5;
        int anoAtual = 2026;

        for (int ano = 1996; ano <= anoAtual; ano++) {
            salario += salario * (aumento / 100);
            if (ano >= 1997) aumento *= 2;
        }

        System.out.println("Ano: " + anoAtual);
        System.out.printf("Salário atual: R$ %.2f%n", salario);
    }
}