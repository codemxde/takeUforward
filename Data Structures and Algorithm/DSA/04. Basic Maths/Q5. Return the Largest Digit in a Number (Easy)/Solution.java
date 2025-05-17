class Solution {
    public static int largestDigit(int n) {
        if (n / 10 == 0)
            return n;

        int max = -1;
        while (n > 0) {
            int lastDigit = n % 10;
            if (lastDigit > max)
                max = lastDigit;
            n /= 10;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Largest Digit: " + largestDigit(99));
    }
}