import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ConsultaPelicula consulta = new ConsultaPelicula();
        System.out.println("Que pelicula de star wars estas buscando?");
        try {
            var numeroPelicula = Integer.valueOf(scanner.nextLine());
            Pelicula pelicula = consulta.buscarPelicula(numeroPelicula);
            System.out.println(pelicula);
            GeneradorArchivo generador = new GeneradorArchivo();
            generador.guardarJson(pelicula);

        }catch (NumberFormatException e){
            System.out.println("Numero no encontrado, "+e.getMessage());
        }catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando app");
        }

    }
}