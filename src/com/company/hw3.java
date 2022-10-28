package com.company;

public class hw3 {

    public static void main(String[] args) {
        int[] data = {-4, 11, 7, -12, 6, 1};

        // 3.1
        /*for (int i = 0; i < data.length - 1; i++) {
            int indSmallest = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[indSmallest] > data[j])
                    indSmallest = j;
            }
            if (i != indSmallest)
                swap (data, i, indSmallest);

            for (int v : data)
                System.out.print (v + " ");
            System.out.println ();
        }*/

        // 3.2
        boolean changed = true;

        while (changed) {
            changed = false;
            for (int i = 1; i < data.length; i++)
                if (data [i - 1] > data [i]) {
                    swap (data, i - 1, i);
                    changed = true;
                }
            for (int v : data)
                System.out.print (v + " ");
            System.out.println ();
        }

    }

    static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
