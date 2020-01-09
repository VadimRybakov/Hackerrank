package Sorting;

import java.util.Arrays;

public class MarkAndToys {
    static void insertSort(int[] array){
        for(int i = 0; i < array.length; i++ ){
            // Take the element
            int value = array[i];
            int j = i - 1;
            // Shift left
            for(; j >= 0; j--){
                // if the value is lower than current element,
                // shift right current element
                if(value < array[j]){
                    array[j + 1] = array[j];
                }
                else break;
            }
            // Insert value in empty place
           array[j + 1] = value;
        }
    }

    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {
        //Sort array
        insertSort(prices);
        //Count summ of first elements while it doesn't reach k
        int count = 0 ;
        for(int i = 0 ; i < prices.length ; i++){
            if(prices[i] <= k) {
                k -= prices[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 4};
        System.out.println(maximumToys(arr, 15));
        System.out.println(Arrays.toString(arr));

    }
}
