public class Maquina extends Participante {

        public Maquina(int victorias, int derrotas, int partidas, String nombre){
            super(victorias, derrotas, partidas, nombre);
        }


        public int random(){
            int numeroAleatorio = (int) (Math.random()*2);
            return numeroAleatorio;
        }
}
