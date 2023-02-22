public class LinearSearch {
    public static  void main(String args[]){
        int arr[] = {2,6,1,8,4,9,3};
        int key=9;

        for(int i=0;i< arr.length;i++){
            if(arr[i] == key){
                System.out.println("Key is found at array position " + i);
            }
        }
    }
}
