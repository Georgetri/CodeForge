package Radar;

import java.util.Random;
import java.util.HashSet;
import java.util.Set;

/* Você tem uma matriz N×N de números. O objetivo é calcular a média aritmética de todos os números na matriz.
Fórmula da Média Aritmética: Média = (∑ i=1 N ∑ j=1 N matriz[i][j]) / N^2
Onde:∑∑ é a soma dos elementos da matriz.*/
public class MediaAritmeticaMatriz {
    public static void main(String[] args) {

        int[][] matriz = new int[5][5];
        Random random = new Random();
        double media = 0.0;
        int size = matriz.length * matriz[0].length;

        // Cria um Set para armazenar os números únicos
        Set<Integer> numerosUsados = new HashSet<>();

        // Preenche a matriz com números aleatórios únicos
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int aux;
                // Gera um número único que ainda não foi usado
                do {
                    aux = random.nextInt(50) + 1; // Gera um número entre 0 e 50
                } while (numerosUsados.contains(aux)); // Verifica se o número já foi usado

                // Adiciona o número gerado ao Set
                media += aux;
                numerosUsados.add(aux);

                // Atribui o número à posição da matriz
                matriz[i][j] = aux;
            }
        }
        // Imprime a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " "); // Imprime os valores na mesma linha
            }
            System.out.println(); // Pula para a próxima linha após imprimir uma linha inteira
        }
        media = (media / size);
        System.out.println("\n Média : "+ media);
    }

}
