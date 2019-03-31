package com.codegym.DesignMenu;

import java.util.Scanner;

public class DesignMenuForApp {
    public static void main(String[] args) {
        System.out.println("press 1 to draw a rectangle");
        System.out.println("press 2 to draw a triangle");
        System.out.println("press 3 to draw a square");
        System.out.println("press 0 to exit");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.print("enter the row of rectangle: ");
                int row = scanner.nextInt();
                System.out.print("enter the collumn of rectangle: ");
                int collumn = scanner.nextInt();
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < collumn; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("enter the length of triangle: ");
                int length = scanner.nextInt();
                for (int i = 0; i < length; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print(" * ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("enter the size of square: ");
                int size = scanner.nextInt();
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        System.out.print("  *  ");
                    }
                    System.out.println("\n");
                }
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("no choiced");
        }
    }
}
