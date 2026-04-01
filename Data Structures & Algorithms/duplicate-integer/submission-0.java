class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();
        Boolean duplicated=false;

        for (int num: nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
                duplicated = true;
            }
        }

        return duplicated;

        
    }
}