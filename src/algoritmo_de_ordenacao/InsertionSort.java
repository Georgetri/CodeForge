package algoritmo_de_ordenacao;

public class InsertionSort {
    public static void main(String[] args) {

        int[] numeros = {34, 7, 23, 32, 5, 62, 32, 71, 23, 1};

        for (int i = 1; i < numeros.length; i++){
            int aux = numeros[i];
            int j = i - 1;

            while (j >= 0 && numeros[j] > aux){
                numeros[j + 1] = numeros[j]; // Move o número maior para frente
                j--;
            }
            numeros[j+1] = aux;
        }

        for(int i = 0; i < numeros.length;i++){
            System.out.print(" "+numeros[i]);
        }


    }

}
