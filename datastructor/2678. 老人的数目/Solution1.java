class Solution1 {
    public int countSeniors(String[] details) {
        int num = 0;
        for(String detail : details){
            //ʮλ������6 ����ʮλ��=6 ���Ҹ�λ��������0
            if(detail.charAt(11) -'0' > 6 || (detail.charAt(11) -'0' == 6 && detail.charAt(12) -'0' !=0) ){
                num +=1;
            }
        }

        return num;
    }
}