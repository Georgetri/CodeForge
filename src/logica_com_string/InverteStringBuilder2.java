package logica_com_string;

public class InverteStringBuilder2 {
    public static void main(String[] args) {

        String palavra = "Brasil";
        StringBuilder sb = new StringBuilder();
        sb.append(palavra);
        palavra = sb.reverse().toString();
        System.out.println(palavra);

    }
}
