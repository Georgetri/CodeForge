package algoritmo_de_ordenacao;

public class InsertionSortExplicado {
    public static void main(String[] args) {
        int[] numeros = {34, 7, 23, 32, 5, 62, 32, 71, 23, 1};

        System.out.println("Array original:");
        exibirArray(numeros);
        System.out.println("\n---------------------------------------------");

        // Implementação do Insertion Sort com depuração melhorada
        for (int i = 1; i < numeros.length; i++) {
            int chave = numeros[i]; // Número que será posicionado corretamente
            int j = i - 1;

            System.out.println("\n>>> Iteração " + i + " (Inserindo " + chave + " na parte ordenada)");
            System.out.println("Parte ordenada: ");
            exibirArrayParcial(numeros, i);
            System.out.println("Número a ser inserido: " + chave);

            // Movendo os elementos maiores que a chave
            while (j >= 0 && numeros[j] > chave) {
                System.out.println("\n   Comparando " + numeros[j] + " (posição " + j + ") com " + chave);
                System.out.println("   " + numeros[j] + " é maior que " + chave + ", então movemos " + numeros[j] + " para frente.");

                numeros[j + 1] = numeros[j]; // Move o número maior para frente

                exibirArray(numeros); // Mostra o array atualizado
                j--;
            }

            // Inserindo a chave na posição correta
            numeros[j + 1] = chave;
            System.out.println("\n   Inserindo " + chave + " na posição " + (j + 1));
            exibirArray(numeros);
            System.out.println("\n---------------------------------------------");
        }

        // Exibição do array ordenado
        System.out.println("\nArray ordenado:");
        exibirArray(numeros);
    }

    // Método auxiliar para exibir todo o array
    public static void exibirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Método auxiliar para exibir apenas a parte ordenada do array
    public static void exibirArrayParcial(int[] array, int limite) {
        for (int i = 0; i < limite; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("| " + array[limite] + " ..."); // Mostra a parte não ordenada do array
    }
}
