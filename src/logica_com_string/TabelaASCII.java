package logica_com_string;

public class TabelaASCII {
    public static void main(String[] args) {
        System.out.println("Letra | Código ASCII | Índice no Array (c - 'a')");
        System.out.println("-----------------------------------------------");

        for (char c = 'a'; c <= 'z'; c++) {
            int ascii = (int) c;
            int indice = c - 'a';
            System.out.printf("  %c    |     %d      |         %d%n", c, ascii, indice);
        }
    }
}

