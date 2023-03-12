import java.util.*;

public class RemoveDuplicates2 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your numbers here: ");
        int[] arr=new int[10];

        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }

        System.out.println("Unsorted Array: "+Arrays.toString(arr));

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted Array: "+Arrays.toString(arr));

        int[] newArr=new int[arr.length];
        int j=0;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                newArr[j]=arr[i];
                j++;
            }
        }

        newArr[j]=arr[arr.length-1];
        j++;

        int finalArr[]=new int[j];

        for(int i=0;i<j;i++){
            finalArr[i]=newArr[i];
        }
        System.out.println("Final Array: "+Arrays.toString(finalArr));
    }
}