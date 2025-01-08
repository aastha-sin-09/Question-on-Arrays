//Question: Find the maximum subarray sum [Kadane's Algorithm]
public class MaximumSubarraySum {
    public static int maxSubarraySum(int[] arr, int n){
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];

            if(sum > max){
                max = sum;
            }
            //if the sum of the subarray becomes negative, the reset the sum to 0
            if(sum < 0){
                sum = 0;
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int n = arr.length;
        int result = maxSubarraySum(arr, n);
        System.out.println("The maximum subarray sum is -> " + result);
    }
}
