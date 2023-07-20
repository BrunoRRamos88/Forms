package formsexercise;

//Implemente a cifra de Vigenère para criptografar e descriptografar uma mensagem.
//        A aplicação deve:
//
//        COLETAR DADOS:
//        • Receber um texto
//        • Receber uma palavra chave
//        OFERECER OPÇÕES:
//        1 - para criptografar
//        2- para descriptografar
//        REALIZAR A AÇÃO SELECIONADA E IMPRIMIR O RESULTADO NA TELA:

import java.util.Scanner;

public class CifraDeVigenere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Criptografia Textual");
        System.out.println("Digite o texto: ");
        String texto = scanner.nextLine();

        System.out.println("Digite a palavra-chave: ");
        String palavraChave = scanner.nextLine();

        System.out.println("Opções:");
        System.out.println("1 - Criptografar");
        System.out.println("2 - Descriptografar");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        String resultado;
        if (opcao == 1) {
            resultado = criptografar(texto, palavraChave);
        } else if (opcao == 2) {
            resultado = descriptografar(texto, palavraChave);
        } else {
            System.out.println("Opção inválida!");
            return;
        }

        System.out.println("Resultado: " + resultado);
    }

    public static String criptografar(String texto, String palavraChave) {
        StringBuilder resultado = new StringBuilder();
        int tamanhoTexto = texto.length();
        int tamanhoPalavraChave = palavraChave.length();

        for (int i = 0; i < tamanhoTexto; i++) {
            char caractere = texto.charAt(i);
            char chave = palavraChave.charAt(i % tamanhoPalavraChave);

            if (Character.isLetter(caractere)) {
                char novoCaractere = (char) (((caractere - 'a' + chave - 'a') % 26) + 'a');
                resultado.append(novoCaractere);
            } else {
                resultado.append(caractere);
            }
        }

        return resultado.toString();
    }

    public static String descriptografar(String textoCriptografado, String palavraChave) {
        StringBuilder resultado = new StringBuilder();
        int tamanhoTexto = textoCriptografado.length();
        int tamanhoPalavraChave = palavraChave.length();

        for (int i = 0; i < tamanhoTexto; i++) {
            char caractere = textoCriptografado.charAt(i);
            char chave = palavraChave.charAt(i % tamanhoPalavraChave);

            if (Character.isLetter(caractere)) {
                char novoCaractere = (char) (((caractere - chave + 26) % 26) + 'a');
                resultado.append(novoCaractere);
            } else {
                resultado.append(caractere);
            }
        }

        return resultado.toString();
    }
}
