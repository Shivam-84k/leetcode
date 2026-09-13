class Solution {
    public void sortColors(int[] nums) {
        
        int zeroIndex = 0;
        int currentIndex = 0;
        int twoIndex = nums.length-1;

        while(currentIndex <= twoIndex){

            if(nums[currentIndex] == 0){
                int temp = nums[currentIndex];
                nums[currentIndex++] = nums[zeroIndex];
                nums[zeroIndex++] = temp;
                
            }

            else if(nums[currentIndex] == 2){
                int temp = nums[currentIndex];
                nums[currentIndex] = nums[twoIndex];
                nums[twoIndex] = temp;
                twoIndex--;
            }

            else{
                currentIndex++;
            }
        }
        
    }
}