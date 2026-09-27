class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character , Integer> seen = new HashMap<>();

        int length = 0;
        int maxlength = 0;
        int left = 0;
        int right = 0;

        while(right < s.length()){
            char currentChar = s.charAt(right);
            if(seen.containsKey(currentChar)){
                left = Math.max(left , seen.get(currentChar)+1);
            }

            seen.put(currentChar,right);
            right++;

            maxlength = Math.max(right - left ,maxlength);
        }
        return maxlength;
    }
}