class Solution1 {
    public int[] avoidFlood(int[] rains) {
        int[] ans = new int[rains.length]; //Ҫ���ص�����
       
        Map<Integer,Integer> status = new HashMap(); //��¼��n��������װ�����ڵ�m��

        for(int i = 0; i < rains.length; i++){
            if(rains[i] > 0){ //��ʾ��һ���rains[i]������������
                //���ж����������״̬
                if(status.get(rains[i]) == null ){  //˵����������ǿյģ���������
                    status.put(rains[i],i);
                }else{  //˵��������������ģ���Ҫ�ȳ��
                    //�жϻ���û�г�ɵĻ�����
                    int index =-1; //Ĭ��û�л���
                    for(int j = status.get(rains[i]); j < i; j++ ){  //�жϵ�rains[i]����������������һ��֮����ľ�����
                        if(ans[j] == 0){
                            index = j;
                            break;
                        }
                    }
                    if(index == -1){ //˵��û�л���ȥ�����
                        return new int[0];
                    }else{ //˵�����л���ȥ���(����ĳ���ǣ����֮����װ��������status�е�rains[i]]�ǲ�����)
                        ans[index] = rains[i];
                        status.put(rains[i],i);
                    }
                }
                //���û�з�����ˮ��������¼��ans��
                ans[i] = -1;
            }else{ //��ʾ��һ�첻������,����ѡ��һ���������г��
                //����һ�챣�����������ҵ�Ҫ��ɵĺ���ʱ����
                
            }
        }
        //��ans��Ԫ��Ϊ0������������ɼ�������
        
        for(int i = 0; i < rains.length; i++){
            if(ans[i] == 0){
                ans[i] =1;
            }
        }
        return ans;
    }
}