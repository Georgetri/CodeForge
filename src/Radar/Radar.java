package Radar;

import java.io.*;

public class Radar {
    public static void main(String[] args) {
        int N = 11; // garante uma matriz quadrada
        int matriz[][] = new int[N][N];

        try {
            InputStream entrada = new FileInputStream("C:\\Users\\jorge\\Documents\\Algoritmos\\Desafio Radar e Matrizes\\mat1.txt");
            BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
            String texto;
            int i = 0;

            while ((texto = buffer.readLine()) != null && i < N) {
                if (texto.isEmpty()) { // Evita linhas vazias
                    continue;
                }

                for (int j = 0; j < Math.min(texto.length(), N); j++) { // Evita estouro de índice
                    matriz[i][j] = Character.getNumericValue(texto.charAt(j));
                }
                i++;
            }
            buffer.close();

            // O radar está posicionado no centro da matriz
            int centroX = N / 2;
            int centroY = N / 2;
            boolean inimigoDetectado = false;

            // Percorre a matriz e calcula distâncias
            for (i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (matriz[i][j] == 1) {
                        // Fórmula de distância euclidiana
                        double distancia = Math.sqrt(Math.pow(i - centroX, 2) + Math.pow(j - centroY, 2)) * 10;

                        if (distancia <= 50) {
                            System.out.printf("Inimigo a %.0fkm!\n", distancia);
                            inimigoDetectado = true;
                        }
                    }
                }
            }

            // Caso nenhum inimigo esteja dentro do raio de 50km
            if (!inimigoDetectado) {
                System.out.println("Nenhum inimigo em um raio de 50km.");
            }

        } catch (FileNotFoundException e) {
            System.err.println("Arquivo não encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
