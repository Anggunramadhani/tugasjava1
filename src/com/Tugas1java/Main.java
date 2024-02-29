package com.Tugas1java;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner inputUser = new Scanner(System.in);

        int input;
        String username,Nim,password;

        while (true) {
            System.out.println("==== Library System ====");
            System.out.println("1. Login as student");
            System.out.println("2. Login as admin");
            System.out.println("3. Exit");
            System.out.print("Choose option (1-3): ");
            input = inputUser.nextInt();
            
            if (input == 1) {
                System.out.print("Enter your Nim: ");
                Nim = inputUser.next();

                if ( Nim.length() == 15) {
                    System.out.println("Successful login as student");
                } else {
                    System.out.println("User not found");
                }

            } else if (input == 2) {
                System.out.print("Enter your username (admin): ");
                username = inputUser.next();
                System.out.print("Enter your password (admin): ");
                password = inputUser.next();

                if ((username.length() != 5||(password.length() !=5))) {
                    System.out.println("Admin not valid!!");
                } else {
                    System.out.print("Succes login as admin ");
                }
            } else if (input == 3) {
                System.out.println("Program selesai");
                break;
            } else {
                System.out.println("Invalid option.Please choose 1,2,or 3.");
            }
        }
    }
}
