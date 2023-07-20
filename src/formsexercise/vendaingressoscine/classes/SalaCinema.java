package formsexercise.vendaingressoscine.classes;

import java.util.ArrayList;
import java.util.List;

public class SalaCinema {
    private List<Ingresso> poltronas;


    public SalaCinema (){
        poltronas = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            Ingresso ingresso = new Ingresso();
            poltronas.add(ingresso);
        }
    }
}
