package main.java.util;

import java.util.Scanner;

public class FileList {

    private static Scanner sc;

    private FileList() {

    }

    public static int[] intArray(java.io.File f) {
        int length = lineLength(f);
        int[] value = new int[length];

        try {
            sc = new Scanner(f);
        } catch (java.io.FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        }

        for (int i = 0; i < value.length; i++) {
            value[i] = sc.nextInt();
        }

        return value;
    }

    public static String[] stringArray(java.io.File f) {
        int length = lineLength(f);
        String[] value = new String[length];

        try {
            sc = new Scanner(f);
        } catch (java.io.FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        }

        for (int i = 0; i < value.length; i++) {
            value[i] = sc.nextLine();
        }

        return value;
    }

    private static int lineLength(java.io.File f) {
        int value = 0;

        try {
            sc = new Scanner(f);
        } catch (java.io.FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        }

        while (sc.hasNextLine()) {
            sc.nextLine();
            value += 1;
        }
        return value;
    }
}
