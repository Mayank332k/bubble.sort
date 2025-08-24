public class job {
    public static void main(String[] args) {
        
        int arr[] = {6,1,8,9,2,5};
        int n = arr.length;

        for(int i = 0; i < n-1; i++){
            for(int j = 0; j< n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
         for(int x : arr){
            System.out.println(" " + x);
        }

    }
}