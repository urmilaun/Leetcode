import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the complement of each number
        HashMap<Integer, Integer> complementMap = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement exists in the HashMap
            if (complementMap.containsKey(complement)) {
                // Return the indices of the two numbers
                return new int[] { complementMap.get(complement), i };
            }

            // If the complement does not exist, add the number to the HashMap
            complementMap.put(nums[i], i);
        }

        // If no solution is found, return an empty array
        return new int[] {};
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);

        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
