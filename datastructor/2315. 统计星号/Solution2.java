class Solution {
    public int countAsterisks(String s) {
        /**
        ����������һ��flag=false��ʾû������| ֮�����ÿ����|������ȡ��
        ��flag=true��ʱ�򲻽���ȡ��
         */

         char ch ;
         boolean flag = false;
         int total = 0; //*�ŵĸ���
         for(int i = 0; i <s.length();i++){
             ch = s.charAt(i);

             if(ch == '|'){
                flag = !flag;
                continue;
             }
             //��flag=ture�Ǳ�ʾ�����߶��У��������
             if(flag == true){
                 continue;
             }
             if(ch == '*'){
                 total +=1;
             }  
         }
         return total;
    }
}