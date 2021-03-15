public class canBalance{
 public boolean canBalance(int[] nums) {
        int sumap=nums[0];
        int sumaf=0;
        int i=0;
        boolean valor=false;
        if(nums.length>1){
            for(int j =1;j<nums.length;j++){
                sumaf=sumaf+nums[j];
            }
            while(i<nums.length-1){
                for(int j=i+1;j<nums.length;j++){
                    if(!(sumap==sumaf)){
                        sumap=sumap+nums[j];
                        sumaf=sumaf-nums[j];
                    }else
                    {valor=true;
                        break;
                    }
                }
                i++;
            }
            return valor;
        }
        else{
            return false;
        }
    }
}
