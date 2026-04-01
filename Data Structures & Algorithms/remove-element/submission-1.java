class Solution {
    public int removeElement(int[] nums, int val) {
        
        int p=0;
        int v=0;

        for(int i =0; i<=nums.length && v<nums.length;i++){
                nums[p]=nums[v];
                if(i!=p){
                    p++;
                    v++;
                }
                while(v<nums.length){
                    if(nums[v]==val){
                        v++;
                }else{
                    break;
                }
            
            }

        }


        return p;
    }
}