import java.util.Scanner;

public class Uni4Exe1 {

      /* entrada: horas trabalhadas, valor pago por hora
        processo: 
        horaMes = 160
        salario = horasTrab * valorHora

        - if (horasTrab > 160 ) 
        horaExtra = horasTrab - 160
        valorExtra = horaExtra * (valorHora + valorHora * 0,5);
        salario = salario + valorExtra -

        saida: salario */

    public static void main(String[] args) throws Exception {
        Scanner t = new Scanner(System.in);

        System.out.print("Horas Trabalhadas no mês: ");
        double horasTrab =  t.nextDouble();
        System.out.print("Valor pago por hora: R$");
        double valorHora = t.nextDouble();

        int horaMes = 160;

        Double salario = horasTrab * valorHora;

        if (horasTrab > horaMes) {
          double horaExtra = horasTrab - horaMes;
          double valorExtra = horaExtra * (valorHora * 0.5);
          salario = salario + valorExtra;
          /* se repetir a variavel ( salario += valorExtra) */

        }
         
        System.out.print("O salário total é: R$" + salario);
   
        t.close();

    }
}