package logica_comum;
import java.util.Arrays;

public class OrdenacaoRapida {
    public static void main(String[] args) {
        int[] numeros = {34, 7, 23, 32, 5, 62, 32, 71, 23, 1}; // Exemplo
        Arrays.sort(numeros); // Ordenação eficiente (O(n log n))

        System.out.println(Arrays.toString(numeros)); // Exibir ordenado
    }
}
