package formsexercise;

//Crie um método que receba o custo e o pagamento, ele deve imprimir no console as seguintes informações:
//
//        Valor do troco
//
//        Troco em menor quantidade de notas e moedas possiveis
//        exemplo:
//        custo:
//        R$ 17,35
//        pagamento:
//        R$ 20,00
//        troco:
//        R$ 2,65
//        menor troco:
//        1 - nota de 2
//        1 - moeda de 50
//        1 - moeda de 10
//        1 - moeda de 5


import java.util.Scanner;

public class Exercicio6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do custo");
        double custo = scanner.nextDouble();

        System.out.println("Digite o valor do pagamento");
        double pagamento = scanner.nextDouble();

        double troco = pagamento - custo;
        System.out.println("Valor do troco é: " + troco);
        scanner.close();


        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        int[] moedas = {50, 25, 10, 5, 1};


        System.out.println("Troco em menor quantidade de notas e moedas:");

        for (int nota : notas) {
            if (troco >= nota) {
                int quantidade = (int) (troco / nota);
                System.out.println(quantidade + " - nota de " + nota);
                troco %= nota;
            }
        }

        for (int moeda : moedas) {
            if (troco >= moeda) {
                int quantidade = (int) (troco / moeda);
                System.out.println(quantidade + " - moeda de " + (moeda / 100.0));
                troco %= moeda;
            }
        }
    }
}

