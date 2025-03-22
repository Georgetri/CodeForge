package logica_com_string;
/*✅ Desafio: Inverter a Ordem das Palavras em uma String
Crie uma função que inverta a ordem das palavras em uma string.
🔹 Exemplo:  Entrada: "Eu amo Java"   Saída: "Java amo Eu"
*/
public class InverteOrdemFrase {

    private static String invertePalavras(String frase) {
       String resultado = ""; // String para armazenar o resultado final
       String palavraAtual = ""; // Variável para armazenar cada palavra temporariamente

        // Percorre cada caracter da String
        for (int i = 0; i <= frase.length(); i++){
            char caracter = i < frase.length() ? frase.charAt(i) : ' '; // Obter o caracter ou espaço final

            // Se encontrarmos um espaço ou final da String, processamos a palavra
            if(caracter == ' ' || i == frase.length()){
                //Adiciona a palavra atual ao início do resultado  (invertendo a ordem)
                if(!palavraAtual.isEmpty()){
                    if(!resultado.isEmpty()){
                        resultado = palavraAtual + " " + resultado; // Adiciona a palavra com espaço
                    }else{
                        resultado = palavraAtual; // Primeira palavra (não adiciona espaço)
                    }
                    palavraAtual = ""; // Limpa a palavra atual para processar a próxima
                }
            }else{
                palavraAtual += caracter; // Se não for espaço, adiciona o caratere a palavra à palavra atual
            }

        }
       return resultado; // Retorna o resultado com as palavras invertidas
    }
    public static void main(String[] args) {
        String frase = "Hello Word !";
        System.out.println(invertePalavras(frase));
    }
}
/*
public class InverteOrdemDasPalavras {

    private static String invertePalavras(String frase) {
        String resultado = "";  // String para armazenar o resultado final
        String palavraAtual = "";  // Variável para armazenar cada palavra temporariamente

        // Percorrer cada caractere da string
        for (int i = 0; i <= frase.length(); i++) {
            char caractere = i < frase.length() ? frase.charAt(i) : ' ';  // Obter o caractere ou espaço no final

            // Se encontrarmos um espaço ou final da string, processamos a palavra
            if (caractere == ' ' || i == frase.length()) {
                // Adiciona a palavra atual ao início do resultado (invertendo a ordem)
                if (!palavraAtual.isEmpty()) {
                    if (!resultado.isEmpty()) {
                        resultado = palavraAtual + " " + resultado; // Adiciona a palavra com espaço
                    } else {
                        resultado = palavraAtual; // Primeira palavra (não adiciona espaço)
                    }
                    palavraAtual = "";  // Limpa a palavra atual para processar a próxima
                }
            } else {
                // Se não for espaço, adicione o caractere à palavra atual
                palavraAtual += caractere;
            }
        }

        return resultado; // Retorna o resultado com as palavras invertidas
    }
     public static void main(String[] args) {
        String frase = "Hello Word !";
        System.out.println(invertePalavras(frase));
    }
}
*/