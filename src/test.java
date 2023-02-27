import java.util.*;
public class test {
    public static void main(String args[]){
        int arr[]=new int[10];

        Random rd=new Random();
        for(int i=0;i<10;i++){
            arr[i]=rd.nextInt(50);
        }

        for(int i=0;i<10;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println("");

        int oddSum=0;
        int evenSum=0;

        for(int i=0;i<10;i++){
            if(arr[i]%2==0){
                evenSum=evenSum+arr[i];
            }
            else{
                oddSum=oddSum+arr[i];
            }
        }
        System.out.println("Sum of the even numbers: "+evenSum);
        System.out.println("Sum of the odd numbers: "+oddSum);
    }
}
