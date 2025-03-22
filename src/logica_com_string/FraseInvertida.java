package logica_com_string;

/* ✅ Desafio: Inverter a Ordem das Palavras em uma String
Crie uma função que inverta a ordem das palavras em uma string.
🔹 Exemplo: Entrada: "Eu amo Java" Saída: "Java amo Eu" */
import java.util.Arrays;
import java.util.Collections;

public class FraseInvertida {
    public static void main(String[] args) {
        String frase = "Hello Word !";
        System.out.println(invertePalavras(frase));
    }

    private static String invertePalavras(String frase) {
        // Dividir a string em palavras
        String[] palavras = frase.split(" ");

        // Inverter as palavras usando Collections.reverse (para trabalhar com List)
        java.util.List<String> listaPalavras = Arrays.asList(palavras);
        Collections.reverse(listaPalavras);

        // Juntar as palavras invertidas de volta em uma string
        return String.join(" ", listaPalavras);
    }
}
