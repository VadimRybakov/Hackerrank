package Arrays;

import java.util.Arrays;

public class Hourglass {
    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int[][] sum = new int[4][4];
        int max = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                sum[i][j] = arr[i][j] + arr[i][j+1] + arr[i][j+2] +
                        arr[i+1][j+1] +
                        arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if(i == 0 && j == 0) max = sum[0][0];
                else if(max < sum[i][j]) max = sum[i][j];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        int min = -2;
        int max = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                int arrItem = (int)((Math.random()* (max - min + 1)) + min);
                arr[i][j] = arrItem;
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        int result = hourglassSum(arr);
        System.out.println(result);
    }
}
