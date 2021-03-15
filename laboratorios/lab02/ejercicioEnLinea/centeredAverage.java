public class centeredAverage{    
    public int centeredAverage(int[] nums) {
        int sum = 0;
        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {

            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);

            sum = sum + nums[i];
        }

        sum = sum - max;
        sum = sum - min;

        return sum / (nums.length - 2);
    }
}