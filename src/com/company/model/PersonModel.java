package com.company.model;

public class PersonModel {
    private String firstName;
    private String lastName;
    private String passportID;
    private int age;
    private String gender;
    private String nationality;

    public PersonModel(){

    }

    public PersonModel(String firstName, String lastName, String passportID, int age, String gender, String nationality){
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportID = passportID;
        this.age = age;
        this.gender = gender;
        this.nationality = nationality;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public  String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getPassportID(){
        return passportID;
    }
    public void setPassportID(String passportID){
        this.passportID = passportID;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public void display() {
        System.out.println("firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", passportID = " + passportID +
                ", age = " + age +
                ", gender = '" + gender + '\'' +
                ", nationality = '" + nationality + '\'');
    }
}
