package formsexercise.Exeinterface;

//Crie uma interface chamada usuário, ela deve possuir os seguintes métodos:
//
//        METODOS DA INTERFACE
//
//        + Double getValorDesconto(double valorProduto)
//
//        + String getTipoUsuario()
//
//        + Double getValorFreteDesconto(double valorValorFrete, double valorProduto)
//
//        Agora crie 3 classes que implemente esta interface
//
//USUARIO BASE
//        getValorDesconto = ganha 5% se o valorProduto for maior que 300 reais
//        getTipoUsuario = retorna que é base
//        getValorFreteDesconto = ganha 5% se o valorProduto for maior que 300 reais
//USUARIO STANDART
//        getValorDesconto = ganha 15% se o valorProduto for maior que 200 reais
//        getTipoUsuario = retorna que é standart
//        getValorFreteDesconto = ganha 10% se o valorProduto for maior que 200 reais
//USUARIO PREMIUM
//        getValorDesconto = ganha 30% se o valorProduto for maior que 200 reais
//        getTipoUsuario = retorna que é premium
//        getValorFreteDesconto = ganha frete grátis se o valorProduto for maior que 100 reais
//
//        Crie um menu que instancie 3 usuário, cada um implementado com um tipo diferente, passe o mesmo valor de produto e frete para todos
//        Apresente a diferença no console



public interface Usuario {

    Double getValorDesconto(double valorProduto);

    String getTipoUsuario();

    Double getValorFreteDesconto(double valorFrete, double valorProduto);
}
