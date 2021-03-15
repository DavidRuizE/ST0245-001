public class maxSpan
{
    public int maxSpan(int[] nums) {
        int span = 0;
        int temp = 0;
        for(int i = 0; i<nums.length; i++){
            for(int j = nums.length; j>0; j--){
                if(nums[i]==nums[j-1]) temp = (j-i);
                span = Math.max(temp,span);
            }
        }
        return span;
    }
}