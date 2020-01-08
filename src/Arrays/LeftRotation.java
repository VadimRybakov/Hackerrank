package Arrays;

import java.util.Arrays;

public class LeftRotation {
    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int size = a.length;
        for (int i = 0; i < d; i++) {
            int temp = a[0];
            for (int j = 0; j < size-1; j++) {
                a[j] = a[j+1];
            }
            a[size-1] = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int[] array = new int[25];
        int min = 1;
        int max = 100;
        for (int i = 0; i < array.length; i++) {
            int arrItem = (int) ((Math.random() * (max - min + 1)) + min);
            array[i] = arrItem;
        }
        System.out.println(Arrays.toString(array));
        rotLeft(array, 3);
        System.out.println(Arrays.toString(array));
    }
}
