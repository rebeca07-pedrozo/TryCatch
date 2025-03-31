import java.util.Scanner;
class Ejercicio2 {
    public void convertirEntero() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número entero: ");
            String input = sc.next();
            int number = Integer.parseInt(input);

            System.out.println("Número ingresado: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada no válida. Debe ingresar un número entero.");
        } finally {
            sc.close();
        }
    }
}