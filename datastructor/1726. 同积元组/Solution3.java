class Solution {
    public int tupleSameProduct(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();
        int cntSum=0;
        Integer key = null;
         for(int i = 0; i <nums.length-1;i++){
             for(int j = i+1; j < nums.length;j++){
                int mul = nums[i] * nums[j];
                key = map.get(mul);
                if(key !=null) { //˵���ý�����ǵ�һ�γ��֣�
                    //������ǰ��key����ͬ�����ϳ� key *8 ��Ԫ��
                    cntSum += (key * 8);
                    map.put(mul,key+1);
                }else{//˵���ý����һ�γ��֣���ֵΪ1
                    map.put(mul,1);
                }
             }
         }
         return cntSum;

       
    }
}