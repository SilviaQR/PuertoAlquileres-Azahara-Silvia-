
public class Puerto
{
    private Alquiler[] amarres;
    /**
     * Constructor for objects of class Puerto
     */
    public Puerto()
    {
        amarres = new Alquiler[4];
    }
    
    public float alquilarAmarre(int numDias,Barco barco)
    {
        float alquiler = -1;
        
        if (hayAmarresLibres())
        {
            //busca la primera posicion libre
            int primeraPosicionLibre = posicionPrimerAmarreLibre();
            //crea un nuevo alquiler
            Alquiler nuevoAlquiler = new Alquiler(numDias,primeraPosicionLibre, barco);
            //guarda el alquiler en el array
            amarres[primeraPosicionLibre] = nuevoAlquiler;
            //Obtiene precio del alquiler.
            alquiler = nuevoAlquiler.getPrecioAlquiler();
        }
        return alquiler;
    }
    
    public float liquidarAlquilerAmarre(int posicionAmarre)
    {
        float alquiler = -1;
        
        //Comprobamos que la posicion sea valida y el amarre esté alquilado.
        if(!(posicionAmarre < 0 || posicionAmarre >= amarres.length) && amarres[posicionAmarre] !=null)
        {
            //metemos en la variable amarres el precio del amarre
            alquiler = amarres[posicionAmarre].getPrecioAlquiler();
            amarres[posicionAmarre] = null;
        }
        return alquiler;
    }
    
    
    public void verEstadoAmarres()
    {
        //Recorremos el array de amarres y comprobamos si están libres o están ocupados
        for(int i = 0; i < amarres.length ; i++)
        {
            if (amarres[i] == null)
            {
                System.out.println("El amarre " + i + " está libre");
            } 
            else 
            {
               
               System.out.println(amarres[i].toString());
            }
        }
    }
    
    //Devuelve la posicion del primer amarre libre
    private int posicionPrimerAmarreLibre()
    {
        int primerAmarreLibre = -1;
        boolean amarreEncontrado = true;
        int posicionAmarre = 0;
        
        //Buscamos el primer amarre libre y se cambia a false.
        while(posicionAmarre < amarres.length && amarreEncontrado)
        {
            if (amarres[posicionAmarre] == null) {
                primerAmarreLibre = posicionAmarre;
                amarreEncontrado = false;
            }
            posicionAmarre++;
        }
        return primerAmarreLibre;
    }
    
    private boolean hayAmarresLibres()
    {
        boolean amarresLibres = false;
        int posicionAmarre = 0;
        
        //Recorre el array para ver si hay algun amarre libre
        while(posicionAmarre < amarres.length  && !amarresLibres){
            if (amarres[posicionAmarre] == null) {
                amarresLibres = true;
            }
            posicionAmarre++;
        }
        return amarresLibres;
    }
}
