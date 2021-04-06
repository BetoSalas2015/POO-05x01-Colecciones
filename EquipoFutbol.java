
/**
 * Write a description of class EquipoFutbol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EquipoFutbol
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String entrenador;
    private String equipo[];

    /**
     * Constructor for objects of class EquipoFutbol
     */
    public EquipoFutbol(String nombre, String entrenador)
    {
        // initialise instance variables
        this.nombre = new String(nombre);
        this.entrenador = new String(entrenador);
        equipo = new String[11];
    }

    public String getNombre()
    {
        return new String(nombre);
    }
    
    public String getEntrenador()
    {
        return new String(entrenador);
    }
    
    public void setEntrenador(String nuevoEntrenador)
    {
        entrenador = new String(nuevoEntrenador);
    }
    
    public void agregaJugador(int index, String jugador)
    {
        if(index >= 1 & index <= 11)
            equipo[index - 1] = new String(jugador);
    }
    
    public String getJugador(int index)
    {
        if((index >= 1 && index <= 11) && equipo[index - 1] != null)
            return new String(equipo[index - 1]);
        else
            return null;
    }
}










