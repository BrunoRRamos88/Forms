package formsexercise;

//Crie um método que receba um número inteiro e gere uma matriz identidade a partir deste número
//        Exemplo:
//        Número:
//        3
//        Matriz:
//        1    0    0
//        0    1    0
//        0    0    1


public class Exercicio5 {
    public static void main(String[] args) {
        int n = 3;
        int[][] matrizDeIdentidade = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    matrizDeIdentidade[i][j] = 1;
                } else {
                    matrizDeIdentidade[i][j] = 0;
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(matrizDeIdentidade[i][j] + " ");
            }
            System.out.println();
        }

    }

}
