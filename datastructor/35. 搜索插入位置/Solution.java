class Solution {
    public int searchInsert(int[] nums, int target) {
        /**
        �������������飬ֱ�Ӳ��ö��ֲ���
            �ҵ��˾ͷ������±�ֵ��û���ҵ��ͽ������left�ĺ���
         */

         int left = 0;
         int right = nums.length-1;
         int mid ;
         if(target < nums[0]) return 0;
         if(target > nums[right]) return nums.length;
         while(left <= right){
             mid = (left + right) /2;
             if(target < nums[mid]){  //С���м�����Ӧ�������
                right = mid -1;
             }else if(target > nums[mid]){
                 left = mid +1;
             }else{
                 return mid;
             }
         }

        return left;


    }
}