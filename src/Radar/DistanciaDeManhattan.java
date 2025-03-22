package Radar;

import java.io.*;
import java.util.*;

public class DistanciaDeManhattan {
    public static void main(String[] args) {
        // Definindo a matriz
        int[][] matriz;
        List<int[]> pontos = new ArrayList<>();  // Para armazenar os pontos que você deseja calcular a distância

        try {
            // Abrindo o arquivo
            InputStream entrada = new FileInputStream("C:\\Users\\jorge\\mat1.txt");
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));

            // Lendo o arquivo linha por linha e preenchendo a matriz ao mesmo tempo
            String texto;
            List<String> linhas = new ArrayList<>();
            while ((texto = buffer.readLine()) != null) {
                if (!texto.isEmpty()) {
                    linhas.add(texto);
                }
            }

            // Definindo o tamanho da matriz (baseado no número de linhas e colunas do arquivo)
            int N = linhas.size();
            int M = linhas.get(0).length();
            matriz = new int[N][M];

            // Preenchendo a matriz e buscando os pontos (1) ao mesmo tempo
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    matriz[i][j] = Character.getNumericValue(linhas.get(i).charAt(j));
                    if (matriz[i][j] == 1) {
                        pontos.add(new int[]{i, j});
                    }
                }
            }

            // Supondo que você queira calcular a distância de Manhattan entre os primeiros dois pontos encontrados
            if (pontos.size() >= 2) {
                int[] pontoA = pontos.get(0);
                int[] pontoB = pontos.get(1);

                // Calculando a distância de Manhattan
                int distancia = calcularDistanciaManhattan(pontoA, pontoB);

                // Imprimindo a distância
                System.out.println("Distância de Manhattan entre os pontos: " + distancia);
            } else {
                System.out.println("Não há pontos suficientes na matriz para calcular a distância.");
            }

        } catch (FileNotFoundException e) {
            System.err.println("Arquivo não encontrado: " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Função para calcular a distância de Manhattan
    public static int calcularDistanciaManhattan(int[] pontoA, int[] pontoB) {
        int x1 = pontoA[0], y1 = pontoA[1];
        int x2 = pontoB[0], y2 = pontoB[1];

        // Fórmula da distância de Manhattan
        return Math.abs(x2 - x1) + Math.abs(y2 - y1);
    }
}
