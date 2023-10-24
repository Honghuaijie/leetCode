class Solution1 {
    public int countSeniors(String[] details) {
        int num = 0;
        for(String detail : details){
            //十位数大于6 或者十位数=6 并且个位数不等于0
            if(detail.charAt(11) -'0' > 6 || (detail.charAt(11) -'0' == 6 && detail.charAt(12) -'0' !=0) ){
                num +=1;
            }
        }

        return num;
    }
}