
/**
 * Write a description of class Alquiler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alquiler
{
    static final int VALOR_MULTIPLICADOR_ESLORA = 10;
    static final int VALOR_MULTIPLICADOR_BERNUA = 300;
    private int diasOcupacion;
    private int posicionAmarre;
    private Barco barco;
   
    public Alquiler(int diasOcupacion,int posicionAmarre,Barco barco)
    {
        this.diasOcupacion = diasOcupacion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }
 
    //Devuelve el precio del alquiler
    public float getPrecioAlquiler()
    {
        float precio = (diasOcupacion *((float)barco.getEslora() *VALOR_MULTIPLICADOR_ESLORA))+ ( VALOR_MULTIPLICADOR_BERNUA * barco.getCoeficienteBernua());
        return precio;
    }
    
    //Devuelve el Numero de amarres
    public int getNumeroAmarre()
    {
		return posicionAmarre;
	}
	
	public String toString()
	{
	    String cadenaADevolver = "";
	    cadenaADevolver += barco.toString()+"Alquilado "+diasOcupacion+ " dias en el amarre numero "+posicionAmarre;
	    return cadenaADevolver;
	}
}
