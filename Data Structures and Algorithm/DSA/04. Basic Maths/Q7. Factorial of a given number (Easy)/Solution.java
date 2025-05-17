class Solution {

    public static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;

        int resultFactorial = 1;
        while (n > 1) {
            resultFactorial *= n;
            n--;
        }
        return resultFactorial;
    }

    public static void main(String[] args) {
        System.out.println("Factorial: " + factorial(5));
    }
}