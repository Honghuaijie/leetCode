class Solution2 {
    public String longestCommonPrefix(String[] strs) {
		//一列一列的进行比较，知道发现某一列上的元素有一个与其他的不相同
        String str = "";

        for(int i = 0; i < strs[0].length();i++){ //遍历第一行的列
            int j ;
            char ch = strs[0].charAt(i); //取出第1行的第i列的字符
            for(j = 1; j < strs.length;j++){ //遍历行
                //如果这一行的列数等于i，说明这一行已经遍历完了，直接退出
                //如果这一行的第i列字符串不等于ch，就直接退出
                if( i == strs[j].length() ||ch != strs[j].charAt(i)){
                    break;
                }
            }
            if(j == strs.length){ //说明第i列的元素都相同
                str +=ch;
            }else{
                break;
            }
        }
        return str;
    }
}