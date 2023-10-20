class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length; //行
        int n = mat[0].length;//列
        int[] arr = new int[m * n];
        int index = 0;
        for(int i = 0; i < n + m -1;i++){
            if(i % 2 == 0){ //向上走的情况  x--,y++
                //对角线上半部分的起始位置都是[i,0]
                //对角线下半部分的起始位置 都是[m-1,i-m+1]  (m-1表示最后一行)
                int x = i < m? i: m-1 ;
                int y = i < m? 0 : i-m+1;
                while(x >=0 && y < n){
                    arr[index++] = mat[x][y];
                    x--;
                    y++;
                }
            }else{ //向下走的情况  x++,y--;
                //对角线上半部分的起始位置都是[0,i]
                //对角线下半部分的起始位置 都是[i-n-1,n-1]  (n-1表示最后一列)
                int x = i < n? 0 : i-n+1 ;
                int y = i < n? i : n-1;
                while(y >=0 && y < n){
                    arr[index++] = mat[x][y];
                    x++;
                    y--;
                }
            }
        }
        return arr;
    }
}