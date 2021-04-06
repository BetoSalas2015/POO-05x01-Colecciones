
/**
 * Write a description of class Factura here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Vector;

public class Factura
{
    // instance variables - replace the example below with your own
    private Vector<Articulo> articulos;
    private Vector<Integer> enteros;
    private String empresa;
    private String cliente;
    private static int num;

    /**
     * Constructor for objects of class Factura
     */
    public Factura(String nomC)
    {
        // initialise instance variables
        articulos = new Vector<Articulo>(10);
        empresa = new String("Papelerías Anthony");
        cliente = new String(nomC);
        num++;
    }

    public int getNumArticulos() 
    {
        return articulos.size();
    }
    
    public void agregaArticulos(Articulo art)
    {
        articulos.add(art);
    }
    
    public Articulo getArticulo(int index)
    {
        return articulos.get(index);
    }
    
    public void setArticulo(int index, Articulo art)
    {
        articulos.set(index, art);
    }
    
    public double calculaTotalArticulos()
    {
        double sum = 0.0;
        //for(int i = 0; i < articulos.size(); ++i)
        //{
        //    recorre = getArticulo(i);
        //    sum += recorre.importe();
        //}
        for(Articulo recorre : articulos)
            sum += recorre.importe();
        return sum;
    }

}







