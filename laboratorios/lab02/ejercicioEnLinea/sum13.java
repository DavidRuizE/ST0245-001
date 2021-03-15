public class sum13{    
     public int sum13(int[] nums) {
        int sum= 0;
        if (nums.length==0) {
            sum = 0;
        } 
        for (int i = 0; i<nums.length;i++){
            if (nums[i] != 13){
                sum = sum + nums[i];
            } else if (nums[i] == 13 && i != nums.length-1 && nums[i+1]!= 13) {
                sum = sum - nums[i+1];
            } else if (nums[i] == 13 && i == nums.length-1){
                sum = sum;
            } else{
                sum = 0;
             }
        }
        return sum;
     }
}