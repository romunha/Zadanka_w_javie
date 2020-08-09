package com.company;

public class Zad2 {

    public static void main(String[] args) {
        int i;
        int x = 1;
        int y = 1;
        int z = 1;
        int n = 10;
        if (n == 0 || n == 1) {
            System.out.println(n);
        }
        else {
            for (i = 3; i <= n; i++) {
                z = x + y;
                x = y;
                y = z;
                System.out.println(y);

            }

        }
    }
}