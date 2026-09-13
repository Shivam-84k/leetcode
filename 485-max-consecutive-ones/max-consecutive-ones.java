class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int Maxcount = 0;
        int count = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                Maxcount++;
            }
            else{
                
                Maxcount = 0;
            }
            if(count<=Maxcount){
                    count = Maxcount;
                }
        }
        return count;
    }
}