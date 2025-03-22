package logica_comum;
import  java.lang.Math;
public class NumerosPerfeitos2 {
    public static void main(String[] args) {

        int[] numerosParaTestar = {6, 28, 12, 496, 8128, 24, 9, 10, 19, 81};

        for (int numero : numerosParaTestar) {  // iter chama foreach
             int somaDivisores = 0;

             //encontra divisores de cada número
            for(int i = 1; i <= Math.sqrt(numero); i++){

                if (numero % i == 0) {
                    somaDivisores += i;  // Adiciona o divisor menor

                    if (i != 1 && i != numero / i) {
                        somaDivisores += numero / i;  // Adiciona o divisor maior
                    }
                }
            }
            if (somaDivisores == numero) {
                System.out.println(numero + " é um número perfeito.");
            }

        }

    }
}
