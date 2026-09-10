class Solution {
    public int pivotIndex(int[] nums) {
       int n= nums.length;
       int totalSum = 0;

       for(int i = 0; i<n; i++){
        totalSum = totalSum + nums[i];
       } 

       int leftSum = 0;

       for(int i = 0 ; i< n ;i++){

        if(totalSum - nums[i] - leftSum == leftSum){
            return i;
        }
        leftSum = leftSum + nums[i];
        
       }
       return -1;
    }
}