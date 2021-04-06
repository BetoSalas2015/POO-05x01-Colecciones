
/**
 * Write a description of class TestArreglos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestArreglos
{
    int arreglo[];
    int []arreglo2, arreglo4 = { 0,1,2,3,4,5,6,7 };
    int[] arreglo3, arreglo5;
    int matriz[][] = { {1,2,3}, {4,5}, {6}, {7,8,9,10} };
    
    
    /**
     * Constructor for objects of class TestArreglos
     */
    public TestArreglos()
    {
        // initialise instance variables
        arreglo = new int[10];
        arreglo[0] = 5;
        arreglo2 = new int[50];
        for(int i = 0; i < arreglo2.length; ++i)
            arreglo2[i] = i;
        
        ejemplo(arreglo2);
        System.out.println( arreglo.length );
        
        //matriz = new int[10][10];
        
        
    }

    public void ejemplo(int variable[])
    {
        variable[1] = 0;
        System.out.println( arreglo2[1] );
    }
    
    
    
}
