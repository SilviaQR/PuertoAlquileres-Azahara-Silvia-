//Source file: C:\\USERS\\ZIVY\\DESKTOP\\Programacion\\ProyectoAlquileres\\Velero.java


public class Velero extends Barco 
{
   private int nMastiles;
       
   /**
   @param matricula
   @param eslora
   @param anio
   @param duenio
   @param nMastiles
    */
   public Velero(String matricula, double eslora, int anio, Persona duenio, int nMastiles) 
   {
       super(matricula, eslora, anio, duenio);
       this.nMastiles = nMastiles;
   }
   
   /**
    */
   public int getNMastiles() 
   {
       return nMastiles;
   }
   
   public int getCoeficienteBernua()
   {
       return nMastiles;
    }
   
   /**
    */
   public String toString() 
   {
       String textoADevolver = super.toString();
       textoADevolver += "\n" + nMastiles;
       return textoADevolver;
   }
}
