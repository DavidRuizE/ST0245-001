public class Fecha {
   
    private final int dia;
    private final int mes;
    private final int agno;


    /**
     * Se inicializan las variables globales en el constructor de manera que no posean valores nulos o 0s.
     */
    public Fecha(int d, int m, int a) {
        dia = d;
        mes = m;
        agno = a;
    }

    public int dia() {
       return dia;
    }

    public int mes() {
       return mes;
    }


    public int agno() {
       return agno;
    }

    /**
    * @param otra representa la fecha con la cual se va a comparar.
    *
    * El método comprar se encarga de devolvernos respuesta a tres posibilidades.
    * 1: si la fecha es menor que la otra retorna -1.
    * 2: si la fecha es igual que la otra retorna 0.
    * 3: si la fecha es mayor que la otra retorna 1.
    *
    * @return -1 sí es menor; 0 sí es igual; 1 sí es mayor.
    *
    */

    public int comparar(Fecha otra) {
      
    }   
          
       
    /**
    * toString se encargará de convertir el tipo abstracto fecha en un tipo cadena
    * para su posterior visualización
    *
    * @return una cadena que contiene la fecha
    */
    public String toString() {
        
    }
}