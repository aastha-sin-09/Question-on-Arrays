public class MinimumDifferencePair {

    public static void findMinDiff(int[] arr){
        int min = Integer.MAX_VALUE;
        int first = 0;
        int second = 0;

        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
            if(diff < min){
                min = diff;
                first = arr[i - 1];
                second = arr[i];
            }
        }
        System.out.println("Minimum difference is between " + first + "and " + second + " and the difference is " + min);
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 8, 15};
        findMinDiff(arr);
    }
}
