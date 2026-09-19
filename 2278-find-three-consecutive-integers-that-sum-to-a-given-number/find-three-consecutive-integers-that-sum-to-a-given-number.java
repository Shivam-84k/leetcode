class Solution {
    public long[] sumOfThree(long num) {
        long answer[] = new long[3];
        long x = num / 3;
        int i= 0;
        if( x-1 + x + x+1 == num){
            answer[i++] = x-1;
            answer[i++] = x;
            answer[i] = x+1;
        }

        if(i == 0){
            return new long[]{};
        }
        return answer;
    }
}