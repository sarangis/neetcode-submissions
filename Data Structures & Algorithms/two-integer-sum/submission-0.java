class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> pairMap = new HashMap<>();
        for(int i= 0; i< nums.length; i++){
            int diff = target - nums[i];
            if (pairMap.containsKey(diff)){
                result[1] = i;
                result[0] = pairMap.get(diff);
                break;
            }else{
                pairMap.put(nums[i], i);
            }
        }
        return result;
    }
}
