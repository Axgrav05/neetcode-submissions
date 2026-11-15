class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (a, b) -> Integer.compare(b[1], a[1])
        );

        for (Map.Entry<Integer, Integer> pair : freqMap.entrySet()) {
            maxHeap.add(new int[] {pair.getKey(), pair.getValue()});
        }

        int[] result = new int[k];
        int counter = 0;

        while (counter != k) {
            int[] top = maxHeap.poll();
            result[counter] = top[0];
            counter++;
        }

        return result;
    }
}
