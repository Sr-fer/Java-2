import java.util.Scanner;

public class Usuario extends Participante {
    public Usuario(int victorias, int derrotas, int partidas, String nombre){
        super(victorias, derrotas, partidas, nombre);
    }
    Scanner Cara_Cruz = new Scanner(System.in);


    public int caraOCruz(){
        int eleccion;
        System.out.println("Que Quieres?Cara = 1 o Cruz = 2");
        String choice = Cara_Cruz.nextLine();
        if(choice.contains("1")){
             eleccion = 1;
        } else if (choice.contains("2")) {
             eleccion = 2;
        } else {
            eleccion = 3;
        }
        return eleccion;
    }
}

