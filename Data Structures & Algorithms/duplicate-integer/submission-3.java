class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> numCount = new HashMap<>();

        for (Integer num : nums) {
            if (numCount.get(num) == null){ 
                numCount.put(num, numCount.getOrDefault(num, 0) + 1);
            } else {
                return true;
            }
        }
        return false;
    }
}