package com.company;
import ibcsutils.ReadViaURL;

public class hw4 {

    public static void main(String[] args) {
        String addr = "https://www-personal.umich.edu/~jlawler/wordlist";
        String [] words = ReadViaURL.readWords (addr, true, true, true);

        String key = "zymurgy";
        boolean found = false;
        int i = 0;

        // 4.1
        /*String [] wor = {"apple", "horse", "simple"};

        while (i < wor.length && !found) {
            if (key.equalsIgnoreCase (wor [i]))
                found = true;
            i++;
        }

        if (i > wor.length) {
            System.out.println ("key was not found.");
        }
        else
            System.out.println (key + " is the " + i + ". word.");*/


        // 4.2
        /*while (i < words.length && !found) {
            if (key.equalsIgnoreCase (words [i]))
                found = true;
            i++;
        }

        if (i > words.length) {
            System.out.println ("key was not found.");
        }
        else
            System.out.println (key + " is the " + i + ". word.");*/


        // 4.3
        int lo = 0, hi = words.length - 1;
        while (!found && lo <= hi) {
            int mid = (lo + hi) / 2;
            String word = words [mid];
            if (word.equals (key)) {
                i = mid + 1;
                found = true;
            }
            else if (key.compareToIgnoreCase (word) < 0)
                hi = mid - 1;
            else
                lo = mid + 1;
        }

        if (lo > hi) {
            System.out.println ("key was not found.");
        }
        else
            System.out.println (key + " is the " + i + ". word.");
    }
}
