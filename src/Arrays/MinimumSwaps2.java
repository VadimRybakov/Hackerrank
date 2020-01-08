//https://www.hackerrank.com/challenges/minimum-swaps-2/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
package Arrays;

public class MinimumSwaps2 {
    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int swap = 0;
        for (int i = 0; i < arr.length; i++) {
            while (i+1 != arr[i]) {
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
                swap += 1;
            }
        }
        return swap;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 3, 2, 6, 7};
        System.out.println(minimumSwaps(arr));
    }
}
