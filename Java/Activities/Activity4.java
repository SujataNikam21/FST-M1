package activities;

import java.util.Arrays;

public class Activity4 {
    public static void main(String[] args) {
        int Array[]=  {10, 3, 7, 2, 45, 4, 6, 5, 49, 8};
        int len = Array.length, num=0;
        System.out.println("Array before sorting: " + Arrays.toString(Array));

        //sorting loop
        for(int r=0;r<len-1;r++) {
            for (int i = 0; i < len-1; i++) {
                num = Array[i];
                int j = i + 1;
                if (num > Array[j] && j <= 9) {

                    Array[i] = Array[j];
                    Array[j] = num;

                }

            }
        }

        System.out.println("Array after sorting: " + Arrays.toString(Array));

    }
}
