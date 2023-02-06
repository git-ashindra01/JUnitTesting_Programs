package com.bridgelabz.junitTestingPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class VendingMachine {
    private static int[] notes = { 1000, 500, 100, 50, 10, 5, 2, 1 };

    public static void main(String[] args) {
        System.out.print("Enter the change to be returned: ");
        int change = new Scanner(System.in).nextInt();
        ArrayList<Integer> changeNotes = getChangeNotes(change);
        System.out.println("Minimum number of notes: " + changeNotes.size());
        System.out.print("Notes: ");
        for (int note : changeNotes) {
            System.out.print(note + " ");
        }
    }
    private static ArrayList<Integer> getChangeNotes(int change) {
        if (change == 0) {
            return new ArrayList<>();
        }
        ArrayList<Integer> changeNotes = new ArrayList<>();
        for (int note : notes) {
            if (change >= note) {
                changeNotes.add(note);
                changeNotes.addAll(getChangeNotes(change - note));
                break;
            }
        }
        return changeNotes;
    }
}

