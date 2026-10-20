package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class FullNameApplication {

    public static void main(String[] args) {
        System.out.println(gatherUserInfo());
        //formatFullName();
    }

    public static String gatherUserInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! Please enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter your middle name, or middle initial: ");
        String middleName = scanner.nextLine();

        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Enter suffix (if applicable): ");
        String suffix = scanner.nextLine();

        List<>

        return firstName + lastName;
    }
}
