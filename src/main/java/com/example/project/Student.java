package com.example.project;

public class Student {
    // instance variables for 
    private String firstname;
    private String lastname;
    private int graduationyear;
    private double sumOfTestScores;
    private int testScoreCount;
    private double highestTestScore;
 
    // constructor
    public Student(String firstName, String lastName, int gradYear) {
        firstname = firstName;
        lastname = lastName;
        graduationyear = gradYear;

    }
 
    // returns firstName
    public String getFirstName() {
        return firstname;
    }
 
    // returns lastName
    public String getLastName() {
        return lastname;
    }
 
    public double getHighestTestScore() {
        return highestTestScore;
    }

    public int getTestScoreCount(){
        return testScoreCount;
    }

    public int getGradYear(){
        return graduationyear;
    }
 
    // sets gradYear to newGradYear
    public void setGradYear(int newGradYear) {
        graduationyear = newGradYear;
    }
 
    // adds newTestScore to accumulatedTestScores
    // and increments testScoreCount by 1
    // set new highest test score 
    public void addTestScore(double newTestScore) {
        sumOfTestScores += newTestScore;
        testScoreCount ++;
        if(newTestScore > highestTestScore) {
            highestTestScore = newTestScore;
        }
    }
 
    // returns true if the student's average test score is greater
    // than or equal to 65; returns false otherwise (see Note 2 below)
    public boolean isPassing() {
        if(averageTestScore() > 65 || averageTestScore() == 65) {
        return true;
    }
    else {
        return false;
    }
}
 
    // returns the Student's average test score as the
    // quotient of accumulatedTestScores and testScoreCount
    public double averageTestScore() {
        return sumOfTestScores / testScoreCount;
    }
 
    // this method prints all info of a Student object to the console 
    // I AM NOT TESTING YOU ON THIS METHOD. IT'S FOR YOUR TESTING PURPOSES ONLY.. you don't have to use it
    public void printStudentInfo() {
        System.out.println("Student Full Name: " );
        System.out.println("Graduation Year: ");
        System.out.println("Number of tests: ");
        System.out.println("Average Test Score: ");
        System.out.println("Highest Test Score: ");
        System.out.println("Is passing: ");
    }
 }
 