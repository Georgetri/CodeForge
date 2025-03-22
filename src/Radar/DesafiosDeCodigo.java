package Radar;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DesafiosDeCodigo {

    public static void main(String[] args) {
        String fileName = "desafios_de_codigo.txt";

        // Conteúdo dos desafios
        String content =
                "1. Distância de Manhattan\n" +
                        "Problema:\n" +
                        "Em uma matriz, cada célula contém um número. O objetivo é calcular a distância de Manhattan de um ponto até outro, " +
                        "onde o movimento pode ser apenas para as direções horizontais e verticais.\n" +
                        "Fórmula da Distância de Manhattan:\n" +
                        "d = |x2 - x1| + |y2 - y1|\n" +
                        "Onde:\n" +
                        "(x1, y1) e (x2, y2) são as coordenadas dos dois pontos.\n\n" +

                        "2. Equação da Circunferência\n" +
                        "Problema:\n" +
                        "Dada uma matriz com um ponto central, o objetivo é identificar quais pontos na matriz estão dentro de uma circunferência de raio r em torno do ponto central.\n" +
                        "Fórmula da Circunferência:\n" +
                        "(x - h)^2 + (y - k)^2 ≤ r^2\n" +
                        "Onde:\n" +
                        "(h, k) é o centro da circunferência,\n" +
                        "r é o raio da circunferência,\n" +
                        "(x, y) são as coordenadas dos pontos na matriz.\n\n" +

                        "3. Média Aritmética em uma Matriz\n" +
                        "Problema:\n" +
                        "Você tem uma matriz N×N de números. O objetivo é calcular a média aritmética de todos os números na matriz.\n" +
                        "Fórmula da Média Aritmética:\n" +
                        "Média = (∑ i=1 N ∑ j=1 N matriz[i][j]) / N^2\n" +
                        "Onde:\n" +
                        "∑∑ é a soma dos elementos da matriz.\n\n" +

                        "4. Cálculo da Área de um Triângulo (Usando Determinantes)\n" +
                        "Problema:\n" +
                        "Dada uma matriz que representa um triângulo com seus vértices nas coordenadas (x1, y1), (x2, y2), e (x3, y3), calcule a área do triângulo.\n" +
                        "Fórmula da Área (Determinante):\n" +
                        "Área = 1/2 | x1(y2 - y3) + x2(y3 - y1) + x3(y1 - y2) |\n\n" +

                        "5. Cálculo de Determinante de uma Matriz 2x2\n" +
                        "Problema:\n" +
                        "Dada uma matriz 2×2, calcule o determinante da matriz.\n" +
                        "Fórmula do Determinante de uma Matriz 2x2:\n" +
                        "determinante = (a × d) - (b × c)\n" +
                        "Onde:\n" +
                        "Para a matriz [ a b ]\n" +
                        "                [ c d ]\n\n" +

                        "6. Resolução de Sistemas Lineares (Método de Substituição ou Eliminação)\n" +
                        "Problema:\n" +
                        "Dado um sistema linear de equações, como:\n" +
                        "a1x + b1y = c1\n" +
                        "a2x + b2y = c2\n" +
                        "O objetivo é encontrar os valores de x e y usando o método de substituição ou eliminação.\n" +
                        "Fórmula de Substituição:\n" +
                        "x = (c1 - b1y) / a1\n\n" +

                        "7. Soma dos Quadrados (Método de Minimização)\n" +
                        "Problema:\n" +
                        "Em um problema de ajuste de curvas, você tem uma função y = f(x) e um conjunto de pontos (xi, yi). O objetivo é minimizar a soma dos quadrados das diferenças entre os valores observados yi e os valores previstos f(xi).\n" +
                        "Fórmula da Soma dos Quadrados:\n" +
                        "S = ∑ i=1 n (yi - f(xi))^2\n\n" +

                        "8. Perímetro de um Polígono Convexo\n" +
                        "Problema:\n" +
                        "Dado um conjunto de pontos que formam um polígono convexo, calcule o perímetro do polígono. As coordenadas dos vértices estão armazenadas em uma matriz.\n" +
                        "Fórmula do Perímetro:\n" +
                        "P = ∑ i=1 n-1 ((xi - xi+1)^2 + (yi - yi+1)^2) + (xn - x1)^2 + (yn - y1)^2\n" +
                        "Onde:\n" +
                        "(xi, yi) são as coordenadas dos vértices do polígono.\n\n" +

                        "9. Aproximação de Integral (Método de Trapézio)\n" +
                        "Problema:\n" +
                        "Dada uma função f(x), calcule a integral definida usando o método dos trapézios.\n" +
                        "Fórmula do Método dos Trapézios:\n" +
                        "I ≈ h / 2 ( f(x0) + 2 ∑ i=1 n-1 f(xi) + f(xn) )\n" +
                        "Onde:\n" +
                        "h é a largura de cada subintervalo.\n\n" +

                        "10. Cálculo de Distância entre Dois Pontos no Plano 3D\n" +
                        "Problema:\n" +
                        "Em um espaço tridimensional, calcule a distância entre dois pontos (x1, y1, z1) e (x2, y2, z2).\n" +
                        "Fórmula da Distância no Plano 3D:\n" +
                        "d = √((x2 - x1)^2 + (y2 - y1)^2 + (z2 - z1)^2)\n";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            System.out.println("Arquivo '" + fileName + "' criado com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao criar o arquivo: " + e.getMessage());
        }
    }
}
