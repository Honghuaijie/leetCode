class Solution {
    public int[][] merge(int[][] intervals) {
        //���������ص����������� starts[1]>end[0]
        //��κϲ���������: �Ƚ��±�Ϊ1��Ԫ�أ�Ԫ�ش����Ϊ������

        //ʹ��ά����ĵ�һ��Ԫ������
        Arrays.sort(intervals,(a,b) -> a[0]- b[0]);

        List<int[]> lists = new ArrayList<>();
       
        for(int i = 0; i < intervals.length; i++){
            int left = intervals[i][0]; //ȡ����ǰ�������Ԫ��
            int right = intervals[i][1]; //ȡ����ǰ�������Ԫ��
             //ʲôʱ����Ҫ��list�������Ԫ�أ�
            //1.��listsΪ�յ�ʱ��
            //2.��ǰ������lists�����һ�����䲻�ص���ʱ�� [1] < [0]
            if(lists.size()== 0 || lists.get(lists.size()-1)[1] < left){
                lists.add(new int[] {left,right});
            }else{ //�����ص����޸�lists�����һ��Ԫ��
                lists.get(lists.size()-1)[1] = Math.max(lists.get(lists.size()-1)[1],right);
            }
        }
        return lists.toArray(new int[lists.size()][]);
    }
}