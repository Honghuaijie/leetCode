class Solution {
    public int[][] merge(int[][] intervals) {
        //两个区间重叠的特征就是 starts[1]>end[0]
        //如何合并两个区间: 比较下标为1的元素，元素大的作为右区间

        //使二维数组的第一个元素有序
        Arrays.sort(intervals,(a,b) -> a[0]- b[0]);

        List<int[]> lists = new ArrayList<>();
       
        for(int i = 0; i < intervals.length; i++){
            int left = intervals[i][0]; //取出当前区间的左元素
            int right = intervals[i][1]; //取出当前区间的右元素
             //什么时候需要往list中添加新元素，
            //1.当lists为空的时候
            //2.当前区间与lists中最后一个区间不重叠的时候 [1] < [0]
            if(lists.size()== 0 || lists.get(lists.size()-1)[1] < left){
                lists.add(new int[] {left,right});
            }else{ //区间重叠了修改lists的最后一个元素
                lists.get(lists.size()-1)[1] = Math.max(lists.get(lists.size()-1)[1],right);
            }
        }
        return lists.toArray(new int[lists.size()][]);
    }
}