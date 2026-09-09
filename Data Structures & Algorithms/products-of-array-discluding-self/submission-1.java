class Solution {
    public int[] productExceptSelf(int[] nums) {
        List zeroIndex = new ArrayList<>();
        int prod = 1;
        for(int i= 0; i< nums.length; i++){
            if(nums[i] != 0){
                prod=prod * nums[i];
            }else{
               zeroIndex.add(i);
            }
            
        }
       
        int[] result = new int[nums.length];
        for(int i=0; i< nums.length ; i++){
            if(zeroIndex.size() > 1){
                result[i] = 0;

            }else if(!zeroIndex.isEmpty()){
                if(zeroIndex.contains(i)){
                    result[i] = prod;
                }else{
                    result[i] = 0;
                }
            }else{
                 result[i] = prod/ nums[i];
            }
             
        }
        return result;
    }
}  
