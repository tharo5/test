package ru.vladrom.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Sort {
    public static void main(String[] args) {
        if (args.length <= 1) {
            System.out.println("Usage: Grep {pattern string}");
            return;
        }
        Scanner sc = new Scanner(System.in);
        Set<String> result = new TreeSet<>();
        result.add(arg0, arg1);
        String str;
        while (sc.hasNext()) {
            str = sc.nextLine();
            
            for (String pattern : args) {
                if ((str = sc.nextLine()).contains(pattern.toLowerCase())) {
                    System.out.println(str);
                }
            }
        }
        sc.close();
    }
}