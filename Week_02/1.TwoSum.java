class Solution {
    /*
    time complexity: O(n)
    space complexity: O(n)
    thought process: create hash mape to store nums's value and index as key and value
    iterate though nums if targe - num[i] exist in the hashmpa return the targe - num[i] value and the current position
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        
        int[] ret = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(target - nums[i])) {
                ret[0] = hm.get(target - nums[i]);
                ret[1] = i;
            } else {
                hm.put(nums[i], i);
            }
        }
        
        return ret;
    }
}