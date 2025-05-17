class Solution {

    public static int countDigit(int n) {
        if (n == 0)
            return 1;

        int noOfDigits = 0;
        while (n > 0) {
            n /= 10;
            noOfDigits++;
        }
        return noOfDigits;
    }

    public static void main(String[] args) {
        int result = countDigit(235000);
        System.out.println("Number of Digits: " + result);
    }
}