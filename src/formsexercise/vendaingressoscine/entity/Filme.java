package formsexercise.vendaingressoscine.entity;


public class Filme {
    private int id;
    private String titulo;
    private String genero;
    private int idadeMinima;
    private int tempo;
    private double valor;
    private FilmeTecnologiaEnum tecnologia;
    private boolean poltronasDisponiveis;


    public Filme(int id, String titulo, String genero, int idadeMinima, int tempo, double valor, FilmeTecnologiaEnum tecnologia, boolean poltronasDisponiveis) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.idadeMinima = idadeMinima;
        this.tempo = tempo;
        this.valor = valor;
        this.tecnologia = tecnologia;
        this.poltronasDisponiveis = poltronasDisponiveis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdadeMinima() {
        return idadeMinima;
    }

    public void setIdadeMinima(int idadeMinima) {
        this.idadeMinima = idadeMinima;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public FilmeTecnologiaEnum getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(FilmeTecnologiaEnum tecnologia) {
        this.tecnologia = tecnologia;
    }

    public boolean getPoltronasDisponiveis() {
        return poltronasDisponiveis;
    }

    public void setPoltronasDisponiveis(boolean poltronasDisponiveis) {
        this.poltronasDisponiveis = poltronasDisponiveis;
    }
}
