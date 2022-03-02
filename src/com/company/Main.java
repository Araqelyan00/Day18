package com.company;
import com.company.model.PersonModel;
import com.company.model.TriangleModel;;
import java.util.Scanner;
import static com.company.validator.PersonValidator.*;
import static com.company.validator.TriangleValidator.*;

public class Main {
// Task - 1, 2:
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	//
        String firstName;
        String lastName;
        String passportID;
        int age;
        String gender;
        String nationality;

        while (true) {
            System.out.println("Enter first name in range 3 to 15");
            firstName = scanner.nextLine();
            if (isValidFirstName(firstName)) {
                break;
            } else {
                System.out.println("Invalid first name");
            }
        }

        while (true) {
            System.out.println("Enter last name in range 6 to 20");
            lastName = scanner.nextLine();
            if (isValidLastName(lastName)) {
                break;
            } else {
                System.out.println("Invalid last name");
            }
        }

        while (true) {
            System.out.println("Enter passportId and it must be start with “AN” and contain 6 digits with length 8");
            passportID = scanner.nextLine();
            if (isValidPassportID(passportID)) {
                break;
            } else {
                System.out.println("Invalid passportID");
            }
        }

        while (true) {
            System.out.println("Enter age and it must be in range 18 - 99");
            age = scanner.nextInt();
            if (isValidAge(age)) {
                break;
            } else {
                System.out.println("Invalid age");
            }
        }

        scanner.nextLine();

        while (true) {
            System.out.println("Enter gender and it must be male or female");
            gender = scanner.nextLine();
            if (isValidGender(gender)) {
                break;
            } else {
                System.out.println("Invalid gender");
            }
        }

        System.out.println("Enter nationality");
        nationality = scanner.nextLine();

        PersonModel person1 = new PersonModel(firstName, lastName, passportID, age, gender, nationality);
        person1.display();

//  Task - 3:
    int sizeA;
    int sizeB;
    int sizeC;

    while (true){
        System.out.println("Enter triangle sideA in range from 1 to 20.");
        sizeA = scanner.nextInt();
        if (isValidSide(sizeA)) {
            break;
        } else {
            System.out.println("Try again.");
        }
    }

        while (true){
            System.out.println("Enter triangle sideB in range from 1 to 20.");
            sizeB = scanner.nextInt();
            if (isValidSide(sizeB)) {
                break;
            } else {
                System.out.println("Try again.");
            }
        }

        while (true){
            System.out.println("Enter triangle sideC in range from 1 to 20.");
            sizeC = scanner.nextInt();
            if (isValidSide(sizeC)) {
                break;
            } else {
                System.out.println("Try again.");
            }
        }
        TriangleModel triangle = new TriangleModel(sizeA, sizeB, sizeC);
        if (!checkTriangle(triangle)){
            System.out.println("Is not Valid.");
            return;
        }

        if (isRightTriangle(triangle)){
            System.out.println("Your triangle is right triangle.");
        }
        System.out.println("Area of your triangle = " + triangle.area());

    }
}
