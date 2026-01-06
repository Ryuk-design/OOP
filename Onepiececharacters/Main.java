@SuppressWarnings("unused")
public class Main{
    public static void main(String[] args){
        // Al crear un objeto: dentro de los paréntesis, coloque el nombre del mugiwara, su edad y frase característica.

        // Monkey D. Luffy
        Mugiwara luffy = new Mugiwara("Monkey D. Luffy", (short) 19, "¡Yo sere el rey de los piratas!", "Capitan", "Goma goma");
        luffy.printsingularities();
        
        // Roronoa Zoro
        Mugiwara zoro = new Mugiwara("Roronoa Zoro", (short) 21, "Mi ambición no significa nada si no puedo proteger a mi propio capitán", "Vicecapitan", "Ninguna");
        zoro.printsingularities();    
        
        //ejemplo set method y get method, activar en Mugiwara.java
        /*// Trafalgar Law
        Mugiwara law = new Mugiwara("Trafalgar D. Water Law", (short) 26, "Los débiles no eligen cómo mueren", "Capitan", "Ope Ope");
        law.printsingularities();
        law.setTripulacion("¡Yo pertenezco a la tripulacion de los piratas corazon!");
        System.out.println(law.getTripulacion());*/
        

    }

}