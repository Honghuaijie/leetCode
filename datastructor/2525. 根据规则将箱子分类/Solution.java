class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        
		//需要将结果转换为long类型
        long vol = (long)length *width * height;

        if(length >= 10000 || width >= 10000 || height >= 10000 || vol >= 1000000000){
            if(mass >= 100){
                return "Both";
            }else{
                return "Bulky";
            }
        }else{
            if(mass >= 100){
                return "Heavy";
            }else{
                return "Neither";
            }
        }

        
    }
}