import java.util.Scanner;

public class Uni3Exe12 {

    // entradas: nomeFunc, qtdHrs numDep
    // saida: nomeFunc, salarioBruto,salarioLiq
    // processo: salarioTrabalho = horas  * 10
        //       salarioFamilia = dependentes * 60
        //       salarioBruto = salarioTrabalho + salarioFamilia
        //       inss = (salarioTrabalho * 8,5) / 100
        //       imposto = (salarioTrabalho * 5) / 100
        //       salarioLiq = salarioBruto - (inss + imposto)
    public static void main(String[] args) {

        Scanner empresa = new Scanner(System.in);

        System.out.print("Nome do Funcionário: ");
        String nomeFunc = empresa.next();

        System.out.print("Horas Trabalhadas: ");
        float qtdHrs = empresa.nextFloat();

        System.out.print("Dependentes: ");
        float numDep = empresa.nextFloat();

        float salarioTrabalho = qtdHrs * 10;
        float salarioFamilia = numDep * 60;
        float salarioBruto = salarioTrabalho + salarioFamilia;
        float inss = (salarioTrabalho * 8.5f) / 100;
        float imposto = (salarioTrabalho * 5) / 100;
        float salarioLiq = salarioBruto - (inss + imposto);

        System.out.println("Valor do Salário Líquido: R$" + salarioLiq);

        empresa.close();
    }
}