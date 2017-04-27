//Source file: C:\\USERS\\ZIVY\\DESKTOP\\Programacion\\ProyectoAlquileres\\Yate.java


public class Yate extends EmbarcacionAMotor 
{
   private int nCamarotes;
  
   /**
   @param matricula
   @param eslora
   @param anio
   @param duenio
   @param potenciaEnCv
   @param nCamarotes
      */
   public Yate(String matricula, double eslora, int anio, Persona duenio, int potenciaEnCv, int nCamarotes) 
   {
       super(matricula, eslora, anio, duenio, potenciaEnCv);
       this.nCamarotes = nCamarotes;
   }
   
   /**
    */
   public int getNCamarotes() 
   {
       return nCamarotes;
   }
   
   public int getCoeficienteBernua()
   {
       int resultado = getPotenciaEnCv() + nCamarotes;
       return resultado;
    }
   
   /**
    */
   public String toString() 
   {
       String textoADevolver = super.toString();
       textoADevolver += "\n" + nCamarotes;       
       return textoADevolver;
   }
}
