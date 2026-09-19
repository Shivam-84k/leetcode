class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        
        long ways = 0;
        

        if(cost1 > total && cost2 > total){
            return 1;
        }
    
        for(int i = 0; i<= total / cost1 ; i++){

            int remaining = total - (cost1* i);
            
            ways +=  (remaining / cost2) +1;
        }

        return ways;
    }
}