package ru.vladrom.tasks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream inputStream = new FileInputStream(
                "d:\\development\\git\\test\\grep\\src\\main\\java\\ru\\vladrom\\tasks\\test.txt");

        Scanner sc = new Scanner(inputStream);// System.in);
        List<String> results = new ArrayList<>();
        String str;
        boolean added = false;
        while (sc.hasNext()) {
            str = sc.nextLine();
            ListIterator<String> iter = results.listIterator();
            while (iter.hasNext()) {
                // TODO: add element at specific position
                int index = iter.nextIndex();
                if (str.compareTo(iter.next()) < 0) {
                    results.add(index, str);
                    added = true;
                    break;
                }
            }
            if (!added) {
                results.add(str);
            }
            added = false;
        }
        
        int i = 1;
        for (String res : results) {
            System.out.println(String.valueOf(i++) + " " + res);
        }
        sc.close();
    }
}