import java.util.*;

class q4 {

    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Empty prefix has occurred once
        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {

            prefixSum += num;

            // Check if prefixSum - k existed before
            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }

            // Store/update current prefix sum
            map.put(prefixSum,
                    map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        q4 obj = new q4();

        int[] nums = {1, 1, 1};
        int k = 2;

        System.out.println(obj.subarraySum(nums, k));
    }
}