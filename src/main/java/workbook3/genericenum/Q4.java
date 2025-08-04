package main.java.workbook3.genericenum;

import java.util.Scanner;

enum Level { LOW, MEDIUM, HIGH }

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        Level level = Level.valueOf(input);
        System.out.println(level);
    }
}