class Solution {
    public int pivotIndex(int[] nums) {

        int total_sum = 0;
        int left_sum = 0;
        int right_sum = 0;

        for(int i = 0; i < nums.length; i++){
            total_sum += nums[i];
        }
        for(int j = 0; j < nums.length; j++){
            if(j>0){
                left_sum += nums[j-1];
            }
            else{left_sum = 0;}

            right_sum = total_sum - left_sum - nums[j];
            if(left_sum == right_sum){
                return j;
            }
        }
        return -1;
    }
}