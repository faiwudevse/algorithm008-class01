class Solution {
    List<List<Integer>> result;
    List<Integer> combo;
    int[] nums;
    boolean[] used;
    
    public List<List<Integer>> permuteUnique(int[] nums) {
        result = new ArrayList();
        combo = new ArrayList();
        this.nums = nums;
        Arrays.sort(nums);
        used = new boolean[nums.length];
        backtracking();

        return result;
    }

    private void backtracking() {
        if (combo.size == nums.length) {
            result.add(new ArrayList(combo));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            if (i > 0 && nums[i] == nums[i - 1] && ! used[i - 1]) continue;

            combo.add(nums[i]);
            used[i] = true;
            backtracking();
            used[i] = false;
            combo.remove(combo.size() - 1);
        }
    }
}