public class Main {

    public static void main(String[] args) {
        Participante participante1 = new Participante(0, 0, 0, "Alfredo");
        Usuario usuario1 = new Usuario(0,0,0, "Juan");
        Maquina maquina1 = new Maquina(0, 0, 0, "IA");

        for(String cadena: participante1.datos()) {
            System.out.println(cadena);
        }

        System.out.println(usuario1.caraOCruz());
        System.out.println(maquina1.random());
    }

}