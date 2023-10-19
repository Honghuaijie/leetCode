class Solution {
    public int tupleSameProduct(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();
        int cntSum=0;
        Integer key = null;
         for(int i = 0; i <nums.length-1;i++){
             for(int j = i+1; j < nums.length;j++){
                int mul = nums[i] * nums[j];
                key = map.get(mul);
                if(key !=null) { //说明该结果不是第一次出现，
                    //可以与前面key个相同结果组合成 key *8 个元组
                    cntSum += (key * 8);
                    map.put(mul,key+1);
                }else{//说明该结果第一次出现，赋值为1
                    map.put(mul,1);
                }
             }
         }
         return cntSum;

       
    }
}