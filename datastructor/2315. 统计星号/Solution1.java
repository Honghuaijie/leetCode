class Solution {
    public int countAsterisks(String s) {
         char ch ;
         boolean flag = false;
         int total = 0; //*�ŵĸ���
         int i = 0;
         while(i < s.length()){
             ch = s.charAt(i);
             if(ch == '*'){
                 total ++;
                 
             }else if (ch == '|'){ //�������|�Ͷ�λ���ڶ���|�����λ��
                 i = s.indexOf('|',i+1) ;
             }
             i +=1;
         }
         return total;
    }
}