import java.util.Scanner;
public class Max{
        public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

            System.out.println("Enter your numbers:");
            int[] arr=new int[5];

            for(int i=0;i<arr.length;i++){
                arr[i]=scan.nextInt();
            }

            int max=arr[0];
            int nextMax=arr[0];

            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    nextMax=max;
                    max=arr[i];
                }
                else{
                    if(arr[i]>nextMax){
                        arr[i]=nextMax;
                    }
                }
            }

            System.out.println("Max value is: "+max);
            System.out.println("Second max value is: "+nextMax);
        }
}
