import javax.swing.*;

//1. n1 = Solicita ao usuário o primeiro número e converte a entrada para um número inteiro.
//2. n2 = Solicita ao usuário o segundo número e converte a entrada para um número inteiro.
//3. n3 = Solicita ao usuário o terceiro número e converte a entrada para um número inteiro.
//4. if (n1 < n2 + n3 && n2 < n1 + n3 && n3 < n1 + n2) = Verifica se a soma de dois lados é maior que o terceiro lado, o que é necessário para formar um triângulo.
//5. (null, "Parabéns, você formou um triângulo!") = Exibe uma mensagem de sucesso se os números formarem um triângulo.
//6. if (n1 == n2 && n2 == n3) = Verifica se os três lados são iguais, indicando um triângulo EQUILÁTERO.
//7. (null, "O triângulo é EQUILÁTERO (todos os lados iguais).") = Exibe a mensagem informando que o triângulo é equilátero.
//8. else if (n1 == n2 || n1 == n3 || n2 == n3) = Verifica se dois lados são iguais, indicando um triângulo ISÓSCELES.
//9. (null, "O triângulo é ISÓSCELES (dois lados iguais).") = Exibe a mensagem informando que o triângulo é isósceles.
//10. else = Caso contrário, se os três lados forem diferentes, o triângulo é ESCALENO.
// 11. (null, "O triângulo é ESCALENO (todos os lados diferentes).") = Exibe a mensagem informando que o triângulo é escaleno.
//12. else = Caso os três números não formem um triângulo, entra aqui.
//13. (null, "Você não formou um triângulo.") = Exibe uma mensagem informando que não foi possível formar um triângulo.

public class desafio3 {
    public static void main(String[] args) {

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número: "));

        // Verificando se pode formar um triângulo
        if (n1 < n2 + n3 && n2 < n1 + n3 && n3 < n1 + n2) {
            JOptionPane.showMessageDialog(null, "Parabéns, você formou um triângulo!");

            // Verificando o tipo de triângulo
            if (n1 == n2 && n2 == n3) {
                JOptionPane.showMessageDialog(null, "O triângulo é EQUILÁTERO (todos os lados iguais).");
            } else if (n1 == n2 || n1 == n3 || n2 == n3) {
                JOptionPane.showMessageDialog(null, "O triângulo é ISÓSCELES (dois lados iguais).");
            } else {
                JOptionPane.showMessageDialog(null, "O triângulo é ESCALENO (todos os lados diferentes).");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Você não formou um triângulo.");
        }
    }
}

//scanner

//import java.util.Scanner;
//
//public class desafio3 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Digite o primeiro número: ");
//        int n1 = scanner.nextInt();
//
//        System.out.print("Digite o segundo número: ");
//        int n2 = scanner.nextInt();
//
//        System.out.print("Digite o terceiro número: ");
//        int n3 = scanner.nextInt();
//
//        // Verificando se pode formar um triângulo
//        if (n1 < n2 + n3 && n2 < n1 + n3 && n3 < n1 + n2) {
//            System.out.println("Parabéns, você formou um triângulo!");
//
//            // Verificando o tipo de triângulo
//            if (n1 == n2 && n2 == n3) {
//                System.out.println("O triângulo é EQUILÁTERO (todos os lados iguais).");
//            } else if (n1 == n2 || n1 == n3 || n2 == n3) {
//                System.out.println("O triângulo é ISÓSCELES (dois lados iguais).");
//            } else {
//                System.out.println("O triângulo é ESCALENO (todos os lados diferentes).");
//            }
//        } else {
//            System.out.println("Você não formou um triângulo.");
//        }
//
//        scanner.close();
//    }
//}
