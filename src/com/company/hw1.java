package com.company;

public class hw1 {

    public static void main(String[] args) {
        int [] numbers = {-2, 9, 11, 12, 13, 14, 15, 22, 142};
        int key = 15;

        int lo = 0, hi = numbers.length - 1;
        boolean found = false;
        while (!found && lo <= hi) {
            int mid = (lo + hi) / 2;
            int val = numbers [mid];
            System.out.println (val);
            if (val == key)
                found = true;
            else if (val > key)
                hi = mid - 1;
            else
                lo = mid + 1;
        }
    }
}
