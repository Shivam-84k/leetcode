class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        HashSet<Integer> result = new HashSet<>();

        for (int number : nums) {
            result.add(number);
        }

        int maxLength = 0;

        for (int number : result) {

           
            if (!result.contains(number - 1)) {

                int length = 1;
                int current = number;

                while (result.contains(current + 1)) {
                    current++;
                    length++;
                }

                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }
}