import javax.swing.*;

//1- fibonacci(int n) = Procedimento Fibonacci que recebe o número de termos a ser mostrado
//2-if (n <= 0) = Verifica se o número de termos solicitado é válido
//3-String resultado= Exibe os primeiros n termos da sequência de Fibonacci
//4 - String input= Solicita ao usuário quantos termos da sequência de Fibonacci ele deseja
//5- int termos=  Converte a entrada para um número inteiro
//6 - fibonnaci = Chama o procedimento Fibonacci passando o número de termos desejados

public class desafio10 {
    public static void fibonacci(int n) {
        int n1 = 1, n2 = 1;

        if (n <= 0) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um número maior que zero.");
            return;
        }

        String resultado = "";
        for (int i = 1; i <= n; i++) {
            resultado += n1 + " >> ";
            int proximo = n1 + n2;
            n1 = n2;
            n2 = proximo;
        }

        // Exibe a sequência com "FIM" no final
        JOptionPane.showMessageDialog(null, resultado + "FIM");
    }

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite o número de termos da sequência de Fibonacci:");

        int termos = Integer.parseInt(input);
        fibonacci(termos);
    }
}

//scanner
//import java.util.Scanner;
//
//public class desafio10 {
//    public static void Fibonacci(int n) {
//        int n1 = 1, n2 = 1;
//
//        if (n <= 0) {
//            System.out.println("Por favor, insira um número maior que zero.");
//            return;
//        }
//
//        String resultado = "";
//        for (int i = 1; i <= n; i++) {
//            resultado += n1 + " >> ";
//            int proximo = n1 + n2;
//            n1 = n2;
//            n2 = proximo;
//        }
//
//        System.out.println(resultado + "FIM");
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Digite o número de termos da sequência de Fibonacci: ");
//        int termos = scanner.nextInt();
//
//        Fibonacci(termos);
//    }
//}


