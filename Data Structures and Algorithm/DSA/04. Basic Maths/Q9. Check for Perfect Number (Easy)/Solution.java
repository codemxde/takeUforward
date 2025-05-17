class Solution {

    public static int calculateSumOfProperDivisors(int n) {
        int sum = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                if (i == n / i) {
                    sum += i;
                } else {
                    sum += i + (n / i);
                }
            }
        }
        return sum;
    }

    public static boolean isPerfect(int n) {
        if (n == 1)
            return false;

        int sumOfProperDivisors = calculateSumOfProperDivisors(n);
        return n == sumOfProperDivisors;
    }

    public static void main(String[] args) {
        System.out.println("Is number perfect? " + isPerfect(1));
    }
}