
import javax.swing.*;
import java.util.Random;


//1.Random random = new Random(); = Cria um objeto para gerar números aleatórios.
//2. int sorteado = random.nextInt(5) + 1; = Sorteia um número entre 1 e 5.
//3. int tentativas = 0; = Conta o número de tentativas feitas.
//4. int usuario = 0; = Inicializa a variável que armazenará a escolha do jogador.
//5. while (usuario != sorteado) = Loop que continua até o jogador acertar o número.
//6. String input = JOptionPane.showInputDialog(null, "Tente adivinhar o número (entre 1 e 5):"); = Pede ao jogador para tentar adivinhar o número.
//7. usuario = Integer.parseInt(input); = Converte a entrada do jogador em um número inteiro.
// 8. tentativas++; = Incrementa o número de tentativas.
//9. if (usuario < sorteado) = Verifica se o número do jogador é menor que o sorteado.
//10. (null, "O número sorteado é maior!"); = Informa ao jogador que o número sorteado é maior.
//11. else if (usuario > sorteado) = Verifica se o número do jogador é maior que o sorteado.
//12. (null, "O número sorteado é menor!"); = Informa ao jogador que o número sorteado é menor.
//13. else = Caso o jogador tenha acertado o número.
//14. (null, "Parabéns! Você acertou o número em " + tentativas + " tentativas."); = Informa ao jogador que ele acertou e o número de tentativas.

public class desafio6 {
    public static void main(String[] args) {
        Random random = new Random();
        int sorteado = random.nextInt(10) + 1;

        int tentativas = 0;
        int usuario = 0;
        int maxtentativas = 4;

        while (tentativas < maxtentativas) {
            String input = JOptionPane.showInputDialog(null, "Tente adivinhar o número (entre 1 e 10):");
            usuario = Integer.parseInt(input);
            tentativas++;

            if (usuario < sorteado) {
                JOptionPane.showMessageDialog(null, "O número sorteado é maior!");
            } else if (usuario > sorteado) {
                JOptionPane.showMessageDialog(null, "O número sorteado é menor!");
            } else {
                JOptionPane.showMessageDialog(null, "Parabéns! Você acertou o número em " + tentativas + " tentativas.");
                break;
            }

            if (tentativas == maxtentativas) {
                JOptionPane.showMessageDialog(null, "Você esgotou suas tentativas! O número sorteado era: " + sorteado);
            } else {
                JOptionPane.showMessageDialog(null, "Você ainda tem " + (maxtentativas - tentativas) + " tentativas restantes.");
            }
        }
    }
}

//public class desafio6 {
//    public static void main(String[] args) {
//                Random random = new Random();
//                int sorteado = random.nextInt(10) + 1; // Sorteia um número entre 1 e 10
//
//                Scanner scanner = new Scanner(System.in);
//                int tentativas = 0;
//                int usuario = 0;
//                int maxtentativas = 4;
//
//                while (tentativas < maxtentativas) {
//                    System.out.print("Tente adivinhar o número (entre 1 e 10): ");
//                    usuario = scanner.nextInt();
//                    tentativas++;
//
//                    if (usuario < sorteado) {
//                        System.out.println("O número sorteado é maior!");
//                    } else if (usuario > sorteado) {
//                        System.out.println("O número sorteado é menor!");
//                    } else {
//                        System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
//                        break;
//                    }
//
//                    if (tentativas == maxtentativas) {
//                        System.out.println("Você esgotou suas tentativas! O número sorteado era: " + sorteado);
//                    } else {
//                        System.out.println("Você ainda tem " + (maxtentativas - tentativas) + " tentativas restantes.");
//                    }
//                }
//            }
//        }

