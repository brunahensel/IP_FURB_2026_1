import java.util.Scanner;

public class Uni2Exe17 {
/* entrada: nomeFunc, horas, dependentes

salarioTrabalho = horas * 10
salarioFamilia = dependentes * 60
salarioBruto = salarioTrabalho + salarioFamilia

inss = (salarioTrabalho * 8,5) / 100
imposto = (salarioTrabalho * 5) / 100

salarioLiquido = salarioBruto - (inss + imposto) */
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Nome do funcionário: ");
        String nomeFunc = s.next();
        System.out.print("Horas trabalhadas no mês: ");
        Double horas = s.nextDouble();
        System.out.print("Número de dependentes: ");
        int dependentes = s.nextInt();

        double salarioTrabalho = horas * 10;
        double salarioFamilia = dependentes * 60;
        double salarioBruto = salarioTrabalho + salarioFamilia;

        double inss = (salarioTrabalho * 8.5) / 100;
        double imposto = (salarioTrabalho * 5) / 100;

        double salarioLiquido = salarioBruto - (inss + imposto);

        System.out.println("Nome: " + nomeFunc);
        System.out.println("Salário Bruto: R$" + salarioBruto);
        System.out.println("Salário Líquido: R$" + salarioLiquido);

        s.close();
    }
}