class Solution {
    public int totalFruit(int[] fruits) {
        
        int left = 0;
        int right = 0;
        int maxfruit = 0;
        HashMap <Integer,Integer> frequency = new HashMap<>();

        while(right < fruits.length){
            frequency.put(fruits[right],frequency.getOrDefault(fruits[right] , 0 ) +1 ) ;
            
             while (frequency.size() > 2) {
                
                int fruit = fruits[left];
                frequency.put(fruit, frequency.get(fruit) - 1);
                if (frequency.get(fruit) == 0) {
                    frequency.remove(fruit);
                }
                left++;
            }

            if(frequency.size() <= 2){
                maxfruit = Math.max(maxfruit , right - left + 1);
                right++;
            }
            

        }
        return maxfruit;
    }
}