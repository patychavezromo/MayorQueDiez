import java.util.Scanner;

public class ClasePrincipal
{
    public static void main(String[] args)
    {
        System.out.println("BIENVENIDO");
        Scanner teclado=new Scanner(System.in);
        int a;
        System.out.print("Ingresa un numero : ");
        a=teclado.nextInt();
        String valor;
        valor= Integer.toString(a);
        System.out.print("El numero ingresado es: "+valor);
    }
}