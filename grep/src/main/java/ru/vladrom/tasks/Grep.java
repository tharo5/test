package ru.vladrom.tasks;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Grep {
    public static void main(String[] args) {
        if (args.length <= 1) {
            System.out.println("Usage: Grep {pattern string}");
            return;
        }
        Scanner sc = new Scanner(System.in);
        String str;
        while (sc.hasNextLine()) {
            for (String pattern : args) {
                if ((str = sc.nextLine()).contains(pattern.toLowerCase())) {
                    System.out.println(str);
                }
            }
        }
        sc.close();
    }
}
