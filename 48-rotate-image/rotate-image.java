class Solution {
    public void rotate(int[][] matrix) {
        int colLength = matrix.length;
        int rowLength = matrix[0].length;

        int answer[][] = new int [colLength][rowLength];

        for(int i=0 ; i < colLength ; i++){

            for(int j = 0; j < rowLength ; j++){
                answer[j][colLength -1 - i] = matrix[i] [j];
            }
        }
        for(int i=0 ; i < colLength ; i++){

            for(int j = 0; j < rowLength ; j++){
                matrix[i][j] = answer[i] [j];
            }
        }
    }
}