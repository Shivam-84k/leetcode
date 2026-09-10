class Solution {
    public int[] leftRightDifference(int[] nums) {
        int totalSum = 0;
        int n = nums.length;
        int result[] = new int [n];
        int leftSumArr[] = new int [n];
        int rightSumArr[] = new int [n];

        for(int i=0; i < n; i++){
            totalSum = nums[i] + totalSum;
        }

        int leftSum = 0;


        for(int i=0; i < n; i++){
            
            leftSumArr[i] = leftSum;
            rightSumArr[i] = totalSum - nums[i] - leftSum;
            leftSum = leftSum + nums[i];
            
        }

        for(int i=0;i<n;i++){
            result[i] = Math.abs(leftSumArr[i] - rightSumArr[i]);

        }
        return result;
    }
}