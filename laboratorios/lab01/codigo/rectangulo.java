public class rectangulo{
    
    public static int maneras(int n){

        if(n<=2){
            return n;
        } else{
            return maneras(n-2) + maneras(n-1);
        }
	
    }
}