public class SubsecuenciaADN
{
    public int lcsDNAAUX(String cadena1, String cadena2, int m, int n){
         if(m == 0 || n== 0) {
            return 0;
        }
         if(cadena1.charAt(m-1) == cadena2.charAt(n-1)){
            return lcsDNAAUX(cadena1, cadena2,m-1,n-1) + 1;
        }
            return Math.max(lcsDNAAUX(cadena1,cadena2,m,n-1),lcsDNAAUX(cadena1,cadena2,m-1,n));
    }
}