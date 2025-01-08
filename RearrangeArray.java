//Question: Rearranging the array such that maximum element comes first followed by smallest element
//i/p : 1, 2, 3, 4, 5
//o/p : 5, 1, 4, 2, 3

public class RearrangeArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        int[] result_arr = new int[n];      //creating result_arr for storing result
        int left = 0;            //pointer for smallest element
        int right = n -1;        //pointer for largest element
        int i = 0;               //pointer for index of result_arr

        while(left <= right){
            if(i < n){
                result_arr[i++] = arr[right--];       //adding largest element first in result_arr
            }
            if(i < n){
                result_arr[i++] = arr[left++];       //then adding smallest element after the largest element
            }
        }

        for (int j = 0; j < n; j++) {                 //printing the result arr
            System.out.print(result_arr[j] + " ");
        }
    }
}
