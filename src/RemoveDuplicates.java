import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String args[]){
        int[] arr = {2,3,2,4,3,5,6,5,7,8,8,9};

        //sort the array to bring duplicates together
        Arrays.sort(arr);

       //create new array to store unique values
        int[] newArr =new int [arr.length];
        int j=0;

        //loop through the sored array, skipping duplicates
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] != arr[i+1]){
                newArr[j] =arr[i];
                j++;
            }
        }

        //add the last element to the new array
        newArr[j] =arr[arr.length-1];
        j++;


        //create final array with only the unique values
        int[] finalArr =new int[j];
        for(int i=0;i<j;i++){
            finalArr[i] =newArr[i];

        }
        System.out.println(Arrays.toString(finalArr));

    }
}
