public class MaxTimeElement {

    public static int findMaxFrequencyElement(int[] arr){
        int maxCount = 0;
        int maxElement = -1;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }

            }
            if(count > maxCount){
                maxCount = count;
                maxElement = arr[i];
            }
        }
        return maxElement;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 4, 1, 3, 3, 3};
        int result = findMaxFrequencyElement(arr);
        System.out.println("The element with the maximum frequency is: " + result);

    }
}
