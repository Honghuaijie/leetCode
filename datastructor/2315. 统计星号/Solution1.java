class Solution {
    public int countAsterisks(String s) {
         char ch ;
         boolean flag = false;
         int total = 0; //*号的个数
         int i = 0;
         while(i < s.length()){
             ch = s.charAt(i);
             if(ch == '*'){
                 total ++;
                 
             }else if (ch == '|'){ //如果遇到|就定位到第二个|坐标的位置
                 i = s.indexOf('|',i+1) ;
             }
             i +=1;
         }
         return total;
    }
}