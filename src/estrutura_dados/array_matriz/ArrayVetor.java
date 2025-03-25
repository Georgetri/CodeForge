package estrutura_dados.array_matriz;

import javax.swing.*;

public class ArrayVetor {
    public static void main(String[] args) {

        /* Array pode ser de todos os tipos de dados e objetos também */
        int tam = Integer.valueOf(JOptionPane.showInputDialog("Tamanho do array: "));
        double[] notas = new double[tam];

       for(int i = 0; i < notas.length; i++){
           double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a "+ (i+1) +"ª nota: "));
           notas[i] = nota;
       }

       for(int i = 0; i < tam; i++){
           System.out.print("  "+notas[i]);
       }
    }
}
