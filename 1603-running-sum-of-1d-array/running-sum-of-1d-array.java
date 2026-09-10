class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int result [] = new int [n] ;

        for(int i=0;i<nums.length;i++){
            if(i == 0){
                sum = nums[i];
                result[i] = sum;
            }
            else{
                sum = nums[i]+ sum;
                result[i] = sum;
            }
        }
        return result;

    }
}