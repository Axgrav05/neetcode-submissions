class Solution {
    public int[] twoSum(int[] nums, int target) {
        // nums [i] = target - nums[j]
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (!numsMap.containsKey(need)){
                numsMap.put(nums[i], i);
            } else {
                return new int[] {numsMap.get(need), i};
            }
        }
        return new int[] {-1, -1};
    }
}
