import java.util.HashSet;

//Question: Find first repeated elements in an array
public class firstRepeatedElement {

    public static int findrepeatednum(int[] arr){
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if(set.contains(num)){    //first repeated element
                return num;
            }
            set.add(num);
        }
        return -1;  //no repeated element found
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 1};
        int result = findrepeatednum(arr);
        if(result == -1){
            System.out.println("No repeated element in an array");
        }else {
            System.out.println("First repeated element in an array is: " + result);
        }
    }
}
