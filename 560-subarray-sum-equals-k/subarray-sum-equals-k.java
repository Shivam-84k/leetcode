class Solution {
    public int subarraySum(int[] nums, int k) {

        int sum = 0;
        int count = 0;

        HashMap<Integer, Integer> summation = new HashMap<>();

        
        summation.put(0, 1);

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            if (summation.containsKey(sum - k)) {
                count += summation.get(sum - k);
            }

            summation.put(sum, summation.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}