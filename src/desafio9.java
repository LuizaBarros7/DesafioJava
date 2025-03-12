import java.util.Arrays;
import java.util.Random;

import javax.swing.*;

//1- Criando um vetor de 20 posições
//2- Preenchendo o vetor com numeros aleatórios entre 0 e 99
//3- Gera um número aleatório entre 0 e 99
//4- Exibindo os números gerados aleatoriamente em uma caixa de diálogo
//5- Ordenando o vetor em ordem crescente
//6- Exibindo o vetor ordenado em ordem crescente

public class desafio9 {
    public static void main(String[] args) {
        // Criando um vetor de 20 posições
        int[] vetor = new int[20];

        // Preenchendo o vetor com números aleatórios entre 0 e 99
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            vetor[i] = random.nextInt(100); // Gera um número aleatório entre 0 e 99
        }

        String numerosGerados = "";
        for (int i = 0; i < 20; i++) {
            numerosGerados += vetor[i] + " ";
        }
        JOptionPane.showMessageDialog(null, "Vetor com números aleatórios:\n" + numerosGerados);

        Arrays.sort(vetor);
        String numerosOrdenados = "";
        for (int i = 0; i < 20; i++) {
            numerosOrdenados += vetor[i] + " ";
        }
        JOptionPane.showMessageDialog(null, "Vetor ordenado em ordem crescente:\n" + numerosOrdenados);
    }
}


//public class desafio9 {
//    public static void main(String[] args) {
//                // Criando um vetor de 20 posições
//                int[] vetor = new int[20];
//
//                // Preenchendo o vetor com números aleatórios entre 0 e 99
//                Random random = new Random();
//                for (int i = 0; i < 20; i++) {
//                    vetor[i] = random.nextInt(100); // Gera um número aleatório entre 0 e 99
//                }
//
//                // Exibindo os números gerados aleatoriamente
//                System.out.println("Vetor com números aleatórios:");
//                for (int i = 0; i < 20; i++) {
//                    System.out.print(vetor[i] + " ");
//                }
//                System.out.println();
//
//                // Ordenando o vetor em ordem crescente
//                Arrays.sort(vetor);
//
//                // Exibindo o vetor após a ordenação
//                System.out.println("Vetor ordenado em ordem crescente:");
//                for (int i = 0; i < 20; i++) {
//                    System.out.print(vetor[i] + " ");
//                }
//            }
//        }