class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                counter++;
            }
            else{
                max = Math.max(counter, max);
                counter = 0;
            }
            
        }
        return max = Math.max(counter, max);
    }
}