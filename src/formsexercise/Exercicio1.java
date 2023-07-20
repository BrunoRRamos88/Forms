package formsexercise;

//Imprima todos números pares de 0 a 100.

public class Exercicio1 {
    public static void main(String[] args) {
        int valor = 100;
        for(int i=0; i<=valor; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
