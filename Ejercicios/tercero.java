/*
3. Write a Program to Swap Two Numbers
Input: a=2  b=5
Output: a=5  b=2
*/
import java.util.Scanner;
public class tercero
{
    public int[] intercambio(int[] c)
    {   
        int a = c[1];
        int b = c[0];
        int[] d = {a, b};
        return d;
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args)
    {
        System.out.println("Intercambio dos numeros ingresados");
        Scanner numero = new Scanner(System.in);
        System.out.println("a: ");
        int a = numero.nextInt();
        System.out.println("b: ");
        int b = numero.nextInt();
        int[] c = {a, b};
        tercero swapeador = new tercero();
        int[] d = swapeador.intercambio(c);
        a = d[0];
        b = d[1];
        System.out.print("a = " + a + "\n" + "b = " + b);
        numero.close();
    }
}