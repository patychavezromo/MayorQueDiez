import java.util.Scanner;

public class ClasePrincipal
{
    public static void main(String[] args)
    {
        System.out.println("BIENVENIDO");
        System.out.print("Ingresa un numero : ");
        Scanner teclado=new Scanner(System.in);
        int a=teclado.nextInt();
        System.out.println("El numero ingresado es: "+a);
        if (a < 10) {
            System.out.println(a + " es menor que 10");
        }
        else if (a == 10) {
            System.out.println(a + " es igual que 10");
        }
        else {
            System.out.println(a + " es mayor que 10");
        }

    }
}