class Solution {
    List<List<Integer>> result;
    List<Integer> combo;
    int[] nums;
    boolean[] used;
    public List<List<Integer>> permute(int[] nums) {
        result = new ArrayList();
        combo = new ArrayList();
        this.nums = nums;
        this.used = new boolean[nums.length];
        backtracking();
        return result;
    }

    private void backtracking() {
        if (combo.size() == nums.length) {
            result.add(new ArrayList(combo));
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            combo.add(nums[i]);
            used[i] = true;
            backtracking();
            used[i] = false;
            combo.remove(combo.size() - 1);
        }

    }
}