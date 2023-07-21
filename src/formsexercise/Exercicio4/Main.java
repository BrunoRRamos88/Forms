package formsexercise.Exercicio4;

//         Uma pessoa possui { nome cpf, rg, idade}
//         Um funcionário, alem de possuir as mesmas informações de uma pessoa, possui também { cargo, salário}
//         Um Motorista, alem de possuir as mesmas informações de um funcionário, possui também { cnh, placaCarro}
//         Monte a estrutura de classes, instancie 2 Motoristas e imprima no console { nome, cargo e placaCarro } de cada motorista


public class Main {
    public static void main(String[] args) {
        Motorista motorista1 = new Motorista("Jorge", "123.456.789.00", "1234.678-9", 45, "Motorista", 3500, "987456321", "ABC-1234");
        Motorista motorista2 = new Motorista("José", "321.456.001.22", "6547.672-8", 50, "Motorista", 3600, "172583945", "CBA-4321");

        System.out.println("Motorista 1 ");
        System.out.println("Nome: " + motorista1.getNome());
        System.out.println("Cargo: " + motorista1.getCargo());
        System.out.println("Placa do Carro: " + motorista1.getPlacCarro());

        System.out.println("________________________________________________");

        System.out.println("Motorista 2 ");
        System.out.println("Nome: " + motorista2.getNome());
        System.out.println("Cargo: " + motorista2.getCargo());
        System.out.println("Placa do Carro: " + motorista2.getPlacCarro());


    }

}

