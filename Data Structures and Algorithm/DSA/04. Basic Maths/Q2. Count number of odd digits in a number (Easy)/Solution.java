class Solution {

    public static int countOddDigit(int n) {
        if (n == 0)
            return 0;

        int noOfOddDigits = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 1)
                noOfOddDigits++;

            n /= 10;
        }
        return noOfOddDigits;
    }

    public static void main(String[] args) {
        System.out.println("Number of odd digits: " + countOddDigit(1432222222));
    }
}