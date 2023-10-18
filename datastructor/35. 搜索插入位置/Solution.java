class Solution {
    public int searchInsert(int[] nums, int target) {
        /**
        由于是有序数组，直接采用二分查找
            找到了就返回其下标值，没有找到就将其放在left的后面
         */

         int left = 0;
         int right = nums.length-1;
         int mid ;
         if(target < nums[0]) return 0;
         if(target > nums[right]) return nums.length;
         while(left <= right){
             mid = (left + right) /2;
             if(target < nums[mid]){  //小于中间数，应该在左边
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