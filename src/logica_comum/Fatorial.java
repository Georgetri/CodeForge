package logica_comum;

public class Fatorial {
    public static void main(String[] args) {
        int number = 5;
        int fatorial = 1;

        for(int i = 1; i <= number; i++ ){
            fatorial *= i;
        }

        System.out.println(" Fatorial de "+number+" é "+fatorial );

    }
}
