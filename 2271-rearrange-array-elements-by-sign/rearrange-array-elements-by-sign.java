class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n= nums.length;
        int answer[] = new int[n];
        int j= 1;
        int k= 0;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                answer[j] = nums[i];
                j+=2;
            }
            else{
                answer[k] = nums[i];
                k+=2;
            }
        }
        return answer;
    }
}