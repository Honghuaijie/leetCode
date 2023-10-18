class Solution {
    public int singleNumber(int[] nums) {
        /**
            采用异或的方式 求解  异或的运算是每位相比较，不同为1，相同为0
            异或的特点：1、 0与任何数异或，结果都等于自己本身
                       2、 两个相同的数异或，结果都为0
                       3、 a^b^a = a^a^b = b
         */
        int a =0;
        for(int i = 0; i< nums.length; i++){
            a ^=nums[i];
        }
        return a;
    }
    
}