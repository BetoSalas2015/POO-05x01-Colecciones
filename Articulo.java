
/**
 * Write a description of class Articulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Articulo
{
    // instance variables - replace the example below with your own
    private int cantidad;
    private double precio;
    private String descrip;
    
    /**
     * Constructor for objects of class Articulo
     */
    public Articulo(int cant, String desc, double prec)
    {
        // initialise instance variables
        cantidad = cant;
        descrip = new String(desc);
        precio = prec;
    }

    public double importe()
    {
        return (precio * cantidad);
    }

}
