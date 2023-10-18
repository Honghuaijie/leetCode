class Solution {
    public long maxKelements(int[] nums, int k) {
        /**
            ����˼·��
                �Ƚ�����ת��Ϊ�󶥶�
                Ȼ��ѭ��k�Σ�ÿ��ȡ���Ѷ���Ȼ�󽫶Ѷ��滻Ϊceil(nums[i] / 3)
                Ȼ���ٽ�����ת��Ϊ�󶥶�
            ���ⲽ�裺
                1.����һ������adjustHeap ����������±�i
                    �÷��������þ��ǽ���iΪ���ڵ������ת��Ϊ�󶥶�
                2.����˳��洢���������������������ת��Ϊ�󶥶ѣ�ʵ������ת��Ϊ�󶥶�
                3.ѭ��k�� ѭ����������
                    3.1����0Ϊ���ڵ������ת��Ϊ�󶥶�
                    3.2ȡ��0λ���ϵ�Ԫ��(����������Ԫ��) �ӵ�sum��
                    3.2��0λ���ϵ�Ԫ���滻Ϊceil(nums[i] / 3)
                
                   
         */

         //�Ƚ�����ת���ɴ󶥶�
         for(int i = nums.length/2-1; i >=0; i--){
             adjustHeap(nums,i);
         }

         
        long sum = 0;
         //ѭ��k ��
         for(int i = 0 ; i < k; i++){
             //��ɴ󶥶�
            adjustHeap(nums,0);
             //ȡ���׸�Ԫ��
            sum += nums[0];
             //�����׸�Ԫ��
             nums[0] = (int)Math.ceil(nums[0]/3.0);
         }
         return sum;
    }

    

    /**
       ���ܣ����������iΪ���ڵ��������ת��Ϊ�󶥶�
     */
     public  void adjustHeap(int[] arr,int i){
             //������ڵ��ֵ
             int temp = arr[i];
             
             //j�ĳ�ʼֵΪi�����ӽڵ�,�˺����Ϊj�����ӽڵ�
             for(int j = 2 * i +1; j < arr.length; j = 2*j +1){
                 //�ҳ��ӽڵ������Ľڵ�
                 //������ӽڵ���ڣ����������ӽڵ㣬j��ָ�����ӽڵ�
                 if(j + 1 < arr.length && arr[j+1] > arr[j]){
                     j++;
                 }
                 //�ж�j��tempλ���ϵ�Ԫ���ĸ���
                 if(temp < arr[j]){
                     arr[i] = arr[j]; //����Ľڵ�������
                     i = j; //i�ƶ�����һ���������ڵ�
                 }else{
                     break;
                 }
             }
             arr[i] = temp;
     }
    

    
}