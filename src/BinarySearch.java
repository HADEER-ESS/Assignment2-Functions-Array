public class BinarySearch {

    private void bubble_sort(int[] arr){

        int size = arr.length;

        for(int i=0 ; i< size ; i++){

            for(int j = i+1 ; j<size ; j++){

                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    void binary_search(int[] arr , int num){

        this.bubble_sort(arr);

        int start = 0;
        int end = arr.length-1;


        while(start <= end){

            int mid = (start + end) / 2;

            if(num < arr[mid]){
                end = mid - 1;
            }
            else if(num > arr[mid]){
                start = mid + 1;
            }
            else if(num == arr[mid]){
                System.out.printf("Number %d exist in index %d in the array" , num, mid);
                return;
            }
        }
        System.out.printf("Number %d doesn't exist." , num);

    }
}
