import java.util.Scanner;
import movement.Movements;

public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Movements mv = new Movements();
        String request;
        String ans;
        System.out.println("Hola mundo! Este es un mini ejemplo de un objeto que se mueve.");
        System.out.println("""
            No olvides que para ir...\n
            al norte es la tecla W \n
            al sur es la tecla S \n
            al este es la tecla D \n
            y al oeste es la tecla A
            
            Q -> Para salir
            """);

        System.out.println("Intentalo :) ");

        do{
            System.out.print(">>> ");
            request = (scan.nextLine()).toLowerCase();
            ans = mv.transDirections(request);
            System.out.println(mv.coordenadas(ans));
        } while (!"q".equals(request));

        System.out.println("Good Bye!!!");
        

    }
}
