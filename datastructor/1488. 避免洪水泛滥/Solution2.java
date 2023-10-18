class Solution {
    public int[] avoidFlood(int[] rains) {
        int[] ans = new int[rains.length];
        TreeSet<Integer> st = new TreeSet<>(); //用来保存晴天的
        Map<Integer,Integer> map = new HashMap<>(); //用来保存第n个湖泊在第m天下雨
        Arrays.fill(ans,1); //将数组中是有元素用1来填充
        for(int i = 0; i < rains.length; i++){
            //判断第i天是否下雨
            if(rains[i] > 0){
                ans[i]  = -1;
                //判断这个湖泊是否已经被装满了
                if( map.containsKey(rains[i])){
                    //已经被装满了
                    //找出这个湖泊在下雨后遇到的第一个晴天是第几天
                    Integer day = st.ceiling(map.get(rains[i]));
                    if(day !=null){
                        //说明该湖泊下雨后有晴天
                        ans[day] = rains[i];
                        st.remove(day); //删除这个晴天（因为这个晴天以及被用来抽干水了）
                    }else{
                        //说明没有机会抽干了，可能会发生洪水
                        return new int[0];
                    }
                }
                //不管是装满还是没有装满，都需要添加或修改被装满的日期
                    map.put(rains[i],i);
                
            
            }else{
                //是晴天，保存在ts中
                st.add(i);
            }
        }

        return ans;
    }   
}