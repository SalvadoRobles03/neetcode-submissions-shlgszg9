class Solution {
    public int removeDuplicates(int[] nums) {

        int n = nums.length;
        int p =0;
        int v =0;

        while(v<n){
            nums[p]=nums[v];
            while(v<n && nums[p]==nums[v]){
                v++;
            }
            p++;
        }

        return p;
        
    }
}