package estrutura_dados.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Inverter uma lista ligada (O(n)) */
public class InverterLista {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Rio");
        lista.add("Grande");
        lista.add("do");
        lista.add("Sul");

        Collections.reverse(lista);

        for (String s : lista) {
            System.out.print(s + " ");
        }
    }
}
