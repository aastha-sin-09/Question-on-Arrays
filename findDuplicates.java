import java.util.HashSet;

//Question: Print duplicates in a list
public class findDuplicates {

    public static void findDuplicateElements(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicateSet = new HashSet<>();

        for (int num : arr) {
            if(set.contains(num)){
                duplicateSet.add(num);
            }
            else{
                set.add(num);
            }
        }

        for (int num : duplicateSet) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 2, 3, 1, 2, 3, 4, 5,6, 7, 8,9, 9, 9};
        System.out.println("The duplicate elements in the given array is: ");
        findDuplicateElements(arr);
    }
}
