class Solution {
    public int singleNumber(int[] nums) {
        /**
            �������ķ�ʽ ���  ����������ÿλ��Ƚϣ���ͬΪ1����ͬΪ0
            �����ص㣺1�� 0���κ�����򣬽���������Լ�����
                       2�� ������ͬ������򣬽����Ϊ0
                       3�� a^b^a = a^a^b = b
         */
        int a =0;
        for(int i = 0; i< nums.length; i++){
            a ^=nums[i];
        }
        return a;
    }
    
}