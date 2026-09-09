class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int revnum = 0;
        if(x<0){
            return false;
        }
        else{
            while(temp != 0){
                int digit = temp % 10;
                temp = temp / 10;
                
                // if(revnum > Integer.MAX_VALUE / 10 || revnum < Integer.MIN_VALUE){
                //     return false;
                // }

                revnum = revnum *10 + digit;
            }

            if (revnum == x){
                return true;
            }

        }
        return false;
    }
}