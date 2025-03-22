package algoritmo_de_ordenacao;
/**🔹 Two Sum (#1) - Encontrar dois números que somam um valor-alvo.
 * 1️⃣ Lista de números: {1, 4, 6, 8, 10, 15}   Target: 14
 * 2️⃣ Lista de números: {3, 7, 11, 13, 17, 21}  Target: 24
 * 3️⃣ Lista de números: {5, 9, 12, 20, 25, 30}  Target: 35**/
public class TwoSum {
    public static void main(String[] args) {

        int[] numeros = {1, 4, 6, 8, 10, 15};
        int target = 14;

        for(int i = 0; i < numeros.length; i++){
            for(int j = i + 1; j < numeros.length; j++){
                if(numeros[i] + numeros[j] == target){
                    System.out.println("posição "+i+ " posição "+j+ " com valores "+numeros[i]+" e "+numeros[j]+" = "+target );
                }

            }
        }

    }
}
