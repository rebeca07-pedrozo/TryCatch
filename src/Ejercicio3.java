import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio3 {
    public void SumaDosNumerosEnteros(){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Ingrese el primer número: ");
            int num1 = sc.nextInt();
            System.out.print("Ingrese el segundo número: ");
            int num2 = sc.nextInt();
            int suma=num1+num2;
            System.out.println("La suma es: " + suma);
        }catch(InputMismatchException e){
            System.out.println("Ingresar dos numeros ENTEROS");
        }finally {
            sc.close();
        }
    }
}
