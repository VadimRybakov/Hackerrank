package Strings;

import java.util.Arrays;

public class SherlockAndTheValidString {
    static String isValid(String s) {
        String yes = "YES";
        String no = "NO";
        if(s.length() == 1) return yes;
        // Get the array of repeats
        int[] repeatArr = new int[s.length()];
        StringBuilder researchS = new StringBuilder(s);
        int i = 0;
        while(i < researchS.length()){
            int repeatCounter = 1;
            int j = researchS.length() - 1;
            while(j > i){
                if(researchS.charAt(i) == researchS.charAt(j)){
                    repeatCounter++;
                    researchS.deleteCharAt(j);
                }
                j--;
            }
            repeatArr[i] = repeatCounter;
            i++;
        }
         System.out.println(Arrays.toString(repeatArr));
        // Is the string valid?
        int counter = 0;
        for(i = 0; repeatArr[i] > 0; i++){
            counter++;
        }
        //get repeatArr without 0
        int[] arr = new int[counter];

        for(i = 0; i < arr.length; i++){
            arr[i] = repeatArr[i];
        }
         System.out.println(Arrays.toString(arr));
        boolean isVal = false;
        int max = arr[0];
        int min = arr[0];
        for(i = 0; i < arr.length; i++){
            if(max < arr[i]) max = arr[i];
            if(min > arr[i]) min = arr[i];
        }
        for(i = 0; i < arr.length; i++){
            int temp = arr[i];
            counter = 1;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] == arr[i]) counter++;
            }
            if(counter >= arr.length - 1 && max - temp <= 1){
                isVal = true;
                break;
            }
        }
        if(isVal == true) return yes;
        else return no;
    }

    public static void main(String[] args) {
        String s ="aabbcd";
        System.out.println(isValid(s));
    }
}
