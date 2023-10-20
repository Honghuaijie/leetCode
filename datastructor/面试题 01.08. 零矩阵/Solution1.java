class Solution {
    public void setZeroes(int[][] matrix) {
        List<int[]> lists = new ArrayList<>(); //记录元素为0的行和列
        //1.先记录元素为0的行和列
        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j< matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    lists.add(new int[]{i,j});
                }
            }
        }
        //2.则将其所在的行与列清零
        for(int[] a : lists){
            int row = a[0]; //行下标
            int low = a[1]; //列下标
            //清空行
            for(int i = 0; i <matrix[row].length; i++){ //遍历该行的列
                matrix[row][i] = 0;
            }
            //清空列
            for(int i = 0; i < matrix.length; i++){
                matrix[i][low] = 0;
            }
        }
    }
}