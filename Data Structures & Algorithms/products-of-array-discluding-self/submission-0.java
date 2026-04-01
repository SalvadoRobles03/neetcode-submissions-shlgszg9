class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] result =new int[nums.length];

        int[] prefixProduct= new int[nums.length];
     
        int zeros=0;
        int total=1;
        int totalZero=0;
        for(int i=0; i<nums.length;i++){
            if(nums[i] == 0){
                if(zeros<1){
                    zeros++;
                }else{
                    return result;
                }
            }else{
                total=total*nums[i];
            }

        }

        
        for(int i=0; i<nums.length;i++){
            if(zeros>0 && nums[i]==0){
                result[i]=total;
            }else if(zeros>0 && nums[i]!=0){
                result[i]=0;
            }else{
                result[i]=total/nums[i];
            }
        }


        return result;

        
    }
}  
