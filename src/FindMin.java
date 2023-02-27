import java.util.Scanner;
public class FindMin {
   public static void main(String args[]){
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter your numbers:");
       int[] numArr=new int[5];


       for(int i=0;i<numArr.length;i++){
           numArr[i] =scan.nextInt();
           }

       int min=numArr[0];
       for(int i=1;i<numArr.length;i++){
           if(min>numArr[i]){
               min=numArr[i];
           }
       }


       System.out.println("Min number is: "+min);
   }
}
