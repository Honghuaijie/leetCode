class Solution {
    public void setZeroes(int[][] matrix) {
		//使用数组的第一行和第一列标记数组中0元素的位置
        //1.首先判断第一行和第一列原本是否有0元素，如果有就记录下来
        int m = matrix.length; //行的个数
        int n = matrix[0].length;  //列的个数
        boolean rowFlag = false;
        boolean lowFlag = false;
        //判断第一行是否有0元素
        for(int i = 0; i<n;i++){
            if(matrix[0][i] == 0){
                rowFlag = true;
                break;
            }
        }
        //判断第一列是否有0元素
        for(int i = 0; i<m; i++){
            if(matrix[i][0] == 0){
                lowFlag = true;
                break;
            }
        }
        //2.遍历数组（从2行的第2列开始遍历),如果遇到元素为0的元素，就将该行的一列该为0，该列的第一行改为0
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }
        //3.再次遍历数组（从2行的第2列开始遍历)，判断该行的第一列或该列的第一行为0，就将该元素清零
        for(int i = 1 ; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        //4.判断是否需要将第一行或第一列清零  
        if(rowFlag){
            for(int i = 0; i < n; i++){
                matrix[0][i] = 0;
            }
        }
        if(lowFlag){
            for(int i = 0; i < m; i++){
                matrix[i][0] = 0;
            }
        }
    }
}