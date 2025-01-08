public class MaximumDifferencePair {
    public static void findMaxDiff(int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        //finding minimum and maximum element in array
        for (int i : arr){
            if(i < min) min = i;
            if(i > max) max = i;
        }

        System.out.println("Maximum Difference is Between " + max + " and " + min + " is " + (max - min));
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 8, 15};
        findMaxDiff(arr);
    }
}