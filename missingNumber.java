//Question: Find Missing Number in an array
public class missingNumber {

    public static int findMissing(int[] arr, int n){
        int original_sum = (n * (n + 1)) / 2;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return original_sum - sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = arr.length + 1;
        System.out.println("Missing number is: " + findMissing(arr, n));
    }
}
