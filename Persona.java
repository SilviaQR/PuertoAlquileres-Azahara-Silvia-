//Source file: C:\\USERS\\ZIVY\\DESKTOP\\Programacion\\ProyectoAlquileres\\Cliente.java


public class Persona 
{
   private String nombrePersona;
   private String dni;
   
     /**
   @param nombrecliente
   @param dni
    */
   public Persona(String nombrePersona, String dni) 
   {
       this.nombrePersona = nombrePersona;
       this.dni = dni;
   }
   
   /**
    */
   public String getNombrePersona() 
   {
       return nombrePersona;
   }
   
   /**
    */
   public String getDniPersona() 
   {
       return dni;
   }
   
   /**
    */
   public String toString() 
   {
       String textoADeovlver = nombrePersona + "\n" + dni;
       return textoADeovlver;
   }
}
