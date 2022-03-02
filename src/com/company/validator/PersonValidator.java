package com.company.validator;

public class PersonValidator {
//  firstName must be in range 3 to 15
    public static boolean isValidFirstName(String firstName){
        return (firstName != null && firstName.length() >= 3 && firstName.length() <= 15);
    }
//  lastName must be in range 6 to 20
    public static boolean isValidLastName(String lastName) {
        return (lastName != null && lastName.length() >= 6 && lastName.length() <= 20);
    }
//  age must be in range 18 - 99
    public static boolean isValidAge(int age) {
        return (age >= 18 && age <= 99);
    }
//  gender must be male or female(compareToIgnoreCase())
    public static boolean isValidGender(String gender) {
        return (gender != null && (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")));
    }
//  passportId must be start with “AN” and contain 6 digits with length 8
    public static boolean isValidPassportID(String passportID) {
        return (passportID != null && passportID.length() == 8 && passportID.startsWith("AN") && isNum(passportID.substring(2)));
    }
//  checking a given String
    public static boolean isNum(String number) {
        if (number == null) {
            return false;
        }
        int size = number.length();
        for (int i = 0; i < size; i++) {
            if (!(number.charAt(i) >= '0' && number.charAt(i) <= '9')) {
                return false;
            }
        }
        return true;
    }
}
