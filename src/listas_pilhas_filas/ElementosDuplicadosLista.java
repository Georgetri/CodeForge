package listas_pilhas_filas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*Dada uma lista de inteiros, remova todos os números duplicados. Você pode usar um ArrayList ou LinkedList.
Após remover os duplicados, a lista deve manter a ordem dos elementos originais.
Métodos úteis: contains(), add(), remove(), set(), hashSet().*/
public class ElementosDuplicadosLista {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        Random random = new Random();

        for(int i = 0; i <= 15; i++){

            int aux = random.nextInt(30);

                if(!lista.contains(aux)){
                    lista.add(aux);
                }else{
                    i--;
                }
            }

        for (Integer i : lista) {
            System.out.print(" " + i);
        }

    }
}
