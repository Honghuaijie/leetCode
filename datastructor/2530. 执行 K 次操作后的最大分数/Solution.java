class Solution {
    public long maxKelements(int[] nums, int k) {
        /**
            解题思路：
                先将数组转换为大顶堆
                然后循环k次，每次取出堆顶，然后将堆顶替换为ceil(nums[i] / 3)
                然后再将数组转换为大顶堆
            解题步骤：
                1.定义一个方法adjustHeap 传入数组和下标i
                    该方法的作用就是将以i为根节点的子树转换为大顶堆
                2.将此顺序存储二叉树数组从下往下依次转换为大顶堆，实现数组转换为大顶堆
                3.循环k次 循环三个步骤
                    3.1将以0为根节点的子树转换为大顶堆
                    3.2取出0位置上的元素(数组中最大的元素) 加到sum中
                    3.2将0位置上的元素替换为ceil(nums[i] / 3)
                
                   
         */

         //先将数组转换成大顶堆
         for(int i = nums.length/2-1; i >=0; i--){
             adjustHeap(nums,i);
         }

         
        long sum = 0;
         //循环k 次
         for(int i = 0 ; i < k; i++){
             //组成大顶堆
            adjustHeap(nums,0);
             //取出首个元素
            sum += nums[0];
             //更改首个元素
             nums[0] = (int)Math.ceil(nums[0]/3.0);
         }
         return sum;
    }

    

    /**
       功能，将传入的以i为根节点的子树，转换为大顶堆
     */
     public  void adjustHeap(int[] arr,int i){
             //保存根节点的值
             int temp = arr[i];
             
             //j的初始值为i的左子节点,此后就是为j的左子节点
             for(int j = 2 * i +1; j < arr.length; j = 2*j +1){
                 //找出子节点中最大的节点
                 //如果右子节点存在，并大于左子节点，j就指向右子节点
                 if(j + 1 < arr.length && arr[j+1] > arr[j]){
                     j++;
                 }
                 //判断j和temp位置上的元素哪个大
                 if(temp < arr[j]){
                     arr[i] = arr[j]; //将大的节点往上移
                     i = j; //i移动到下一个子树根节点
                 }else{
                     break;
                 }
             }
             arr[i] = temp;
     }
    

    
}