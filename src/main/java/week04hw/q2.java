class  {

    public int maxSubArray(int[] nums) {

        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            // Decide whether to extend or restart
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update maximum sum
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        q2 obj = new q2();

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println(obj.maxSubArray(nums));
    }
}