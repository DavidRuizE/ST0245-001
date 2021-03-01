public class SubsecuenciaADN
{
    public int subsequence(String x, String y, int m, int n){
        if(m == 0 || n== 0) {
            return 0;
        }
        if(x.charAt(m-1) == y.charAt(n-1)){
            return subsequence(x,y,m-1,n-1) + 1;
        }
            return Math.max(subsequence(x,y,m,n-1),subsequence(x,y,m-1,n));
    }
}