public class haveThree{    
    public boolean haveThree(int[] nums) {
        int cont = 0;
        if (nums.length<3){
            return false;
        }
        for (int i = 0; i< nums.length-1; i++){
            if (nums[i] == 3 && nums[i+1] == 3 ){
                return false;
            }
            if (nums [i] == 3){
                cont ++;
            }
        }
        if (nums[nums.length-1]==3){
            cont ++;
        }
        return cont==3;
    }
}