class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        //��һ�����������е����洢��map�У�����¼ÿ�������ֵĴ���
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        //�ڶ�����������ִ���Ϊ1���ĸ���
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