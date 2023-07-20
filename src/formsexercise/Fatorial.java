package formsexercise;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");

        double f = scanner.nextDouble();
        double x = f;

        while (f > 1) {
            x = x * (f - 1);
            f--;
            System.out.println(f + " Calculando Fatorial: "+x);
        }
    }
}

