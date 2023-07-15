package algorithm;

public class kadane {
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int index=0;index<nums.length;index++){
            if (sum < 0){
                sum = 0;
            }
            sum += nums[index];
            if (sum > max){
                max = sum;
            }
        }
        return max;
    }
    public static void main(String[] args){
    	// test 1: answer = {4, -1, 2, 1}
    	int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(kadane.maxSubArray(nums));
        // test 2: answer = {1}
    	nums = new int[]{1};
        System.out.println(kadane.maxSubArray(nums));
        // test 3: answer = {5,4,-1,7,8}
    	nums = new int[]{5,4,-1,7,8};
        System.out.println(kadane.maxSubArray(nums));
    }
}
