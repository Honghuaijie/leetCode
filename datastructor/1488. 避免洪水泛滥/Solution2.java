class Solution {
    public int[] avoidFlood(int[] rains) {
        int[] ans = new int[rains.length];
        TreeSet<Integer> st = new TreeSet<>(); //�������������
        Map<Integer,Integer> map = new HashMap<>(); //���������n�������ڵ�m������
        Arrays.fill(ans,1); //������������Ԫ����1�����
        for(int i = 0; i < rains.length; i++){
            //�жϵ�i���Ƿ�����
            if(rains[i] > 0){
                ans[i]  = -1;
                //�ж���������Ƿ��Ѿ���װ����
                if( map.containsKey(rains[i])){
                    //�Ѿ���װ����
                    //�ҳ��������������������ĵ�һ�������ǵڼ���
                    Integer day = st.ceiling(map.get(rains[i]));
                    if(day !=null){
                        //˵���ú��������������
                        ans[day] = rains[i];
                        st.remove(day); //ɾ��������죨��Ϊ��������Լ����������ˮ�ˣ�
                    }else{
                        //˵��û�л������ˣ����ܻᷢ����ˮ
                        return new int[0];
                    }
                }
                //������װ������û��װ��������Ҫ��ӻ��޸ı�װ��������
                    map.put(rains[i],i);
                
            
            }else{
                //�����죬������ts��
                st.add(i);
            }
        }

        return ans;
    }   
}