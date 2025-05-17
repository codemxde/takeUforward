class Solution {

    public static int reverseNumber(int number) {
        if (number / 10 == 0)
            return number;

        int reverse = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            number /= 10;

            reverse *= 10;
            reverse += lastDigit;
        }
        return reverse;
    }

    public static boolean isPalindrome(int n) {
        return n == reverseNumber(n);
    }

    public static void main(String[] args) {
        System.out.println("Is the number a palindrome? " + isPalindrome(121));
    }
}