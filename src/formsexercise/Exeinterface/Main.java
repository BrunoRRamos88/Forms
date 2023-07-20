package formsexercise.Exeinterface;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Usuario usuarioBase = new UsuarioBase();
            Usuario usuarioStandard = new UsuarioStandard();
            Usuario usuarioPremium = new UsuarioPremium();

            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o Valor do Produto: ");
            double valorProduto = scanner.nextDouble();

            System.out.println("Digite o Valor do Frete: ");
            double valorFrete = scanner.nextDouble();


            System.out.println("Usuário Base:");
            System.out.println("Desconto: R$ " + usuarioBase.getValorDesconto(valorProduto));
            System.out.println("Tipo de Usuário: " + usuarioBase.getTipoUsuario());
            System.out.println("Valor do Frete com Desconto: R$ " + usuarioBase.getValorFreteDesconto(valorFrete, valorProduto));

            System.out.println("_______________________________________");

            System.out.println("Usuário Standard:");
            System.out.println("Desconto: R$ " + usuarioStandard.getValorDesconto(valorProduto));
            System.out.println("Tipo de Usuário: " + usuarioStandard.getTipoUsuario());
            System.out.println("Valor do Frete com Desconto: R$ " + usuarioStandard.getValorFreteDesconto(valorFrete, valorProduto));

            System.out.println("_______________________________________");

            System.out.println("Usuário Premium:");
            System.out.println("Desconto: R$ " + usuarioPremium.getValorDesconto(valorProduto));
            System.out.println("Tipo de Usuário: " + usuarioPremium.getTipoUsuario());
            System.out.println("Valor do Frete com Desconto: R$ " + usuarioPremium.getValorFreteDesconto(valorFrete, valorProduto));
        }
    }
