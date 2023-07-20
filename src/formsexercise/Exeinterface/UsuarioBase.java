package formsexercise.Exeinterface;

public class UsuarioBase implements Usuario{
    @Override
    public Double getValorDesconto(double valorProduto) {
        if (valorProduto > 300) {
            return valorProduto * 0.05;
        }
        return 0.0;
    }

    @Override
    public String getTipoUsuario() {
        return "Base";
    }

    @Override
    public Double getValorFreteDesconto(double valorFrete, double valorProduto) {
        if (valorProduto > 300) {
            return valorFrete * 0.05;
        }
        return valorFrete;
    }
}

