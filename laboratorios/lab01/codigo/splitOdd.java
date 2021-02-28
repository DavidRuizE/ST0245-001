public boolean splitOdd10(int[] nums) {
    return splitOdd10Helper(0, nums, 0, 0);
}

public boolean splitOdd10Helper(int start, int[] nums, int mult, int odd) {
    if(start >= nums.length){
        return mult % 10 == 0 && odd % 2 == 1;
    }else
    if(splitOdd10Helper(start+1, nums, mult + nums[start], odd)){
        return true;
    }else
    if(splitOdd10Helper(start+1, nums, mult, odd + nums[start])){
        return true;
    }else 
    return false;
}
