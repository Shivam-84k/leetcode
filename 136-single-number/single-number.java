class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> single = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            single.put(nums[i],single.getOrDefault(nums[i],0)+1);
        }

        for(int check:single.keySet()){
            if(single.get(check) ==1){
                return check;
            }
        }
        return -1;
    }
}