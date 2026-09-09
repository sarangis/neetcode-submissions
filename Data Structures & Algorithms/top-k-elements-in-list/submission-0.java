class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> frequencyMap = new HashMap<>();
        for(int num: nums){
            frequencyMap.merge(num, 1, Integer::sum);
        }
        // index = frequency, value = list of numbers with that frequency
        List<Integer>[] bucket = new List[nums.length + 1];
        for (Map.Entry<Integer, Integer> e : frequencyMap.entrySet()) {
            int freq = e.getValue();
            bucket[freq] = (bucket[freq] == null) ? new ArrayList<>() : bucket[freq];
            bucket[freq].add(e.getKey());
        }

        int[] result = new int[k];
        int idx = 0;
        for (int i = bucket.length - 1; i >= 0 && idx < k; i--) {
            if (bucket[i] != null) {
                for (int num : bucket[i]) {
                    if (idx == k) break;
                    result[idx++] = num;
                }
            }
        }
        return result;
    }
}
