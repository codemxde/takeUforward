import java.util.ArrayList;
import java.util.Arrays;

class Solution {

    // Dev Dependency
    public static void printArray(int[] arr) {
        System.out.print("Array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i < arr.length - 1 ? (arr[i] + ",  ") : (arr[i] + "]\n"));
        }
    }

    public static int[] divisors(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i == n / i) {
                    list.add(i);
                } else {
                    list.add(i);
                    list.add(n / i);
                }
            }
        }

        int[] factorsArray = new int[list.size()];
        for (int i = 0; i < factorsArray.length; i++) {
            factorsArray[i] = list.get(i);
        }
        Arrays.sort(factorsArray);

        return factorsArray;
    }

    public static void main(String[] args) {
        System.out.println("Factors:");
        printArray(divisors(36));
    }
}