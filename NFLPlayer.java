/**
 * Program: NFL Draft Final 
 * Project - NFL Player class 
 * File: NFLPlayer.java
 * Summary: The NFL Player class for the project. 
 * Author: Evan W Wilson 
 * Date: November 19, 2017
 **/
package NFLDraft;

public abstract class NFLPlayer {

    //declare variables
    String firstName;
    String lastName;
    String team;
    String college;
    double dash40;
    int age;
    int height;
    int weight;
    double BMI;
    int experience;
    String injury;

    //constructor without parameters
    public NFLPlayer() {
    }

    //constructor that accepts all variables
    public NFLPlayer(String firstName, String lastName, String team, String college, double dash40,
            int age, int height, int weight, double BMI, int experience, String injury) {

    }

    //following methods set and get all variables
    public void setFirstName(String n1) {
        this.firstName = n1;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String n2) {
        this.lastName = n2;
    }

    public String getLastName() {
        return lastName;
    }

    public void setTeam(String t) {
        this.team = t;
    }

    public String getTeam() {
        return team;
    }

    public void setDash40(double d) {
        this.dash40 = d;
    }

    public double getDash40() {
        return dash40;
    }

    public void setAge(int a) {
        this.age = a;
    }

    public int getAge() {
        return age;
    }

    public void setHeight(int h) {
        this.height = h;
    }

    public int getHeight() {
        return height;
    }

    public void setWeight(int w) {
        this.weight = w;
    }

    public int getWeight() {
        return weight;
    }

    //uses weight and height to calculate BMI
    public void setBMI(int weight, int height) {
        this.BMI = (weight * .45) / ((height * .025) * 2);
        this.BMI = Math.round(BMI * 100.0) / 100.0;
    }

    public double getBMI() {
        return BMI;
    }

    //sets # years college experience assuming going straight to college
    public void setExperience(int age) {
        this.experience = age - 18;
    }

    public int getExperience() {
        return experience;
    }

    public void setCollege(String c) {
        this.college = c;
    }

    public String getCollege() {
        return college;
    }

    public void setInjury(String i) {
        this.injury = i;
    }

    public String getInjury() {
        return injury;
    }
    
    public String toString() {

        //converts height into feet/inches
        int feet = height / 12;
        int inches = height % 12;

        return "Name:  " + firstName + " " + lastName
                + "\nCollege:  " + college
                + "\n40 Yard dash time:  " + dash40
                + "\nAge:  " + age
                + "\nHeight:  " + feet + " foot " + inches + " inches"
                + "\nWeight:  " + weight
                + "\nBMI:  " + BMI
                + "\nYears College Experiennce:  " + experience
                + "\n" + injury;
    }

}
