package formsexercise.vendaingressoscine;

import br.com.abc.exerciciosforms.vendaingressoscine.entity.Filme;
import br.com.abc.exerciciosforms.vendaingressoscine.entity.FilmeTecnologiaEnum;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme(1, "1222222", "Infantil", 10, 120, 20, FilmeTecnologiaEnum.FILME_3D, true);
    }
}