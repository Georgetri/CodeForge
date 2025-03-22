package algoritmo_de_ordenacao;

import java.util.HashMap;
/**🔹 Two Sum (#1) - Encontrar dois números que somam um valor-alvo.
 * 1️⃣ Lista de números: {1, 4, 6, 8, 10, 15}   Target: 14
 * 2️⃣ Lista de números: {3, 7, 11, 13, 17, 21}  Target: 24
 * 3️⃣ Lista de números: {5, 9, 12, 20, 25, 30}  Target: 35**/

public class TwoSumHashMap {
    public static void main(String[] args) {
        int[] nums = {2, 8, 7, 11, 1, 15}; // Criamos um array com os números
        int target = 9; // Definimos o valor que queremos encontrar

        HashMap<Integer, Integer> mapa = new HashMap<>(); // Criamos um HashMap para armazenar números já vistos

        for (int i = 0; i < nums.length; i++) { // Percorremos o array inteiro
            int complemento = target - nums[i]; // Calculamos o complemento (o número que precisamos encontrar)

            if (mapa.containsKey(complemento)) { // Se o complemento já está no HashMap, encontramos a resposta!
                System.out.println("Posições: " + mapa.get(complemento) + " e " + i +
                        " | Números: " + complemento + " + " + nums[i] + " = " + target);
            }

            mapa.put(nums[i], i); // Guardamos o número atual no HashMap junto com seu índice
        }

    }
}

