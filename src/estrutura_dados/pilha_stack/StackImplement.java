package estrutura_dados.pilha_stack;

import java.util.Random;
import java.util.Stack;
/* Pilha LIFO o primeiro a entrar será o último a sair, o último a entrar será o primeio a sair */
public class StackImplement {
    public static void main(String[] args) {
        Stack pilha = new Stack();
        Random random = new Random();

        int i = 5;

        System.out.print("PUSH : ");

        while (i != 0){
            System.out.printf("  " + pilha.push(random.nextInt(30)));
            i--;
        }

        System.out.println(" \n " + pilha.get(0));

        System.out.print("POP : ");
       while(!pilha.isEmpty()) {
            System.out.print("  "+pilha.pop());
        }

    }
}
