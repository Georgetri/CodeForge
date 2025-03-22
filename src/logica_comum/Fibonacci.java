package logica_comum;

public class Fibonacci {
    public static void main(String[] args) {

        int num = 10;
        long anterior = 0, atual = 1;

        for(int i = 2; i <= num; i++){
            long proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
        System.out.println("Fibonacci de "+num+" é "+atual);
    }
}

/** int n = 10; // Número que queremos calcular na sequência

 // Se n for 0, imprime 0 diretamente
 if (n == 0) {
 System.out.println("Fibonacci de " + n + " é: 0");
 return;
 }

 // Se n for 1, imprime 1 diretamente
 if (n == 1) {
 System.out.println("Fibonacci de " + n + " é: 1");
 return;
 }

 // Variáveis para armazenar os dois últimos valores de Fibonacci
 long anterior = 0, atual = 1;

 // Calcula os valores até o n-ésimo termo
 for (int i = 2; i <= n; i++) {
 long proximo = anterior + atual; // Soma os dois anteriores
 anterior = atual;  // Atualiza o valor anterior
 atual = proximo;   // Atualiza o valor atual
 }

 // Imprime o n-ésimo número de Fibonacci
 System.out.println("Fibonacci de " + n + " é: " + atual);
 }*/