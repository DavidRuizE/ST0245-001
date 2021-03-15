    import java.util.Arrays;
    public class insertionsortTiempo
    {
        public static int [] arreglo(int n){
            int [] arr = new int [n];
            for (int i = 0; i<n; i++){
                arr[i]= (int) Math.round(Math.random()*10);
            }
            return arr;
        }
        
        
        public static void InsertionSort(int[] A)
        {
           int temp,j;
           for (int i = 0; i < A.length; i++)
           {
             j = i;
             while (j > 0 && A[j-1] > A[j])
               {
                   temp = A[j];
                   A[j] = A[j-1];
                   A[j-1] = temp;
                   j = j-1;
                }           
           }
        }
        
        
        public static void main (String [] args){
            int n;
        for(n=10000; n<=200000; n=n+10000){
            int [] A=arreglo(n);
                long tiempo1=System.currentTimeMillis();
                InsertionSort(A);
                long tiempo2=System.currentTimeMillis();
                System.out.println("el tiempo es: " + (tiempo2-tiempo1));
            
        }
     }
}




import java.util.Arrays;
public class Merge
{
    public static int [] arreglo(int n){
        int [] arr = new int [n];
        for (int i = 0; i<n; i++){
            arr[i]= (int) Math.round(Math.random()*10);
        }
        return arr;
    }

    public static void mergeSort(int [ ] a){
	int[] tmp = new int[a.length];
	mergeSort(a, tmp,  0,  a.length - 1);
    }


    private static void mergeSort(int [ ] a, int [ ] tmp, int left, int right){
	if( left < right ){
			int center = (left + right) / 2;
			mergeSort(a, tmp, left, center);
			mergeSort(a, tmp, center + 1, right);
			merge(a, tmp, left, center + 1, right);
	}
    }


    private static void merge(int[ ] a, int[ ] tmp, int left, int right, int rightEnd ){
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;

        while(left <= leftEnd && right <= rightEnd)
            if(a[left] <= a[right] )
                tmp[k++] = a[left++];
            else
                tmp[k++] = a[right++];

        while(left <= leftEnd)   
            tmp[k++] = a[left++];

        while(right <= rightEnd)  
            tmp[k++] = a[right++];

        
        for(int i = 0; i < num; i++, rightEnd--)
            a[rightEnd] = tmp[rightEnd];
    }
 

    public static void main (String [] args){
        int n;
        for(n=100000; n<=2000000; n=n+100000){
            int [] arr=arreglo(n);
            long tiempo1=System.currentTimeMillis();
            mergeSort(arr);
            long tiempo2=System.currentTimeMillis();
            System.out.println("el tiempo es: " + (tiempo2-tiempo1));

        }
    }
} 
