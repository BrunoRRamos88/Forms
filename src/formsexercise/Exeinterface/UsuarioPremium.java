package formsexercise.Exeinterface;

class UsuarioPremium implements Usuario {
    @Override
    public Double getValorDesconto(double valorProduto) {
        if (valorProduto > 200) {
            return valorProduto * 0.30;
        }
        return 0.0;
    }

    @Override
    public String getTipoUsuario() {
        return "Premium";
    }

    @Override
    public Double getValorFreteDesconto(double valorFrete, double valorProduto) {
        if (valorProduto > 100) {
            return 0.0;
        }
        return valorFrete;
    }
}