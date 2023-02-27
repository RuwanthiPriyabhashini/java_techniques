import java.util.Scanner;

public class SecondMin{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter numbers:");
        int[] arr=new int[5];

        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }

        int min=arr[0];
        int nextMin=arr[0];

        for(int i=2;i<arr.length;i++){
            if(arr[i]<min){
                nextMin=min;
                min=arr[i];
            }
            else{
                if(nextMin>arr[i]){
                    nextMin=arr[i];
                }
            }
        }
        System.out.print("Second Min: "+nextMin);
    }
}
