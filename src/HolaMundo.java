import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("¿Cuál es tu nombre? ");
        String texto = teclado.nextLine();
        System.out.println("Hola " + texto);
        System.out.println("Cambio en feature-test");
    }
}