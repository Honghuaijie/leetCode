class Solution {
    public int findMiddleIndex(int[] nums) {
        /**
            �������������ܺ�
            ���м�λ�����������Ĺ�ʽ:
                ���+�Һ�+�� = total
                2(���) + ��= total;
         */
         
         int total=0; //���������ܺ�
         for(int i : nums){
             total +=i;
         }

        int leftSum = 0;
        for(int i = 0; i < nums.length;i++){
            if(2*leftSum + nums[i] == total ){
                return i;
            }
            leftSum +=nums[i];
        }
        return -1;
    }
}