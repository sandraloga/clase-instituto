
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

    /**
     * Método que permite introducir una nota entera del alumno.
     * Este método se peude invocar tantas veces como deseemos.
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void addNota(int nota)
    {
        int notasBis[] = new int [notas.length+1];
        for (int index = 0 ; index <notas.length; index++)
        {
            notasBis[index] = notas[index];
        }
        notasBis[notasBis.length-1]=nota;
        notas = notasBis;

    }

    /**
     * método que permita conocer la nota media (en decimal) del alumno en este momento.
     */
    public float notaMedia()
    {
        int sumaNotas=0;
        for(int index = 0; index < notas.length; index++)
        {
            sumaNotas+=notas[index];
        }
        return sumaNotas/notas.length;
    }

}