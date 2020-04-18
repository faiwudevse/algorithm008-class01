class Solution {
    public int removeDuplicate(int[] nums) {
        // two pointers 
        if (nums.length == 0) return 0;

        int i = 0;
        for(int j = 1; j < nums.length; j++) {
            // check when i's and j's  values are differnt, update the value for index (i+1)
            if (nums[i] != nums[j]) {
                nums[++i] = nums[j];
            }
        }

        return i + 1;
    }
}