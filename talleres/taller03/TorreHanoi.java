public class TorreHanoi{
    public static void Hanoi(int n, int i,  int m, int f){
  if(n==1)
  System.out.println("mover disco de " + i + " a " +f);
  else{
     Hanoi(n-1, i, f, m);
     System.out.println("mover disco de "+ i + " a " + f);
     Hanoi(n-1, m, i, f);
   }
 }
}