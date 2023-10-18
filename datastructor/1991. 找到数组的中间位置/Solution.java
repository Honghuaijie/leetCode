class Solution {
    public int findMiddleIndex(int[] nums) {
        /**
            首先求出数组的总和
            该中间位置满足这样的公式:
                左合+右合+中 = total
                2(左合) + 中= total;
         */
         
         int total=0; //求出数组的总和
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