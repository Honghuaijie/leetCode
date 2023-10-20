class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length; //��
        int n = mat[0].length;//��
        int[] arr = new int[m * n];
        int index = 0;
        for(int i = 0; i < n + m -1;i++){
            if(i % 2 == 0){ //�����ߵ����  x--,y++
                //�Խ����ϰ벿�ֵ���ʼλ�ö���[i,0]
                //�Խ����°벿�ֵ���ʼλ�� ����[m-1,i-m+1]  (m-1��ʾ���һ��)
                int x = i < m? i: m-1 ;
                int y = i < m? 0 : i-m+1;
                while(x >=0 && y < n){
                    arr[index++] = mat[x][y];
                    x--;
                    y++;
                }
            }else{ //�����ߵ����  x++,y--;
                //�Խ����ϰ벿�ֵ���ʼλ�ö���[0,i]
                //�Խ����°벿�ֵ���ʼλ�� ����[i-n-1,n-1]  (n-1��ʾ���һ��)
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