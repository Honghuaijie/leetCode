class Solution {
    public String oddString(String[] words) {
        /**
        a:97-97
        b:98-97
        z:122-97
         */
        
        //�����ǰ�����ַ����Ĳ�ֵ����������
        //���1�� �������ַ����Ĳ�ֵ������ͬ��ѭ��������ַ����ҳ�������������ͬ��
        //���2���������ַ���a,b�Ĳ�ֵ������ͬ������������ַ���c�Ϳ����ˣ�
        //  a==c :b    b==c:a
        int[] diff0 = get(words[0]);
        int[] diff1 = get(words[1]);
        String str ="";
        if(Arrays.equals(diff0,diff1)){

            for(int i = 2; i <words.length;i++){
                if(!Arrays.equals(diff0,get(words[i]))){
                    str = words[i];
                    break;
                }
            }
        }else{
            int[] diff2 =get(words[2]);
            if(Arrays.equals(diff0,diff2)){
                str = words[1];
            }else{
                str = words[0];
            }
        }

        return str;
    }

    //���������Ĳ�ֵ��������
    public int[] get(String word){
        int[] difference = new int[word.length()-1];
        for(int i = 0; i < word.length()-1;i++){
            difference[i] = word.charAt(i+1)-word.charAt(i);
        }

        return difference;
    }
}