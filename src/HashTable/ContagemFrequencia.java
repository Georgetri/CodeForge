package HashTable;

import java.util.Arrays;

/*1. Contagem de Frequência de Elementos:
Dado um array de números (ou uma lista de palavras), conte a frequência de cada número (ou palavra).
Você pode usar uma hash table onde a chave é o número (ou palavra) e o valor é a frequência.*/
public class ContagemFrequencia {
    public static void main(String[] args) {

        int[] array = {4, 5, 3, 1, 2, 3234, 3, 2, 3, 3, 4, 4, 4, 5};

        // Encontrar o valor máximo do array
        int maxValor = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValor) {
                maxValor = array[i];  // Atualiza o valor máximo
            }
        }

        // Criar o array de frequências com o tamanho necessário (maxValor + 1)
        int[] frequencia = new int[maxValor + 1];  // O tamanho será suficiente para armazenar frequências de 0 a maxValor

        // Contar as frequências de cada número
        for (int i = 0; i < array.length; i++) {
            frequencia[array[i]]++;  // O índice é o número do próprio array
        }

        // Exibir as frequências
        for (int i = 0; i < frequencia.length; i++) {
            if (frequencia[i] > 0) {
                System.out.println("Número: " + i + " - Frequência: " + frequencia[i]);
            }
        }

    }
}
/*import java.util.Arrays;

public class ContagemFrequencia {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5};

        // Primeiro, ordenamos o array para garantir que os elementos iguais ficam juntos
        Arrays.sort(array);

        // Variáveis para armazenar o número atual e sua frequência
        int numeroAtual = array[0];
        int frequencia = 1;  // A primeira ocorrência é 1

        // Contagem das frequências
        for (int i = 1; i < array.length; i++) {
            if (array[i] == numeroAtual) {
                // Se o número for igual ao anterior, incrementa a frequência
                frequencia++;
            } else {
                // Quando encontramos um número diferente, exibimos o anterior e reiniciamos a contagem
                System.out.println("Número: " + numeroAtual + ", Frequência: " + frequencia);
                numeroAtual = array[i];  // Atualiza o número atual
                frequencia = 1;  // Reinicia a frequência
            }
        }
        // Exibe a frequência do último número
        System.out.println("Número: " + numeroAtual + ", Frequência: " + frequencia);
    }
}
*/