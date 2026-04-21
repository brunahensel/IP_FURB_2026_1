import java.util.Scanner;

public class Uni4Exe14 {

    /* entrada: dia, mes, ano
    calcular se o ano é bissexto:
     bissexto (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
     definir quantos dias tem o mes:
    se (mes == || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)
    dias = 31;
    senao se (mes == 4 || mes == 6 || mes == 9 || mes == 11) 
    dias = 30;
    senao se (mes == 2 && bissexto)
    dias = 29;
    senao se (mes == 2 && != bissexto)
    dias 28;
    senao 
    dias = 0 - mes invalido 
    
    se ( mes <1 || mes > 12) - data inválida
    senao se ( dia < 1 || dia > dias) - data inválida
    senao - data valida */

    public static void main(String[] args) throws Exception {
        Scanner vd = new Scanner(System.in);

        System.out.print("Digite o dia: ");
        int dia = vd.nextInt();
        System.out.print("Digite o mês: ");
        int mes = vd.nextInt();
        System.out.print("Digite o ano: ");
        int ano = vd.nextInt();
        
        // calcular ano bissexto
        boolean bissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

        // definir dia do mes
        int maxDias;

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            maxDias = 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) { 
            maxDias = 30;
        } else if (mes == 2 && bissexto) {
            maxDias = 29;
        } else if (mes == 2 && !bissexto) {
            maxDias = 28;
        } else {
            maxDias = 0; 
        }

        // exibir o resultado
        if (mes < 1 || mes > 12) {
            System.out.print("Data inválida. Mês " + mes + " não existe."); 
        } else if (dia < 1 || dia > maxDias ) {
            System.out.print("Data inválida.");
        } else {
            System.out.print("Data válida.");
        }

        vd.close();
    }
}