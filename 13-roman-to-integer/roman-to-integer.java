class Solution {
    public int romanToInt(String s) {
        int total = 0;
        HashMap<Character,Integer> check = new HashMap<>();

        check.put('I',1);
        check.put('V',5);
        check.put('X',10);
        check.put('L',50);
        check.put('C',100);
        check.put('D',500);
        check.put('M',1000);

        int i = 0;
        while(i < s.length()){
            int currentValue = check.get(s.charAt(i));

            if(i + 1 < s.length()){
                int nextValue = check.get(s.charAt(i+1));

                if(nextValue > currentValue){
                    total += nextValue - currentValue;
                    i+=2;
                    continue;
                }
            }
            total += currentValue;
            i++;
        }
        return total;
    }
}