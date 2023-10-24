class Solution {
    public String oddString(String[] words) {
        /**
        a:97-97
        b:98-97
        z:122-97
         */
        
        //先求出前两个字符串的差值整数的数组
        //情况1： 这两个字符串的差值整数相同，循环后面的字符串找出与他们两个不同的
        //情况2：这两个字符串a,b的差值整数不同，求出第三个字符串c就可以了，
        //  a==c :b    b==c:a
        int[] diff0 = get(words[0]);
        int[] diff1 = get(words[1]);
        String str ="";
        if(Arrays.equals(diff0,diff1)){

            for(int i = 2; i <words.length;i++){
                if(!Arrays.equals(diff0,get(words[i]))){
                    str = words[i];
                    break;
                }
            }
        }else{
            int[] diff2 =get(words[2]);
            if(Arrays.equals(diff0,diff2)){
                str = words[1];
            }else{
                str = words[0];
            }
        }

        return str;
    }

    //求出该数组的差值整数数组
    public int[] get(String word){
        int[] difference = new int[word.length()-1];
        for(int i = 0; i < word.length()-1;i++){
            difference[i] = word.charAt(i+1)-word.charAt(i);
        }

        return difference;
    }
}