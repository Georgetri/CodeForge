package logica_comum;
/*Desafio: Contagem de Dígitos Ímpares e Pares
Crie uma função que conte quantos dígitos ímpares e pares há em um número inteiro.
🔹 Exemplo: Entrada: 123456789  Saída: Pares: 4, Ímpares: 5 */

import java.util.ArrayList;

public class DigitosImparesPares {
    public static void main(String[] args) {
         int entrada = 123456789;
         int[] resultado =  ContaDigitos(entrada);
         System.out.println("Pares: "+resultado[0]);
         System.out.println("Ímpares: "+resultado[1]);

    }
private static int[]  ContaDigitos(int numero){
        int pares = 0, impares = 0;

    // Extraindo os dígitos do número
    while(numero > 0){
        int digito = numero % 10;
        if(numero %2 == 0){
            pares++;
        }else{
            impares++;
        }
        numero /= 10; // Remove o último dígito
    }
   return new int[]{pares, impares};
}
}
