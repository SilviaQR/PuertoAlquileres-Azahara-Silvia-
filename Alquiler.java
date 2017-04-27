
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
   
    /**
     * Constructor de la clase Alquiler.
     * @param diasOcupacion entero que especifica los dias de alquiler.
     * @param posicionAmarre entero mediante el cual se ingresa la posicion en la que se va a amarrar el barco.
     * @param barco objeto de tipo barco que informa del tipo de barco.
     */
    public Alquiler(int diasOcupacion,int posicionAmarre,Barco barco)
    {
        this.diasOcupacion = diasOcupacion;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
    }
 
    /**
     * Devuelve el precio del alquiler.
     * @return precio de alquiler.
     */
    public float getPrecioAlquiler()
    {
        float precio = (diasOcupacion *((float)barco.getEslora() *VALOR_MULTIPLICADOR_ESLORA))+ ( VALOR_MULTIPLICADOR_BERNUA * barco.getCoeficienteBernua());
        return precio;
    }
    
    /**
     * Decuelve el numero de amarre alquilado
     * @return posicion del amarre a alquilar
     */
    public int getNumeroAmarre()
    {
		return posicionAmarre;
	}
	
	/**
	 * Método por el cual se devuelve toda la información pertinente al alquiler del barco.
	 * @return informacion del alquiler.
	 */
	public String toString()
	{
	    String cadenaADevolver = "";
	    cadenaADevolver += barco.toString()+"Alquilado "+diasOcupacion+ " dias en el amarre numero "+posicionAmarre;
	    return cadenaADevolver;
	}
}
