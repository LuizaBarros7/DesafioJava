
import javax.swing.*;

//1. int n1 = 1, n2 = 1; = Inicializa os dois primeiros termos da sequência de Fibonacci.
//2.String termosfibonacci = Inicia a string que armazenará os termos da sequência de Fibonacci, começando com os dois primeiros termos.
//3. for (int i = 3; i <= 10; i++) { = Inicia um loop que irá calcular os 10 primeiros termos da sequência de Fibonacci.
//4. int proximo = n1 + n2; = Calcula o próximo termo da sequência de Fibonacci somando os dois termos anteriores.
//5. termosfibonacci += proximo + " "; = Concatena o próximo termo calculado à string que armazena os termos da sequência de Fibonacci.
//6. n1 = n2; = Atualiza o valor de n1 para o último termo da sequência.
//7. n2 = proximo; = Atualiza o valor de n2 para o novo termo calculado.
//8. (null, "Os 10 primeiros termos da sequência de Fibonacci são:\n" + termosfibonacci); = Exibe a sequência de Fibonacci gerada em uma janela de mensagem (JOptionPane).

public class desafio8 {
    public static void main(String[] args) {
        int n1 = 1, n2 = 1;
        String termosfibonacci = n1 + " " + n2 + " "; // Inicia com os dois primeiros termos

        // Calculando os 10 primeiros termos da sequência de Fibonacci
        for (int i = 3; i <= 10; i++) {
            int proximo = n1 + n2;
            termosfibonacci += proximo + " "; // Concatena o próximo termo
            n1 = n2;
            n2 = proximo;
        }

        // Exibindo a sequência de Fibonacci no JOptionPane

        JOptionPane.showMessageDialog(null, "Os 10 primeiros termos da sequência de Fibonacci são:\n" + termosfibonacci);
    }
}




//    public class desafio8 {
//        public static void main(String[] args) {
//
//                    int n1 = 1, n2 = 1;
//
//                    System.out.println("Os 10 primeiros termos da sequência de Fibonacci são:");
//
//                    System.out.print(n1 + " " + n2 + " ");
//                    for (int i = 3; i <= 10; i++) {
//                        int proximo = n1 + n2;
//                        System.out.print(proximo + " ");
//                        n1 = n2;
//                        n2 = proximo;
//                    }
//                }
//            }

