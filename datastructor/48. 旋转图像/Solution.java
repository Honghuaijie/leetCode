class Solution {
    public void rotate(int[][] matrix) {
        //水平翻转
        for(int i = 0; i < matrix.length/2;i++){
            //交换列
            for(int j = 0; j < matrix[i].length;j++){
                matrix[i][j] = matrix[i][j]+matrix[matrix.length-1-i][j];
                matrix[matrix.length-1-i][j] = matrix[i][j]-matrix[matrix.length-1-i][j];
                matrix[i][j]=matrix[i][j]-matrix[matrix.length-1-i][j];
            }
        }
        
		//对角线两边元素交换
        for(int i =0 ;i <matrix.length;i++){
            //arr[i][j] <> arr[j][i];
            for(int j = 0; j < i;j++){
                matrix[i][j] = matrix[i][j] + matrix[j][i];
                matrix[j][i] = matrix[i][j] - matrix[j][i];
                matrix[i][j] = matrix[i][j] - matrix[j][i];
            }
        }
    }
}