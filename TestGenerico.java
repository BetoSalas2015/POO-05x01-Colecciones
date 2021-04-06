
/**
 * Write a description of class TestGenerico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestGenerico
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class TestGenerico
     */
    public TestGenerico()
    {
        // initialise instance variables

    }

    public static < E > void imprimeArreglo(E [] arregloEntrada)
    {
        for(E elemento: arregloEntrada)
            System.out.print(elemento + ", ");
        System.out.println();
    }
    
    
    public static void main(String args[])
    {
        Integer []arreglo4 = { 0,1,2,3,4,5,6,7 };
        Character []arreglo = { 'a', 'b', 'c', 'd', 'e'};
        Boolean []arreglo2 = { true, true, false, true };
        
        imprimeArreglo(arreglo4);
        imprimeArreglo(arreglo);
        imprimeArreglo(arreglo2);
    }

}






