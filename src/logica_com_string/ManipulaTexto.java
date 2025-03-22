package logica_com_string;

public class ManipulaTexto {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Olá Mundo!");

        sb.insert(4, " Java"); // Insere " Java" após "Olá"
        System.out.println(sb); // "Olá Java Mundo!"

        sb.replace(4, 9, "Programador"); // Substitui "Java" por "Programador"
        System.out.println(sb); // "Olá Programador Mundo!"

        sb.delete(4, 15); // Remove "Programador"
        System.out.println(sb); // "Olá Mundo!"

        sb.reverse(); // Inverte a String
        System.out.println(sb); // "!odnuM álO"
    }
}
