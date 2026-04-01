class Solution {
    public int pivotIndex(int[] nums) {

        int total=0;
        for(int i =0;i<nums.length;i++){
            total=total+nums[i];
        }

        int leftSum=0;
        int rightSum=0;
        for(int pivot =0;pivot<nums.length;pivot++){
            rightSum=total-leftSum-nums[pivot];
            if(leftSum==rightSum){
                return pivot;
            }
            leftSum=leftSum+nums[pivot];
        }




        return -1;
    }
}