package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class FullNameApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! Please enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter your middle initial: ");
        String middleInitial = scanner.nextLine();

        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Enter suffix (if applicable): ");
        String suffix = scanner.nextLine();

        String fullName = firstName;

        if (!middleInitial.isEmpty()) {
            fullName = String.format("%s %s.", fullName, middleInitial);
        }

        fullName = String.format("%s %s", fullName, lastName);

        if (!suffix.isEmpty()) {
            fullName = String.format("%s, %s", fullName, suffix);
        }

        System.out.println("Hello, " + fullName);
    }
}
