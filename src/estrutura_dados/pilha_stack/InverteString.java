package estrutura_dados.pilha_stack;

import java.util.Stack;

public class InverteString {
    public static void main(String[] args) {

        Stack<Character> pilha = new Stack<>();
        String input = "lisarB";

        System.out.println(input);

        for (char c : input.toCharArray()) {
            pilha.push(c);
        }

        StringBuilder invertida = new StringBuilder();

        while(!pilha.empty()){
           invertida.append(pilha.pop());
        }

        System.out.print(invertida.toString());

    }
}
