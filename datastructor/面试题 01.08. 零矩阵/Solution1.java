class Solution {
    public void setZeroes(int[][] matrix) {
        List<int[]> lists = new ArrayList<>(); //��¼Ԫ��Ϊ0���к���
        //1.�ȼ�¼Ԫ��Ϊ0���к���
        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j< matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    lists.add(new int[]{i,j});
                }
            }
        }
        //2.�������ڵ�����������
        for(int[] a : lists){
            int row = a[0]; //���±�
            int low = a[1]; //���±�
            //�����
            for(int i = 0; i <matrix[row].length; i++){ //�������е���
                matrix[row][i] = 0;
            }
            //�����
            for(int i = 0; i < matrix.length; i++){
                matrix[i][low] = 0;
            }
        }
    }
}