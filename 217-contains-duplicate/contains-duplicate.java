class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> freqmap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int current = freqmap.getOrDefault(nums[i], 0);

            if(current >= 1){
                return true;
            }
            freqmap.put(nums[i],current+1);

        }
        return false;


    }
}