class Solution {
    public int subarraySum(int[] nums, int k) {

        ArrayList<Integer> prefixSum = new ArrayList<Integer>();
        int sums=0;
        int size=nums.length;
        int total=0;

        for(int num:nums){
            if(num==k){
                sums++;
            }
            total=total+num;
            prefixSum.add(total);
        }


        if(sums==size && k!= 0){
            return sums;
        }

        int amount=1;

        while(amount!=size){

            int left=0;
            int right=left+amount;
            while(right<size){
                if((prefixSum.get(right)- (left>0? prefixSum.get(left-1):0)) == k){
                    sums++;
                }
                left++;
                right++;
            }

            amount++;
        }

        return sums;

        
    }
}