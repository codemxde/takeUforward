import java.util.HashMap;

class Solution {
    
    public static int sumHighestAndLowestFrequency(int[] nums) {
        if (nums.length == 1) return 2;

        int maxFreq = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(num)) {
                int freq = map.get(num) + 1;
                if (freq > maxFreq) maxFreq = freq;

                map.put(num, freq);
            } else {
                map.put(num, 1);
            }
        }

        int minFreq = maxFreq;
        for (int value: map.values()) {
            if (value < minFreq) minFreq = value;
        }

        return minFreq + maxFreq;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + sumHighestAndLowestFrequency(new int[] {1, 2, 2, 3, 3, 3}));
    }
}
