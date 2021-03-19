package com.exercise.java;

public class Main {

    static int n1=0, n2=1, value=0;

    public static void main(String[] args) {
	// write your code here
        // Fibonacci Series
        int a=0, b=1, c, mycount=10;
        System.out.print(a +" "+b + " ");
        for (int i=0;i<mycount-2;i++){
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

        System.out.println("\n");

        // using recursion method
        int  count = 10;
        System.out.print(n1 +" "+n2 + " ");
        printFibonacci(count-2);


    }

    static void printFibonacci(int count){
        if(count>0){
            value = n1 + n2;
            System.out.print(value + " ");
            n1  = n2;
            n2 = value;
            printFibonacci(count-1);
        }

    }
}
