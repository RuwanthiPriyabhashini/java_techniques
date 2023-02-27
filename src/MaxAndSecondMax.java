public class MaxAndSecondMax{
    public static void main(String args[]){
        int arr[]={45,10,20,52,4,36,47};
        int max=arr[0];
        int nextMax=arr[0];

        for(int i=0;i<arr.length;i++) {
            if (max < arr[i]) {
                nextMax = max;
                max = arr[i];
            } else {
                if (arr[i] > nextMax) {
                    nextMax = arr[i];
                }
            }
        }
            System.out.println("Maximum element is: "+max);
            System.out.println("Second Maximum element is: "+nextMax);

    }
}
