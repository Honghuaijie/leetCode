class Solution1 {
    public int[] avoidFlood(int[] rains) {
        int[] ans = new int[rains.length]; //要返回的数组
       
        Map<Integer,Integer> status = new HashMap(); //记录第n个湖泊被装满是在第m天

        for(int i = 0; i < rains.length; i++){
            if(rains[i] > 0){ //表示这一天第rains[i]个湖泊会下雨
                //先判断这个湖泊的状态
                if(status.get(rains[i]) == null ){  //说明这个湖泊是空的，可以下雨
                    status.put(rains[i],i);
                }else{  //说明这个湖泊是满的，需要先抽干
                    //判断还有没有抽干的机会了
                    int index =-1; //默认没有机会
                    for(int j = status.get(rains[i]); j < i; j++ ){  //判断第rains[i]个湖泊在下雨后的那一天之后还有木有情况
                        if(ans[j] == 0){
                            index = j;
                            break;
                        }
                    }
                    if(index == -1){ //说明没有机会去抽干了
                        return new int[0];
                    }else{ //说明还有机会去抽干(这里的抽干是，抽干之后再装满，所以status中的rains[i]]是不动的)
                        ans[index] = rains[i];
                        status.put(rains[i],i);
                    }
                }
                //如果没有发生洪水则正常记录到ans中
                ans[i] = -1;
            }else{ //表示这一天不会下雨,可以选择一个湖泊进行抽干
                //将这一天保存下来，等找到要抽干的湖泊时再用
                
            }
        }
        //将ans中元素为0的用来，随便抽干几个湖泊
        
        for(int i = 0; i < rains.length; i++){
            if(ans[i] == 0){
                ans[i] =1;
            }
        }
        return ans;
    }
}