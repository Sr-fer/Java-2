public class Participante {

    private int victorias ;
    private int derrotas ;
    private int partidas ;

    private String nombre ;


    public Participante() {
    }

    public Participante(int victorias, int derrotas, int partidas, String nombre) {
        this.victorias = victorias;
        this.derrotas = derrotas;
        this.partidas = partidas;
        this.nombre = nombre;
    }

    public void setDerrotas(int derrotas) {
    this.derrotas = derrotas;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public void setPartidas(int partidas) {
        this.partidas = partidas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getVictorias() {
        return victorias;
    }

    public int getPartidas() {
        return partidas;
    }

    public String getNombre() {
        return nombre;
    }

    public String[] datos(){
        String[]datosUser = {"" + victorias, "" + derrotas, nombre};
        return datosUser;
    }
}


