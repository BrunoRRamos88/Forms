package formsexercise.Exercicio4;

import formsexercise.Exercicio4.Funcionario;

public class Motorista extends Funcionario {
    private String cnh;
    private String placaCarro;

    public Motorista(String nome, String cpf, String rg, int idade, String cargo, double salario, String cnh, String placaCarro) {
        super(nome, cpf, rg, idade, cargo, salario);
        this.cnh = cnh;
        this.placaCarro = placaCarro;
}


    public String getCnh() {

        return cnh;
    }

    public void setCnh(String cnh) {

        this.cnh = cnh;
    }

    public String getPlacCarro() {

        return placaCarro;
    }

    public void setPlacCarro(String placCarro) {

        this.placaCarro = placCarro;
    }
}
