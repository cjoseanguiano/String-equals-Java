package com.devix.www;

public class Main {

    public static void main(String[] args) {
        String test = "1234";
        String test2 = "1234";
        String test3 = Integer.toString(1234);

        if (test.equals(test2)) {
            System.out.println(true);
        }
        if (test.equals(test3)) {
            System.out.println(true);
        }
        if (!test.equals("456")) {
            System.out.println(false);
        }
    }
}
