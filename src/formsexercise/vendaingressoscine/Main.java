package formsexercise.vendaingressoscine;


import formsexercise.vendaingressoscine.entity.Filme;
import formsexercise.vendaingressoscine.entity.FilmeTecnologiaEnum;
import formsexercise.vendaingressoscine.entity.Usuario;
import formsexercise.vendaingressoscine.entity.UsuarioRoleEnum;

public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme(1, "1222222", "Infantil", 10, 120, 20, FilmeTecnologiaEnum.FILME_3D, true);
        Usuario usuario = new Usuario("Bruno", UsuarioRoleEnum.ROLE_CLIENTE, 25, "Brunorr23", "123456");
    }
}