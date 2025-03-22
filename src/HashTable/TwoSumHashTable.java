package HashTable;

import java.util.HashMap;

/*3. Dois Números que Somam para o Alvo (Two Sum)
Descrição: Dado um array de números e um valor alvo, determine se existem dois números no array cuja soma seja igual ao valor alvo.
Objetivo: Usar uma hash table para verificar se o complemento de cada número (alvo - número) já foi encontrado enquanto percorre o array.*/
public class TwoSumHashTable {
    public static void main(String[] args) {

        int[] num = {1, 4, 6, 8, 10, 15};
        int target = 14;

        HashMap<Integer,Integer> mapa = new HashMap<>();

        for (int i = 0; i < num.length; i++) {
            int aux = target - num[i];

            if(mapa.containsKey(aux)){
                System.out.println("Posições: "+ mapa.get(aux) +" e "+ i +" |" +
                        " números: "+ aux +" + "+num[i]+" = "+target);
            }

            mapa.put(num[i],i);

        }

    }
}
