import javax.swing.*;
import java.util.Scanner;

//1. cigarros = Solicita a quantidade de cigarros fumados por dia.
//2. cigarros2 = Converte a entrada (string) para um número inteiro.
//3. anosfumando = Solicita ao usuário o número de anos que ele fuma.
//4. anos = Converte a entrada (string) para um número inteiro.
//5. minutos = Define o número de minutos perdidos por cigarro (10 minutos).
//6. totais = Calcula o total de cigarros fumados ao longo dos anos (365 dias por ano).
//7. perdidos = Calcula o total de minutos perdidos com o hábito de fumar.
//8.dias = Converte os minutos perdidos para dias (1 dia = 1440 minutos).

public class desafio1 {
    public static void main(String[] args) {

        String cigarros = JOptionPane.showInputDialog("Quantos cigarros você fuma por dia?");
        int cigarros2 = Integer.parseInt(cigarros);

        String anosfumando = JOptionPane.showInputDialog("Há quantos anos você fuma?");
        int anos = Integer.parseInt(anosfumando);

        int minutos = 10;
        int totais = cigarros2 * 365 * anos;
        int perdidos = totais * minutos;
        int dias = perdidos / (60 * 24);

        JOptionPane.showMessageDialog(null, "Você perdeu aproximadamente " + dias + " dias de vida devido ao hábito de fumar.");
    }
}

//scanner
//public class desafio1 {
//    public static void main(String[] args) {
//                Scanner scanner = new Scanner(System.in);
//                System.out.print("Quantos cigarros você fuma por dia? ");
//                int cigarros = scanner.nextInt();
//                System.out.print("Há quantos anos você fuma? ");
//                int anos = scanner.nextInt();
//                int minutos = 10;
//                int totais = cigarros * 365 * anos;
//                int minperdido = totais * minutos;
//                int dias = minperdido / (60 * 24);
//                System.out.println("Você perdeu aproximadamente " + dias + " dias de vida devido ao hábito de fumar.");
//                scanner.close();
//    }
//}