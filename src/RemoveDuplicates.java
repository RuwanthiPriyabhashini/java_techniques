import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String args[]){
        int[] arr = {2,3,2,4,3,5,6,5,7,8,8};

        //sort the array to bring duplicates together

        Arrays.sort(arr);

        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]);
        }

    }
}
