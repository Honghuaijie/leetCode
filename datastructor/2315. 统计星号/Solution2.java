class Solution {
    public int countAsterisks(String s) {
        /**
        我们先设置一个flag=false表示没有遇到| 之后如果每遇到|就让他取反
        当flag=true的时候不进行取数
         */

         char ch ;
         boolean flag = false;
         int total = 0; //*号的个数
         for(int i = 0; i <s.length();i++){
             ch = s.charAt(i);

             if(ch == '|'){
                flag = !flag;
                continue;
             }
             //当flag=ture是表示在竖线对中，不计入答案
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