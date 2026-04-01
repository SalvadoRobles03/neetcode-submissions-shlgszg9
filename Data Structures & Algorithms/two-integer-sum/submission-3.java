class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2];
        int other;

        for(int i =0; i <nums.length;i++){
            other= target - nums[i];
            if(map.containsKey(other)){
                int key = map.get(other);
                result[0]=key<i ? key:i;
                result[1]=key>i ? key:i;
                return result;
            }else{
                map.put(nums[i],i);
            }
        }
  

        return result;




        
    }
}
