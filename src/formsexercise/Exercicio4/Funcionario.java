package formsexercise.Exercicio4;

public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cpf, String rg, int idade, String cargo, double salario) {
        super(nome, cpf, rg, idade);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {

        return cargo;
    }

    public void setCargo(String cargo) {

        this.cargo = cargo;
    }

    public double getSalatrio() {

        return salario;
    }

    public void setSalatrio(double salatrio) {

        this.salario = salatrio;
    }
}
