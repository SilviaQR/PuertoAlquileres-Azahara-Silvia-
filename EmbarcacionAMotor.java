//Source file: C:\\USERS\\ZIVY\\DESKTOP\\Programacion\\ProyectoAlquileres\\EmbarcacionDeportivaAMotor.java

public class EmbarcacionAMotor extends Barco 
{
    private int potenciaEnCv;

    /**
    @param matricula
    @param eslora
    @param anio
    @param duenio
    @param potenciaEnCv
     */
    public EmbarcacionAMotor(String matricula, double eslora, int anio, Persona duenio, int potenciaEnCv) 
    {
        super(matricula, eslora, anio, duenio);
        this.potenciaEnCv = potenciaEnCv;
    }

    /**
     */
    public int getPotenciaEnCv() 
    {
        return potenciaEnCv;
    }
   
    public int getCoeficienteBernua(){
        return potenciaEnCv;
    }   

    /**
     */
    public String toString() 
    {
        String textoADevolver = super.toString();
        textoADevolver += "\n" + potenciaEnCv;
        return textoADevolver;
    }
}
