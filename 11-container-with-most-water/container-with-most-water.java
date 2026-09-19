class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxWater = 0;

        while(left < right){
            int leftHeight = height[left];
            int rightHeight = height[right];

            int currentWater = (right - left) * Math.min(leftHeight,rightHeight);

            if(maxWater < currentWater){
                maxWater = currentWater;
            }            

        //    if (leftHeight < rightHeight) {
        //         while (left < right && height[left] <= leftHeight) {
        //             left++;
        //         }
        //     } else {
        //         while (left < right && height[right] <= rightHeight) {
        //             right--;
        //         }
        //     }    

        if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        } 
        return maxWater;
    }
}