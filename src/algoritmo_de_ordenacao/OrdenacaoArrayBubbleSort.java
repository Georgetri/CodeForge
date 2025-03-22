package algoritmo_de_ordenacao;

public class OrdenacaoArrayBubbleSort {
    public static void main(String[] args) {

        int[] numeros = {34, 7, 23, 32, 5, 62, 32, 71, 23, 1};

        // Algoritmo de Bubble Sort
        for(int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    // Troca os elementos
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

    for(int i = 0; i < numeros.length; i++)
        System.out.print(" "+numeros[i]);
    }
}
