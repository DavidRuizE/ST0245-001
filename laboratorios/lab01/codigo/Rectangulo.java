public class Rectangulo{
    
    public static int rectangulos(int n){

        if(n<=2){
            return n;
        } else{
            return rectangulos(n-2) + rectangulos(n-1);
        }
	
    }
}