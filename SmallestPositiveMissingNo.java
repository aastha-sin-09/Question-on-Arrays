//find the smallest positive missing number in a given array
public class SmallestPositiveMissingNo {
    public static void main(String[] args) {
        int arr[] = {-1, 0, 1 , 2, 3};

        int missing = 1;
        boolean result = true;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == missing){
                missing++;
                result = false;
            }else{
                result = true;
            }
        }
        if(result == true){
            System.out.println(missing);
        } else {
            System.out.println("No number is missing");
        }
    }
}
