class Solution1 {
    public String longestCommonPrefix(String[] strs) {
        String str = "";
		//������Ƚϣ����յó��������ǰ׺
        //�����һ�����ʾ����ǰ׺
        str = strs[0];

        //���±�Ϊ1��λ�ÿ�ʼ����strs�����κ�str���бȽ�
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