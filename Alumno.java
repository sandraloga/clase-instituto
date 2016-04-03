
/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno
{
    private String nombre;
    private int edad;
    public static int numeroClase = 1;
    private int[] notas;

    /**
     * Constructor for objects of class Alumno
     */
    public Alumno(String nombre,int edad)
    {
        notas = new int[0];
        this.nombre= nombre;
        this.edad=edad;
    }

}