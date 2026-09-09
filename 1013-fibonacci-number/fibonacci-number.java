class Solution {
    public int fib(int n) {
       if(n == 1){
            return 1;
        }
        else if (n ==0){
            return 0;
        }
        int num1 = 0;
        int num2 = 1;
        int fibonum = 1;
        for(int i=2;i<=n;i++){
            fibonum = num1+num2;
            num1= num2;
            num2 = fibonum;
        }
        return fibonum; 
    }
}