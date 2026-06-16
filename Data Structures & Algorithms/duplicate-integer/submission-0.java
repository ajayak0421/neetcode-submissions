class Solution {
    public boolean hasDuplicate(int[] nums) {

        if(nums.length == 0){
            return false;
        }

        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                return true;
            }else{
                map.put(nums[i], 1);
            }
        }
        return false;
    }
}