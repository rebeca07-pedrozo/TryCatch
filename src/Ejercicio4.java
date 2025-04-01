import java.util.InputMismatchException;
import java.util.Scanner;

class MultiplicarPorCeroException extends Exception {
    public MultiplicarPorCeroException(String mensaje) {
        super(mensaje);
    }
}

public class Ejercicio4 {
    public void MultiplicacionDosNumeros() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese el primer número para multiplicarlo: ");
            int num1 = sc.nextInt();
            System.out.print("Ingrese el segundo número para multiplicarlo: ");
            int num2 = sc.nextInt();

            if (num1 == 0 || num2 == 0) {
                throw new MultiplicarPorCeroException("No se puede multiplicar por cero");
            }

            int multiplicacion = num1 * num2;
            System.out.println("El producto es: " + multiplicacion);

        } catch (MultiplicarPorCeroException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("No ingrese ceros");
        } finally {
            sc.close();
        }
    }

    public static void main(String[] args) {
        Ejercicio4 ejercicio = new Ejercicio4();
        ejercicio.MultiplicacionDosNumeros();
    }
}
