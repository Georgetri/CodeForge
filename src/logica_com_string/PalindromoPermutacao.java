package logica_com_string;

public class PalindromoPermutacao {
    public static void main(String[] args) {
        String palavra = "ivicc"; // Exemplo de entrada
        System.out.println(palindromo(palavra)); // Deve retornar "SIM"
    }

    public static String palindromo(String palavra) {
        palavra = palavra.replaceAll("\\s", "").toLowerCase(); // Remove espaços e converte para minúsculas

        int[] contagem = new int[26]; // Array para armazenar a contagem de letras (a-z)

        // Contamos a frequência de cada caractere
        for (char c : palavra.toCharArray()) {
            contagem[c - 'a']++; // Atualiza a posição correspondente no array
        }

       /* for (int i : contagem) {
            System.out.print(i + " ");
        }*/

        // Contamos quantos caracteres aparecem um número ímpar de vezes
        int contagemImpar = 0;
        for (int i = 0; i < 26; i++) {
            if (contagem[i] % 2 != 0) {
                contagemImpar++;
            }
        }

        // Só pode haver no máximo um caractere com contagem ímpar
        return contagemImpar > 1 ? "NÃO É PALÍNDROMO" : "É PALINDROMO";
    }
}
