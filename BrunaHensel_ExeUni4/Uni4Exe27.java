import java.util.Scanner;

public class Uni4Exe27 {
    /* entradas: horaChegada, minutoChegada, horaPartida, minutoPartida 
    transformar tudo em min chegada = horaChegada * 60 + minutoChegada 
    transformar tudo em min partida = horaPartida * 60 + minutoChegada
    diferenca = totalMinPartida - totalMinChegada

    horas = diferenca / 60
    minutosRest = diferenca % 60

    arredonda
    se diferenca < 30 --> horas = 1
    se diferenca >= 30 --> horas = horas + 1

    se horas == 1 || horas == 2
    qtdPagar = horas * 5.0
    se horas == 3 || horas == 4
    qtdPagar = 10 + (horas - 2) * 7.5
    se horas >= 5
    qtdPagar = 10 + 15 + (horas - 4) * 10
    */
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.print("Hora da Chegada: ");
        int horaChegada = s.nextInt();
        System.out.print("Minuto da Chegada: ");
        int minutoChegada = s.nextInt();
        System.out.print("Hora da Partida: ");
        int horaPartida = s.nextInt();
        System.out.print("Minuto da Partida: ");
        int minutoPartida = s.nextInt();

        int totalMinChegada = (horaChegada * 60) + minutoChegada;
        int totalMinPartida = (horaPartida * 60) + minutoPartida;
        int diferenca = totalMinPartida - totalMinChegada;

        int horas = diferenca / 60;
        int minutosRest = diferenca % 60;

        if (diferenca < 30) {
            horas = 1;
        } else if (diferenca >= 30) {
            horas = horas + 1;
        }

        
        if (horas == 1 || horas == 2) {
            double qtdPagar = horas * 5.0;
            System.out.print("Preço cobrado: R$" + qtdPagar);
        } else if (horas == 3 || horas == 4) {
            double qtdPagar =  10 + (horas -2) * 7.5;
            System.out.print("Preço cobrado: R$" + qtdPagar);
        } else if (horas >= 5) {
            double qtdPagar = 10 + 15 + (horas - 4) * 10.0;
            System.out.print("Preço cobrado: R$" + qtdPagar);
        }

        s.close();
    }
}