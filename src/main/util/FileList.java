package main.util;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class FileList {

    private static Scanner sc;

    private FileList() {
        sc = null;
    }

    public static ArrayList<Integer> toListInteger(File f) {
        ArrayList<Integer> list = new ArrayList<>();
        try {
            sc = new Scanner(f);
            while (sc.hasNextInt()) {
                list.add(sc.nextInt());
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public static int[] toArrayInt(File f) {
        ArrayList<Integer> list = toListInteger(f);
        int[] array = new int[list.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    public static ArrayList<String> toListString(File f) {
        ArrayList<String> list = new ArrayList<>();
        try {
            sc = new Scanner(f);
            while (sc.hasNextLine()) {
                list.add(sc.nextLine());
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public static String[] toArrayString(File f) {
        ArrayList<String> list = toListString(f);
        String[] array = new String[list.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}
