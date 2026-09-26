class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        int maxcount = 0; 
        int left = 0;

        for (int i = 0; i < s.length(); i++) {
            
            if (isVowel(s.charAt(i))) {
                count++;
            }

           
            if (i - left + 1 > k) {
                
                if (isVowel(s.charAt(left))) {
                    count--;
                }
                left++;
            }

           
            if (i - left + 1 == k) {
                maxcount = Math.max(count, maxcount);
            }
        }
        
        return maxcount;
    }

    
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
