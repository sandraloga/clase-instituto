import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{

    private int numerosTestFallados;
    private Random aleatorio;
    private ArrayList<String> nombres;
    public static int numeroClase = 1;
    private int[] notas;
    private Alumno alumno;

    /**
     * Constructor for objects of class Test
     */
    public Test()
    {

        Random aleatorio = new Random();

        for (int i = 0 ; i <= 5 ; i++)
        {
            int numeros =aleatorio.nextInt(11);
            int edad =aleatorio.nextInt(70);

            nombres = new ArrayList<>(Arrays.asList("Maria","Manuel","Sara","Julio","Pilar","Tino",
                    "Sandra","Fernando","Amparo","Ricardo","Marta"));

            Collections.shuffle(nombres);
            Alumno alumno = new Alumno(nombres.get(numeros),edad);

            for (int index =0; index < 5; index++)
            {
                int notaAleatoria = aleatorio.nextInt(11);
                alumno.addNota(notaAleatoria);
            }
            alumno.muestraDatos();

        }


    }

}
