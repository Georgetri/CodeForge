package logica_comum;

public class EncontrarNumeroSequencia {
    public static void main(String[] args) {
        int[] vetor = new int[]{3, 7, 1, 2, 8, 4, 5};
        int n = vetor.length + 1;

        int somaEsperada = n * (n + 1) / 2;
        int somaAtual = 0;
        for(int i = 0; i < vetor.length; i++){
            somaAtual += vetor[i];
        }
        System.out.println("O número faltante é "+ (somaEsperada - somaAtual));

    }
}
