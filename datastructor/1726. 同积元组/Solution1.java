class Solution {
    public int tupleSameProduct(int[] nums) {
        /**
        思路：
            由于他并不需要你输出各个元祖，只需要你统计次数，我们可以使用map来记录数组中
            各元素相乘所得结果出现的次数，出现两次，就代表，有两组相乘的结果是相等 
            当我们得出a*b=c*d时，我们就可以得出他们一定可以组合成8个元组
            
            如果我们得出，有四组数乘积都是一样的，它们两两组合可以组成4*3/2=6组
            而每一组一定可以组成8个元组，所以一共有48个元组
            由此我们得到公式：cnt(a*b) 表示乘积的个数
                cnt(a*b) * (cnt(a*b)-1) /2 * 8 = 可以组合成的元组的个数
                cnt(a*b) * (cnt(a*b)-1) *4
        解题步骤：
            1.利用哈希表计算出数组中所有数组相乘的结果的个数
            2.遍历哈希表，求出可以组成的元组的个数
         */

        Map<Integer,Integer> map = new HashMap<>();
         for(int i = 0; i <nums.length-1;i++){
             for(int j = i+1; j < nums.length;j++){
                 //map.getOrdefault(i*j,0)如果存在就返回其个数，如果不存在，就赋值为0
                 map.put(nums[i] * nums[j],map.getOrDefault(nums[i] * nums[j],0)+1);
             }
         }

        //2.遍历哈希表
        int cntSum=0;
        for(Integer cnt:map.values()){
            cntSum += cnt * (cnt-1) * 4;
        }
        return cntSum;
    }
}