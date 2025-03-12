import javax.swing.*;

//1. n1 = Solicita ao usuário o primeiro número e converte a entrada para um número inteiro.
//2. n2 = Solicita ao usuário o segundo número e converte a entrada para um número inteiro.
//3. n3 = Solicita ao usuário o terceiro número e converte a entrada para um número inteiro.
//4. if (n1 < n2 + n3 && n1 < +n3 && n3 < n1 + n2) = Verifica se a soma de dois lados é maior que o terceiro lado
//5. (null, "parabens você formou um triângulo") = Exibe uma mensagem se os três números formarem um triângulo.
//6. else = Caso a condição do if não seja atendida.
//7. (null, "Você não formou triangulo") = Exibe uma mensagem se os três números não formarem um triângulo.



public class Desafio2 {
    public static void main(String[] args) {
        int n1= Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número: "));

        if (n1 < n2 + n3 &&  n1 < + n3 && n3 < n1 + n2) {
            JOptionPane.showMessageDialog(null, "parabens você formou um triângulo");
        }else{
            JOptionPane.showMessageDialog(null, "Você não formou triangulo");
        }
    }
}

//scanner
//import java.util.Scanner;
//
//    public class Desafio2 {
//        public static void main(String[] args) {
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
//        if (n1 < n2 + n3 && n2 < n1 + n3 && n3 < n1 + n2) {
//            System.out.println("Parabéns, você formou um triângulo!");
//        } else {
//            System.out.println("Você não formou um triângulo.");
//        }
//
//        scanner.close();
//    }
//}


