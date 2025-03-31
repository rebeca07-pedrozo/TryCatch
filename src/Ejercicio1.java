import java.util.Scanner;
class Ejercicio1 {
    public void dividir() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número: ");
            int num = sc.nextInt();  

            int result = 100 / num;
            System.out.println("El resultado es: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");
        } finally {
            sc.close();
        }
    }
}
