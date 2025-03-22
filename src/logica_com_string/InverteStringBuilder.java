package logica_com_string;

public class InverteStringBuilder {
        public static void main(String[] args) {

            String palavra = "Brasil";

            StringBuilder invertida = new StringBuilder();

            for (int i = palavra.length() - 1; i >= 0; i--) {
                invertida.append(palavra.charAt(i));
            }

            System.out.println(invertida.toString());
        }
}