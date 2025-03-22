package HashTable;

import java.util.Arrays;
import java.util.HashMap;

public class ContagemFrequencia2 {
    public static void main(String[] args) {

        int[] array = {4, 5, 3, 1, 2, 3234, 3, 2, 3, 3, 4, 4, 4, 5};

        // Ao invés de usarmos Arrays.sort(array) implementamos Insertion Sort
        for (int i = 1; i < array.length; i++) {
            int aux = array[i];
            int j = i - 1;

            while(j >= 0 && array[j] > aux ){
                array[j + 1] = array[j]; //Move o número maior para frente(esquerda)
                j--;
            }
            array[j + 1] = aux;
        }
        System.out.print("\n Saída Ordenada: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }

        // Usando HashMap para contar as frequências
        HashMap<Integer, Integer> frequencia = new HashMap<>();
        
        //contagem das frequências
        for (int i = 0; i < array.length; i++) {
            frequencia.put(array[i], frequencia.getOrDefault(array[i],0) + 1);
        }
        System.out.println("\n");

        for (Integer numero : frequencia.keySet()) {
            System.out.println("Número: " + numero + " - Frequência: " + frequencia.get(numero));
        }

    }
}
