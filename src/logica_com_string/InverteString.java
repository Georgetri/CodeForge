package logica_com_string;

public class InverteString {
    public static void main(String[] args) {

       String palavra = "Brasil";
       char[] array = palavra.toCharArray();

       for(int i = array.length -1; i >= 0; i--)
           System.out.print(array[i]+" ");

    }

}
/*
Scanner sc = new Scanner(System.in);
		System.out.println("Escreva uma palavra: ");
		String palavra = sc.nextLine();

		char[] charArray = palavra.toCharArray();

		for(int i = charArray.length -1 ; i >=0; i--) {

			System.out.print(charArray[i]);
		}

		Scanner scanner = new Scanner(System.in);
		System.out.println("\nEntre com um número: ");
		int numero = scanner.nextInt();

				int[] numeros = new int[numero];

				for(int i = 0; i < numeros.length; i++) {

					numeros[i] = i;
					System.out.print(numeros[i]+ " ");
				}

				System.out.println("\n");

				for(int i = numeros.length -1; i >=0; i--) {

					System.out.print(numeros[i] +" ");

				}


* */