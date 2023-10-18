class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        //第一步：将数组中的数存储到map中，并记录每个数出现的次数
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        //第二步：输出出现次数为1的哪个数
        int ans = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                ans = entry.getKey();
                break;
            }
        }
        return  ans;
    }
}