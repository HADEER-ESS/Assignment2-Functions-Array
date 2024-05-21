//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //int[] arr = {1,2,3,4,1,3,6,4};

        //FirstTask.CountGeneral(arr);


        //first => all even numbers summation
        //second => all even numbers count
        //System.out.println(FirstTask.CalculateEven(arr).first);


        //==============================================================================================================


        int[] unsorted = {9,3,11,7,55,1,2,4};

        //Q6
        //BinarySearch example = new BinarySearch();

        //example.binary_search(unsorted, 100);


        //Q7
        //SelectionSort.selection_sort(unsorted);


        //Q8
        /*
        * compare between binary search and linear search in terms of performance
          and best case and worst case and average case.
        */

        /*
        Binary Search

            Time Complexity => O(log n)
            Require => work only with sorted array.
            Term => divide array into half based on if the target number greater than middle index num
                    ignore the small left side and reassign the start, end, middle of the array.
            Best Case => O(1) when the target number in the middle index of the array.
         */

        /*
        Linear Search

            Time Complexity => O(n)
            Term => loop through the whole array and check if target number is equal to a number in the array.
            Best Case => O(1) when the target number at the start of the array.
            Worst Case => O(n) when the target number exist at the end of the array.
        */
    }
}