package org.example;

import java.util.Random;

import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {
        int min = 0;
        int max = 7;

        int i = new Random().nextInt(7);
        System.out.println("i = " + i);
    }
}