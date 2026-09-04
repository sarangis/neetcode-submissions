class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> dupCountSet = new HashSet<>();
        
        for(Integer num: nums){
            if(!dupCountSet.add(num)){
               return true;
            }
        }
        return false;
    }
}