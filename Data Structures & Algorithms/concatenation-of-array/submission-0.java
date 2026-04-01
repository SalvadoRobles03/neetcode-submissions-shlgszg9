class Solution {
    public int[] getConcatenation(int[] nums) {

        int[] ans = new int[nums.length * 2];
        int i=0;
        int j=0;
        while(i<(nums.length * 2)){
            ans[i]=nums[j];
            i++;
            j++;
            if(i==nums.length){
                j=0;
            }
        }
        return ans;
    }
}