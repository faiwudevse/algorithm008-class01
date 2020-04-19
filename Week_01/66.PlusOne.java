class Solution {
    /*
    time complexity: O(N)
    space complexity: O(1) or O(N) if it need to create a new array
    */
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        for (int index = n - 1; index >= 0; index--) {
            if (digits[index] == 9) {
                digits[index] = 0;
            } else {
                digits[index] += 1;
                return digits;
            }
        }

        digits = new int[n + 1];
        digits[0] = 1;
        return digits;
    }
}