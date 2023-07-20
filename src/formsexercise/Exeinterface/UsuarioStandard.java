package formsexercise.Exeinterface;

class UsuarioStandard implements Usuario{
    @Override
    public Double getValorDesconto(double valorProduto) {
        if (valorProduto > 200) {
            return valorProduto * 0.15;
        }
        return 0.0;
    }
    @Override
    public String getTipoUsuario() {
        return "Standard";
    }

    @Override
    public Double getValorFreteDesconto(double valorFrete, double valorProduto) {
        if (valorProduto > 200) {
            return valorFrete * 0.10;
        }
        return valorFrete;
    }
}

