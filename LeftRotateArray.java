//Question: Left rotate array by k positions
public class LeftRotateArray {
    public static void leftrotate(int[] arr, int k, int n){
        k = k % n;          //if k > arr.length

        int[] temp = new int[k];   //creating temp array to store the k elements

        for (int i = 0; i < k; i++) {    //storing k elements in temp array
            temp[i] = arr[i];
        }

        for (int i = k; i < n; i++) {  //rotating the original array to front (3 -> 0, 4 -> 1,.... i -> i - k)
            arr[i - k] = arr[i];
        }

        for (int i = n - k; i < n; i++ ){   //rotating the temporary array to back (0 -> 4, 1 -> 5, 2 -> 6, 3 -> 7 .....  temp(i -( n - k) ) -> arr[i] )
            arr[i] = temp[i - (n - k)];
        }

    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int n = arr.length;
        int k = 3;
        leftrotate(arr, k, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
