public class Fecha {
   
    private final int dia;
    private final int mes;
    private final int agno;

 

 
   
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

    public int invertir(int Fecha){
    
    int Fecha2=0;
    while (Fecha>0) {
        Fecha2=Fecha2+(Fecha%10);
        Fecha=Fecha/10;
    }
    return Fecha2;
    }
   
    public static int invertir2 (int otra){ 
    int Fecha4=0;
    while (otra>0) {
        Fecha4=Fecha4+(otra%10);
        otra=otra/10;
    }
    return Fecha4;
    }
 
    public int comparar(int Fecha2, int Fecha4) {
      if (Fecha2>Fecha4){
          return 1;
      }else if (Fecha2<Fecha4){
          return -1;
      }else{
          return 0;
      }
    }
          
    public String toString() {
        return this.dia + "/" + this.mes + "/" + this.agno;
    }
}