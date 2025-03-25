package estrutura_dados.listas;
/* Dada uma lista de inteiros, remova todos os números duplicados. Você pode usar um ArrayList ou LinkedList.
Após remover os duplicados, a lista deve manter a ordem dos elementos originais.
Métodos úteis: contains(), add(), remove(), set(), hashSet().*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElementosDuplicadosLista2 {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 7, 3, 4, 5, 6, 1, 8, 7, 8, 9, 7, 10));

        System.out.print(lista + "\n");

        for (int i = 0; i < lista.size(); i++) {
            int aux = lista.get(i);

            for (int j = i + 1; j < lista.size() ; j++) {

                if(lista.get(j) == aux){
                    lista.remove(j);
                j--;
                }
            }
        }
            System.out.print(lista);
    }
}
