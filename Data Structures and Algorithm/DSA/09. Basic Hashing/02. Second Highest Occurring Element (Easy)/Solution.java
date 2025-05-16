import java.util.HashMap;
import java.util.Map;

class Solution {

    public static int findSecondHighestfrequency(HashMap<Integer, Integer> map, int highestFrequency) {
        int secondHighestFrequency = 0;
        for (int value: map.values()) {
            if (value > secondHighestFrequency && value < highestFrequency) secondHighestFrequency = value;
        }
        return secondHighestFrequency;
    }

    public static int findElementWithSecondHighestFrequency(HashMap<Integer, Integer> map ,int secondHighestFrequency) {
        int minEleWithSecondHighestFreq = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (value == secondHighestFrequency && key < minEleWithSecondHighestFreq) {
                minEleWithSecondHighestFreq = key;
            }
        }

        return minEleWithSecondHighestFreq;
    }

    public static int secondMostFrequentElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int highestFrequency = 1;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(num)) {
                int freq = map.get(num) + 1;
                if (freq > highestFrequency) highestFrequency = freq;

                map.put(num, freq);

            } else {
                map.put(num, 1);
            }
        }

        int secondHighestFrequency = findSecondHighestfrequency(map, highestFrequency);

        if (secondHighestFrequency == 0) return -1; 

        int result = findElementWithSecondHighestFrequency(map, secondHighestFrequency);

        return result;
    }
    public static void main(String[] args) {
        int result =  secondMostFrequentElement(new int[] {1, 2, 2, 3, 3, 3});
        System.out.println("Result: " + result);
    }
}
