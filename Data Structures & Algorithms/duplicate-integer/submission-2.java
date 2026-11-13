class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> numCount = new HashMap<>();

        for (Integer num : nums) {
            numCount.put(num, numCount.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> pair : numCount.entrySet()) {
            if (pair.getValue() != 1) {
                return true;
            }
        }

        return false;
    }
}