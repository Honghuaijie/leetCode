class Solution1 {
    public String longestCommonPrefix(String[] strs) {
        String str = "";
		//两两相比较，最终得出公共的最长前缀
        //假设第一个单词就是最长前缀
        str = strs[0];

        //从下标为1的位置开始遍历strs，依次和str进行比较
        for(int i = 1; i < strs.length;i++){
            int j = 0;
            
            for(;j < strs[i].length() && j < str.length(); j++){
                if(strs[i].charAt(j) !=str.charAt(j)){
                    break;
                }
            }
            str = str.substring(0,j);
            if(str.equals("")){
                return str;
            }
        }
        return str;
    }
}