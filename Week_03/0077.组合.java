class Solution {
    List<List<Integer>> result;
    List<Integer> combo;
    int n;
    public List<List<Integer>> combine(int n, int k) {
        result = new ArrayList();
        combo = new ArrayList();
        this.n = n;
        backtracking(1, k);
    }

    public void backtracking(int start, int k) {
        if (k == 0) {
            result.add(new ArrayList(combo));
            return;
        }

        for(int i = start; i <= n - k + 1; i++) {
            combo.add(i);
            backtracking(i + 1, k - 1);
            combo.remove(combo.size() - 1);
        }
    }
}