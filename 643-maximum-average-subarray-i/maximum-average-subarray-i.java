class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        int left = 0;
        double maxSumAverage = -Double.MAX_VALUE;
        for(int right = 0 ; right < nums.length ; right++){
            sum += nums[right];

            if(right - left + 1 > k){
                sum -= nums[left];
                left++;
            }

            if(right - left + 1 == k){
                maxSumAverage = Math.max(sum , maxSumAverage);
                
            }
        }

        return maxSumAverage / k;
    }
}