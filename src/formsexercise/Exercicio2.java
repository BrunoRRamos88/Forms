package formsexercise;

//Imprima todos os números primos de 0 a 1000.


public class Exercicio2 {
    public static void main(String[] args) {
        for (int num = 0; num <= 1000; num++) {
            if (Exercicio2.ehPrimo(num)) {
                System.out.println(num + " ");
            }
        }
    }

    private static boolean ehPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}