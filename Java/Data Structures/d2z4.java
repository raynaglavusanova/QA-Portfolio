package com.qarayna;

import java.util.InputMismatchException;
import java.util.Scanner;

public class d2z4 {
    public static void main(String[] args) {
    //4.Find biggest element of an array and print it in the console
    int n = 0;
    Scanner sc = new Scanner(System.in);
    boolean valid = false;
        while (!valid) {
        try {
            System.out.print("Enter the number of elements you want to store: ");
            n = sc.nextInt();
            if(n>0) {
                valid = true;
            }else System.out.println("Array length cannot be 0 or less");
        } catch (NegativeArraySizeException | InputMismatchException | ArrayIndexOutOfBoundsException p) {
            System.out.println("Enter a positive integer value");
            sc.nextLine();
        }
    }
    double [] array = new double [n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
        try {
            array[i] = sc.nextDouble();
        } catch (InputMismatchException | ArrayIndexOutOfBoundsException p){
            System.out.println("Enter some kind of number");
            sc.nextLine();
            i--;
        }
    }
        System.out.println("Array elements are: ");
        for (int i = 0; i < n; i++) {
        System.out.println(array[i]);
    }
    double largest = array[0];
        for ( int i = 1;i < array.length; i++) {
        if (array[i] > largest)
            largest = array[i];
    }
        System.out.println("The largest number from the array is: " + largest);
}
}


