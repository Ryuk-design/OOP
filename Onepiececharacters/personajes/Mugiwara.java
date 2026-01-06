package personajes;
@SuppressWarnings("unused")
public class Mugiwara
{
    String nombre;
    short edad;
    @SuppressWarnings("FieldMayBeFinal")
    private String tripulacion = "¡Yo pertenezco a la tripulacion de los sombrero de paja!"; 
    String frase;
    String role;
    String devilfruit;
    String sueño;
    
    // Constructor.
    public Mugiwara(String nombre, short edad, String frase, String role, String devilfruit, String sueño)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.frase = frase;
        this.role = role;
        this.devilfruit = devilfruit;
        this.sueño = sueño;
    }

    // Impresor de caracteristicas de un integrante de la tripulacion.
    public void printsingularities()
    {
        System.out.println("\nNombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Frase caracteristica: " + frase);
        System.out.println("Rol: " + role);
        System.out.println("Fruta del diablo: " + devilfruit); 
        System.out.println("Sueño: " + sueño);
    }

    // get y set methods
    public void setTripulacion(String Newtripulacion)
    {
        this.tripulacion = Newtripulacion;
    }

    public String getTripulacion()
    {
        return tripulacion;   
    }
}

