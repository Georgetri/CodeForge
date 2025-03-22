package logica_com_string;

import java.util.HashMap;
import java.util.Map;

public class PalindromoHasmap {
    public static void main(String[] args) {
        String palavra = "ivicc"; // Exemplo de entrada
        System.out.println(palindromo(palavra)); // Deve retornar "SIM"
    }

    public static String palindromo(String palavra) {
        palavra = palavra.replaceAll("\\s", "").toLowerCase(); // Removemos espaços e padronizamos para minúsculas

        Map<Character, Integer> contagem = new HashMap<>();

        // Contamos a frequência de cada caractere
        for (char c : palavra.toCharArray()) {
            contagem.put(c, contagem.getOrDefault(c, 0) + 1);
        }

        // Contamos quantos caracteres aparecem um número ímpar de vezes
        int contagemImpar = 0;
        for (int valor : contagem.values()) {
            if (valor % 2 != 0) {
                contagemImpar++;
            }
        }

        // Só pode haver no máximo um caractere com contagem ímpar
        return contagemImpar > 1 ? "NÃO É PALÍNDROMO" : "SIM, É PALÍNDROMO";
    }
}
