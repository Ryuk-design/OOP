import java.util.Scanner;
import personajes.*;

@SuppressWarnings("unused")
public class Main{
    public static void main(String[] args){
        Scanner userinput = new Scanner(System.in);
        System.out.println("Ingresa el Mugiwara que deseas conocer:\nLuffy\nZoro\nUsopp\nSanji\nNami");
        String nombre = userinput.next();

        // Al crear un objeto: dentro de los paréntesis, coloque el nombre del mugiwara, su edad, frase característica, fruta del diablo y deseo.
        switch (nombre)
        {
            case "Luffy" -> {
                Mugiwara luffy = new Mugiwara("Monkey D. Luffy", (short) 19, "¡Yo sere el rey de los piratas!", "Capitan", "Goma goma", "Luffy desea ser el rey de los piratas");
                luffy.printsingularities();
            }
            case "Zoro" -> {
                Mugiwara zoro = new Mugiwara("Roronoa Zoro", (short) 21, "Mi ambición no significa nada si no puedo proteger a mi propio capitán", "Vicecapitan", "Ninguna", "Zoro desea ser el mejor espadachin");
                zoro.printsingularities();
            }
            case "Usopp" -> {
                Mugiwara usopp = new Mugiwara("Usopp", (short) 19, "¡Los hombres que dudan... SON DÉBILES!", "Inventor", "Ninguna", "Usopp desea ser un bravo guerrero del mar");
                usopp.printsingularities();
            }
            case "Nami" -> {
                Mugiwara nami = new Mugiwara("Nami", (short) 20, "La vida es como un lápiz que seguro se va a acabar, pero dejará la hermosa escritura de la vida", "Navegante", "Ninguna", "Nami desea dibujar un mapa del mundo entero");
                nami.printsingularities();
            }   
            case "Sanji" -> {
                Mugiwara sanji = new Mugiwara("Sanji", (short) 21, "Los hombres de verdad perdonan las mentiras que dicen las mujeres", "Cocinero", "Ninguna", "Sanji desea encontrar el azul infinito");
                sanji.printsingularities();
            }
 
        }

        //set method y get method, activar en Mugiwara.java
        //Trafalgar Law
        Mugiwara law = new Mugiwara("Trafalgar D. Water Law", (short) 26, "Los débiles no eligen cómo mueren", "Capitan", "Ope Ope", "");
        law.printsingularities();
        law.setTripulacion("¡Yo pertenezco a la tripulacion de los piratas corazon!");
        System.out.println(law.getTripulacion());
    }
}



