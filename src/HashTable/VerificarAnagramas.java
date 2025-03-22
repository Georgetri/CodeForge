package HashTable;

import java.util.HashMap;
/*Descrição: Dadas duas strings, verifique se elas são anagramas. Um anagrama é uma palavra que pode ser formada reorganizando as letras de outra.
Objetivo: Usar uma hash table para contar a frequência de cada caractere em ambas as strings e verificar se elas são iguais.*/

public class VerificarAnagramas {
    public static void main(String[] args) {
        String palavra1 = "ramo";
        String palavra2 = "amor";

        // Verificar se as duas palavras têm o mesmo tamanho
        if (palavra1.length() != palavra2.length()) {
            System.out.println("Não são anagramas");
            return; // Se as palavras não tiverem o mesmo tamanho, elas não podem ser anagramas
        }

        // Usar uma HashMap para contar a frequência dos caracteres
        HashMap<Character, Integer> mapa = new HashMap<>();

        // Contar a frequência dos caracteres na primeira palavra
        for (char c : palavra1.toCharArray()) {
            mapa.put(c, mapa.getOrDefault(c, 0) + 1);
        }

        // Subtrair a frequência dos caracteres da segunda palavra
        for (char c : palavra2.toCharArray()) {
            if (!mapa.containsKey(c)) {
                System.out.println("Não são anagramas");
                return; // Se um caractere de palavra2 não existir em palavra1, não são anagramas
            }

            mapa.put(c, mapa.get(c) - 1);

            // Se a contagem de um caractere se tornar 0, remove-o do mapa
            if (mapa.get(c) == 0) {
                mapa.remove(c);
            }
        }

        // Se o mapa estiver vazio no final, as palavras são anagramas
        if (mapa.isEmpty()) {
            System.out.println("São anagramas");
        } else {
            System.out.println("Não são anagramas");
        }
    }
}
