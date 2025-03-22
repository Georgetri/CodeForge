package logica_comum;

import java.util.ArrayList;
import java.util.List;

public class InverteLista {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();
        for(int i = 1; i <= 15 ; i++ ){
            lista.add(i);
        }
        System.out.print(lista+"  ");

        for(int i = 0; i < lista.size() / 2; i++){
            int aux = lista.get(i);
            lista.set(i, lista.get(lista.size() - 1 - i));
            lista.set(lista.size()-1 -i , aux);
        }

        System.out.print(lista);


    }
}
