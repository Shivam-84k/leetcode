class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()){
            return false;
        }
        HashMap <Character,Integer> check = new HashMap<>();
        
        


        for (char ch : s.toCharArray()) {
            check.put(ch, check.getOrDefault(ch, 0) + 1);
        }

        for (char th : t.toCharArray()) {
            check.put(th, check.getOrDefault(th, 0) -1);
        }

        for(var pair: check.entrySet()){
            if(pair.getValue() !=0 ){
                return false;
            }
        }
        
        
    return true;
    }
}