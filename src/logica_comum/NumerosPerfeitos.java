package logica_comum;

public class NumerosPerfeitos {
    public static void main(String[] args) {

        int[] numerosParaTestar = {6, 28, 12, 496, 8128, 24, 9, 10, 19, 81};

        // Loop sobre cada número da lista
        for (int numero : numerosParaTestar) {
            int somaDivisores = 0;

            // Encontra divisores de cada número
            for (int i = 1; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    somaDivisores += i;
                }
            }

            // Verifica se é um número perfeito
            if (somaDivisores == numero) {
                System.out.println(numero + " é um número perfeito.");
            }
        }

    }
}
