package estrutura_dados.listas;

import java.util.ArrayList;
import java.util.List;

/* Inverter uma lista ligada (O(n)) */
public class InverteLista {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Rio");
        lista.add("Grande");
        lista.add("do");
        lista.add("Sul");

        List<String> listaInvertida = new ArrayList<>();

        for(int i = lista.size() - 1; i >= 0; i--){
            listaInvertida.add(lista.get(i));
        }

        for (String s : listaInvertida) {
            System.out.print(s + " ");
        }

    }
}
