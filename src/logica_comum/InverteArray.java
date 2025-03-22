package logica_comum;

public class InverteArray {
    public static void main(String[] args) {

        int[] array = new int[15];
        for(int i = 0; i < array.length; i++){
            array[i] = i+1;
        }

        for(int i = 0; i <= array.length / 2 ; i++){
            int aux = array[i];
            array[i] = array[array.length -1 -i];
            array[array.length -1 -i] = aux;
        }

        for (int vet : array) {
            System.out.print(vet+" ");
        }

    }
}
