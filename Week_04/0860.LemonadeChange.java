/*
time complexity: O(n)
space complexity: O(1)
thought process: counte the number $5 and $10
if customer pays $5 five++
if customer pays $10 ten++; five--;
if cusstomer pays $20 ten--; five--; or five-= 3;
*/
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;

        for(int i : bills) {
            if (i == 5) five++;
            else if (i == 10) {five--; ten++;}
            else if (ten > 0) {ten--; five--;}
            else five -= 3;
            if (five < 0) return false;
        }

        return true;
    }
}