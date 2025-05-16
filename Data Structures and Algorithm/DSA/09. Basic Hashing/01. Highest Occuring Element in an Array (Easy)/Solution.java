// # Problem Statement
// * Given an array of n integers, find the most frequent element in it
// * i.e., the element that occurs the maximum number of times.
// * If there are multiple elements that appear a maximum
// * number of times, find the smallest of them.

// # Example 1
// * Input: arr = [1, 2, 2, 3, 3, 3]

// * Output: 3

// * Explanation: The number 3 appears the most (3 times). It is the most frequent element.

// # Example 2
// * Input: arr = [4, 4, 5, 5, 6]

// * Output: 4

// * Explanation: Both 4 and 5 appear twice, but 4 is smaller. So, 4 is the most frequent element.

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void createMap(HashMap<Integer, Integer> map, int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(num)) {
                int freq = map.get(num);
                map.put(num, freq+1);
            } else {
                map.put(num,1);
            }
        }
    }

    public static int findMaximumFrequency(HashMap<Integer, Integer> map) {
        int maxFrequency = 1;
        for (int value: map.values()) {
            if (value > maxFrequency) maxFrequency = value;
        }
        return maxFrequency;
    }

    public static int mostFrequentElement(int[] nums) {
        if (nums.length == 1) return nums[0];

        HashMap<Integer, Integer> map = new HashMap<>();
        createMap(map, nums);

        int maxFrequency = findMaximumFrequency(map);
        int minEleWithMaxFreq = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (value == maxFrequency && key < minEleWithMaxFreq) minEleWithMaxFreq = key;
        }

        return minEleWithMaxFreq;
    }

    public static void main(String[] args) {
        int[] nums = {4, 4, 5, 5, 6};
        System.out.println(mostFrequentElement(nums));
    }    
}