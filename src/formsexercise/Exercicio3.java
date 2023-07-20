package formsexercise;

//Crie um método que receba como parâmetro  um texto do tipo String e retorne se este texto é palindromo.

public class Exercicio3 {
    private static boolean isPalindrome(String texto) {

        texto = texto.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = texto.length() - 1;

        while (left < right) {
            if (texto.charAt(left) != texto.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    //    private static boolean isPalindrome2(String frase) {
    //        frase = frase.replaceAll("\\s+", "").toLowerCase();
    //        StringBuilder texto = new StringBuilder(frase);
    //        if(frase.equals(texto.reverse())) {
    //            return true;
    //        } else {
    //            return false;
    //        }
    //
    //    }


    public static void main(String[] args) {
        String text = "Roma é amor";

        if (isPalindrome(text)) {
            System.out.println("O texto é um palíndromo.");
        } else {
            System.out.println("O texto não é um palíndromo.");
        }
    }

}
