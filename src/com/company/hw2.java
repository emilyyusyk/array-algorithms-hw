package com.company;

public class hw2 {

    public static void main(String[] args) {
        String [] students = {"Alissa", "Ben", "Charlie", "Dianna"};
        String [] grades = {"B", "D", "B", "A"};
        String key = "Ben";

        for (int i = 0; i < students.length; i++) {
            int index = i;
            if (key.equals (students [index]))
                System.out.println ("Grade for " + key + ": " + grades [index]);
        }
    }
}
