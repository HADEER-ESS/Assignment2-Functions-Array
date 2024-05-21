import java.util.Arrays;
import java.util.List;

public class FirstTask {

    //Q1
    static int getSummition(int[] arr){

        int sum = 0 ;

        for(int i=0 ; i< arr.length ; i++){

            sum += arr[i];
        }

        return sum;
    }


    //Q2
    static  int getNumOfElements(int[] arr){
        return arr.length;
    }


    //Q3
    static int getMax(int [] arr){

        int max = arr[0];

        for(int i = 1 ; i< arr.length ; i++){

            if(max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }


    //Q4
    static int getMin(int[] arr){

        int min = arr[0];

        for(int i = 1 ; i< arr.length ; i++){

            if(min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }


    //Q5
    static Pair<Integer> CalculateEven(int[] arr){

        Integer evenCount = 0;
        int evenSum = 0;



        for(int i=0 ; i< arr.length ; i++){

            if(arr[i] % 2 == 0){
                evenCount++;
                evenSum += arr[i];
            }
        }

        Pair<Integer> pair = new Pair<Integer>(evenSum , evenCount);

        return pair;
    }



    //Q6
    static int count2(int[] arr){

        int count = 0;

        int len = arr.length;

        for(int i=0 ; i<len ; i++){

            if(arr[i] == 2) count++;
        }

        return count;
    }



    //Q7
    static void CountGeneral(int[] arr){

        int len = arr.length;
        List<Object> list = new java.util.ArrayList<>(List.of());

        for(int i=0 ; i<len ; i++){

            int target = arr[i];
            int count = 1;

            if(!list.contains(target)){
                list.add(target);
                for(int j = i+1 ; j<len ; j++){
                    if(target == arr[j]){
                        count++;
                    }
                }
                System.out.printf("%d -> %d" , target , count);
                System.out.println();
            }
        }
    }



    //Q8

}
