class Solution {

    public static int countNoOfDigits(int number) {
        if (number / 10 == 0)
            return 1;

        int noOfDigits = 0;
        while (number > 0) {
            noOfDigits++;
            number /= 10;
        }
        return noOfDigits;
    }

    public static boolean isArmstrong(int n) {
        int duplicateN = n;
        int noOfDigits = countNoOfDigits(n);
        int calculatedSum = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            calculatedSum += Math.pow(lastDigit, noOfDigits);
            n /= 10;
        }
        return calculatedSum == duplicateN;
    }

    public static void main(String[] args) {
        System.out.println("Is number Armstrong? " + isArmstrong(153));
    }
}