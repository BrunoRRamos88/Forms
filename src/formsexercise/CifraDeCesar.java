package formsexercise;
//
//Implemente a cifra de César para criptografar e descriptografar uma mensagem.
//        A aplicação deve:
//
//        COLETAR DADOS:
//        • Receber um texto
//        • Receber um número
//        OFERECER OPÇÕES:
//        1 - para criptografar
//        2- para descriptografar
//        REALIZAR A AÇÃO SELECIONADA E IMPRIMIR O RESULTADO NA TELA:

import java.util.Scanner;

public class CifraDeCesar {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Criptografia Textual");
            System.out.println("Digite o texto:");
            String texto = scanner.next();
            System.out.println("Digite um número:");
            int numero = scanner.nextInt();

            System.out.println("Opções:");
            System.out.println("1 - Criptografar");
            System.out.println("2 - Descriptografar");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            String resultado;
            if (opcao == 1) {
                resultado = criptografar(texto, numero);
            } else if (opcao == 2) {
                resultado = descriptografar(texto, numero);
            } else {
                System.out.println("Opção inválida!");
                return;
            }

//            System.out.println("Resultado: " + resultado);


            String textoCriptografado = criptografar(texto, numero);
            System.out.println("Texto criptografado: " + textoCriptografado);

            String textoDescriptografado = descriptografar(textoCriptografado, numero);
            System.out.println("Texto descriptografado: " + textoDescriptografado);
        }

        public static String criptografar(String texto, int numero) {
            StringBuilder resultado = new StringBuilder();


            for (int i = 0; i < texto.length(); i++) {
                char caractere = texto.charAt(i);

                if (Character.isLetter(caractere)) {
                    char novoCaractere = (char) (((caractere - 'a' + numero) % 26) + 'a');
                    resultado.append(novoCaractere);
                } else {
                    resultado.append(caractere);
                }
            }

            return resultado.toString();
        }

        public static String descriptografar(String textoCriptografado, int numero) {
            return criptografar(textoCriptografado, 26 - numero); // Desfaz o deslocamento invertendo a direção
        }
    }