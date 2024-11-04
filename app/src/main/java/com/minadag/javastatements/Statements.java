package com.minadag.javastatements;

public class Statements {
    public static void main (String[] args) {
        // operators
        int x = 5;
        x = x + 1;
        System.out.println(x);
        x++; // +1
        System.out.println(x);
        int y = 10;
        x = x + y ;
        x = x * 5 ;
        x--; // -1
        System.out.println(x);
        System.out.println(x>y); // boolean
        System.out.println(x==y);
        System.out.println(x > y && x > 0); // && --> and
        System.out.println(x < y || x > 0); // || --> or

        // IF --> eger
        if (x > y){
            System.out.println("x is bigger than y");
        } else if (x < y) {
            System.out.println("y is bigger than x");
        }else {
            System.out.println("x = y");
        }

        // Switch

        int day = 2;
        String dayString = "";

        switch (day){
            case 1:
                dayString = "monday";
                break;
            case 2:
                dayString = "tuesday";
                break;
            case 3:
                dayString = "wednesday";
                break;
            default:
                dayString = "sunday";
                break;
        }
        System.out.println(dayString);
    }
}
