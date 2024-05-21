public class SelectionSort {


    static void selection_sort(int[] arr){

        int size = arr.length;

        for(int i=0; i<size ; i++){

            int min_index = i;

            for(int j = i+1 ; j<size ; j++){

                if(arr[min_index] > arr[j]){
                    min_index = j;
                }
            }

            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }

    }
}
