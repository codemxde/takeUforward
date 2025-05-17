class Solution {
    public static int reverseNumber(int n) {
        if (n / 10 == 0)
            return n;

        int reversed = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            n /= 10;
            reversed *= 10;
            reversed += lastDigit;
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println(reverseNumber(132442));
    }
}