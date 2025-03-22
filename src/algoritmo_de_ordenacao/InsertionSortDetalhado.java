package algoritmo_de_ordenacao;

public class InsertionSortDetalhado {
    public static void main(String[] args) {
        int[] numeros = {34, 7, 23, 32, 5, 62, 32, 71, 23, 1};

        for (int pos = 0; pos < numeros.length; pos++) {
            System.out.print(numeros[pos] + " ");
        }

        // Implementação do Insertion Sort com depuração corrigida
        for (int i = 1; i < numeros.length; i++) {
            int chave = numeros[i];
            int j = i - 1;
            System.out.println("");
            System.out.println("\n Chave = numerosi["+i+"]:"+numeros[i] +"   Chave:" + chave + "    i:" +i+"    J=i-1:" + j+"\n");

            for (int pos = 0; pos < numeros.length; pos++) {
                System.out.print(" "+numeros[pos] + " ");
            }
            System.out.println("");

            System.out.println("\n===================INÍCIO DO WHILE=======================\n");
            while (j >= 0 && numeros[j] > chave) {
                System.out.println("\nSE numeroj["+j+"]:"+numeros[j]+" > Chave:" + chave +"   numerosi["+i+"]:"+ numeros[i] + "   i: " +i+"    J:" + j);
                System.out.println("numerosj["+j+ " + 1] = numerosj["+j+"]");
                numeros[j + 1] = numeros[j];
                System.out.println("\nTROCA  Chave:" + chave+"    numerosj["+j+"]:" + numeros[j]+ "   numerosi["+i+"]:"+ numeros[i] + "   i:" +i+"  j:"+j );
                j = j - 1;
                System.out.print("j = j-1  =>  "+(j+1)+"-1 = " +j+"\n");
                // Só imprime numeros[j] se j for válido
                if (j >= 0) {
                    System.out.println("\nTROCA NO WHILE  Chave:"+ chave + "    numerosi["+i+"]:"+ numeros[i] + "    numerosj["+j+"]:" + numeros[j]);
                } else {
                    System.out.println("\nTROCA NO WHILE  Chave:"+ chave + "    numerosi["+i+"]:"+ numeros[i] + "     j agora é: " + j);
                }
                System.out.println("");
                for (int pos = 0; pos < numeros.length; pos++) {
                    System.out.print(" "+numeros[pos] + " ");
                }

            }
            System.out.println("");
            System.out.println("\n=============== A TROCA e fim do while==============================");
            System.out.println("\nDEPOIS DO WHILE  Chave:" + chave + "     numerosi["+i+"]:" + numeros[i] + "   j:" + j);
            numeros[j + 1] = chave;
            System.out.println("\nTROCA numerosj["+j+"+1]=Chave:" + chave + "    numerosi["+i+"]:" + numeros[i] + "   j:" + j);
            System.out.println("");

            for (int pos = 0; pos < numeros.length; pos++) {
                System.out.print(numeros[pos] + " ");
            }

        }

        // Exibe o array ordenado
        // for (int pos = 0; pos < numeros.length; pos++) {
        //   System.out.print(numeros[pos] + " ");
        // }
    }
}
