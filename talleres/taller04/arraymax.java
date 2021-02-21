
public class arraymax
{
        public static int arrayMax(int[] array, int n) {
	int max, temp;
	max = array[n];
	if(n!=0){
	    temp = arrayMax(array,n-1);
	    if(temp>max){
		max = temp;
	}
	return max;
    }
   }
}
