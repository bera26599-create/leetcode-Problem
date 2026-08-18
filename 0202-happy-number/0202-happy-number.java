class Solution {
    public boolean isHappy(int n) {
        int d, sum = 0;
        while (n != 1 && n != 4) {
            while (n > 0) {
                d = n % 10;
                sum = sum + d * d;
                n = n / 10;
            }
            n = sum;
            sum = 0;
        }
        return n == 1;
    }
}