//Source file: C:\\USERS\\ZIVY\\DESKTOP\\Programacion\\ProyectoAlquileres\\Barco.java


public abstract class Barco 
{
   private String nMatricula;
   private double eslora;
   private int anioFabricacion;
   private Persona duenioBarco;
       
   /**
   @param matricula
   @param eslora
   @param duenio
    */
   public Barco(String nMatricula, double eslora, int anioFabricacion, Persona duenioBarco) 
   {
       this.nMatricula = nMatricula;
       this.eslora = eslora;
       this.anioFabricacion = anioFabricacion;
       this.duenioBarco = duenioBarco;
   }
   
   /**
   */
   public String getNMatricula() 
   {
       return nMatricula;
   }
   
   /**
    */
   public double getEslora() 
   {
       return eslora;
   }
   
   /**
    */
   public int getAnioFabricaion() 
   {
       return anioFabricacion;
   }
   
     /**
    */
   public Persona getDuenioBarco() 
   {
       return duenioBarco;
   }
   

   public abstract int getCoeficienteBernua() ;
      
   /**
    */
   public String toString() 
   {
       String textoAMostrar = nMatricula + "\n" + eslora + "\n" + anioFabricacion + "\n" + duenioBarco;
       return textoAMostrar;
   }
}
