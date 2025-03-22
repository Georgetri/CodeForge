package logica_com_string;

public class InverteString2 {
    public static void main(String[] args) {
        String palavra = "Brasil";
        char[] array = new char[palavra.length()]; // Criar um array de caracteres com o tamanho da palavra

        // Preencher o array manualmente usando um loop
        for (int i = 0; i < palavra.length(); i++) {
            array[i] = palavra.charAt(i); // Preenche o array com os caracteres da palavra
        }

        // Imprimir os caracteres no array na ordem reversa
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
