
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
    
    /**
     * Método que pasando dos parámetros alquila el primer amarre libre y devuelve el precio de alquiler.
     * @param numDias entero que indica el número de días que se alquila el amarre.
     * @param barco barco que va a ocupar el amarre.
     * @return alquiler devuelve el precio del alquiler.
     */
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
    
    /**
     * Método que termina el alquiler del amarre dejando este libre.
     * @param posicionAmarre entero utilizado para saber el amarre que hay que liquidar.
     * @return devuelve el precio a pagar del alquiler.
     */
    public float liquidarAlquilerAmarre(int posicionAmarre)
    {
        float alquiler = -1;
        
        //Comprobamos que la posicion sea valida y el amarre estÃ© alquilado.
        if(!(posicionAmarre < 0 || posicionAmarre >= amarres.length) && amarres[posicionAmarre] !=null)
        {
            //metemos en la variable amarres el precio del amarre
            alquiler = amarres[posicionAmarre].getPrecioAlquiler();
            amarres[posicionAmarre] = null;
        }
        return alquiler;
    }
    
    /**
     * Metodo que muestra por pantalla el estado de los amarres
     */
    public void verEstadoAmarres()
    {
        //Recorremos el array de amarres y comprobamos si estan libres o estan ocupados
        for(int i = 0; i < amarres.length ; i++)
        {
            if (amarres[i] == null)
            {
                System.out.println("El amarre " + i + " estÃ¡ libre");
            } 
            else 
            {
               
               System.out.println(amarres[i].toString());
            }
        }
    }
    
    /**
     * Método que devuelve el primer Amarre Libre. En caso de no estar libre devolvera -1.
     * @return devuelve la posicion del primer amarre libre.
     */
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
    
    /**
     * Metodo que muestra si existen amarres libres.
     * @return devuelve un booleano. En caso de que se encuentren dara true, en caso contrario sera false.
     */
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
