import java.util.Scanner;
import javax.swing.JOptionPane;

import javax.swing.*;

//1. opcoes = Array com as opções "Pedra", "Papel" e "Tesoura".
//2. input = Solicita a escolha do usuário.
//3. usuario = Converte a escolha do usuário para um número.
//4. computador = Define a escolha fixa do computador como "Pedra" (0).
//5. = Exibe as escolhas do usuário e do computador.
//6. if (usuario == computador) = Verifica empate.
//7. else if (usuário venceu) = Verifica se o jogador venceu.
//8. (null, "Você venceu!") = Mostra mensagem de vitória do jogador.
//9. else = Se não for empate nem vitória do jogador, o computador venceu.
//10. (null, "Você perdeu!") = Mostra mensagem de derrota.

    public class desafio4 {
        public static void main(String[] args) {
            String[] opcoes = {"Pedra", "Papel", "Tesoura"};

            String input = JOptionPane.showInputDialog(null,
                "Escolha uma opção: \n0 - Pedra\n1 - Papel\n2 - Tesoura");

            int usuario = Integer.parseInt(input);
            int computador = 0;

            JOptionPane.showMessageDialog(null, "Você escolheu: " + opcoes[usuario] + "\nComputador escolheu: " + opcoes[computador]);

              if (usuario == computador) {
                JOptionPane.showMessageDialog(null, "Empate!");
              } else if ((usuario == 0 && computador == 2) ||
                (usuario == 1 && computador == 0) ||
                (usuario == 2 && computador == 1)) {
            JOptionPane.showMessageDialog(null, "Você venceu!");
        } else {
            JOptionPane.showMessageDialog(null, "Você perdeu!");
        }
    }
}


//public class desafio4 {
//            public static void main(String[] args) {
//                Scanner scanner = new Scanner(System.in);
//                String[] opcoes = {"Pedra", "Papel", "Tesoura"};
//
//                System.out.println("Escolha uma opção: ");
//                System.out.println("0 - Pedra");
//                System.out.println("1 - Papel");
//                System.out.println("2 - Tesoura");
//
//                int usuario = scanner.nextInt();
//
//
//                int computador = 0;
//
//                System.out.println("Você escolheu: " + opcoes[usuario]);
//                System.out.println("Computador escolheu: " + opcoes[computador]);
//
//                if (usuario == computador) {
//                    System.out.println("Empate!");
//                } else if ((usuario == 0 && computador == 2) ||
//                        (usuario == 1 && computador == 0) ||
//                        (usuario == 2 && computador == 1)) {
//                    System.out.println("Você venceu!");
//                } else {
//                    System.out.println("Você perdeu!");
//                }
//            }
//}
