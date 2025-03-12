import java.util.Scanner;

import javax.swing.*;

//1. int primeiroTermo = Solicita ao usuário o primeiro termo da progressão aritmética (PA).
//2. int razao  = Solicita ao usuário a razão da progressão aritmética.
//3. int soma = 0; = Inicializa a variável que armazenará a soma dos termos da PA.
//4. int termo = primeiroTermo; = Inicializa a variável termo com o valor do primeiro termo da PA.
//5. String termosPA = ""; = Inicializa uma string para armazenar os 10 primeiros termos da PA.
//6. for (int i = 1; i <= 10; i++) { = Inicia o loop que vai gerar os 10 primeiros termos da PA.
//7. termosPA += termo + " "; = Adiciona o termo atual à string termosPA.
//8. soma += termo; = Soma o termo atual ao total da soma.
//9. termo += razao; = Atualiza o valor do termo somando a razão, preparando para o próximo termo da PA.
//10. (null, "Os 10 primeiros termos da PA são:\n" + termosPA); = Exibe os 10 primeiros termos da PA.
//11. (null, "A soma de todos os termos da PA é: " + soma); = Exibe a soma de todos os termos da PA.
public class desafio7 {
    public static void main(String[] args) {

        int primeiroTermo = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro termo da PA:"));
        int razao = Integer.parseInt(JOptionPane.showInputDialog("Digite a razão da PA:"));

        int soma = 0;
        int termo = primeiroTermo;
        String termosPA = "";


        for (int i = 1; i <= 10; i++) {
            termosPA += termo + " "; // Adiciona o termo à sequência
            soma += termo; // Soma o termo à variável soma
            termo += razao; // Atualiza o termo com a razão
        }

        // Exibindo os resultados usando JOptionPane
        JOptionPane.showMessageDialog(null, "Os 10 primeiros termos da PA são:\n" + termosPA);
        JOptionPane.showMessageDialog(null, "A soma de todos os termos da PA é: " + soma);
    }
}


//public class desafio7 {
//    public static void main(String[] args) {
//                Scanner scanner = new Scanner(System.in);
//
//                System.out.print("Digite o primeiro termo da PA: ");
//                int primeiroTermo = scanner.nextInt();
//                System.out.print("Digite a razão da PA: ");
//                int razao = scanner.nextInt();
//
//                int soma = 0;
//                int termo = primeiroTermo;
//
//                System.out.println("Os 10 primeiros termos da PA são: ");
//                for (int i = 1; i <= 10; i++) {
//                    System.out.print(termo + " ");
//                    soma += termo;
//                    termo += razao;
//                }
//
//                System.out.println("\nA soma de todos os termos da PA é: " + soma);
//            }
//        }

