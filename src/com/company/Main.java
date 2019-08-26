package com.company;

import java.util.Random;

public class Main<Public> {

    public static void main(String[] args) {
        Random age = new Random();
        int number;
        for (int counter = 0; counter <= 10; counter ++) {
            number = age.nextInt(107);
            System.out.println(number + " ");
        }
    }
}
