class Solution {
    public int firstUniqChar(String s) {

    HashMap<Character, Integer> check = new HashMap<>();
    
    for (char ch : s.toCharArray()) {
        check.put(ch, check.getOrDefault(ch, 0) + 1);
    }
    
    for(int i=0;i<s.length();i++){
        if (check.get(s.charAt(i)) == 1) {
            return i;
        }
    }
    return -1;
    }
}