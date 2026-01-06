@SuppressWarnings("unused")
public class Mugiwara
{
    String nombre;
    short edad;
    final String Tripulacion = "¡Yo pertenezco a la tripulacion de los sombrero de paja!"; 
    String frase;
    String role;
    String devilfruit;
    
    // Constructor.
    public Mugiwara(String nombre, short edad, String frase, String role, String devilfruit)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.frase = frase;
        this.role = role;
        this.devilfruit = devilfruit;
    }

    // Impresor de caracteristicas de un integrante de la tripulacion.
    public void printsingularities()
    {
        System.out.println("\nNombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Frase caracteristica: " + frase);
        System.out.println("Rol: " + role);
        System.out.println("Fruta del diablo: " + devilfruit); 
    }

    /* Ejemplo get y set methods, para activar cambiar la variable Tripulacion a tripulacion y cambiar final por private.
    public void setTripulacion(String Newtripulacion)
    {
        this.tripulacion = Newtripulacion;
    }

    public String getTripulacion() // ejemplo get method
    {
        return tripulacion;   
    }
    */

   


}
