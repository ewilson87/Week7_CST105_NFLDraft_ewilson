/**
 * Program: NFL Draft Final 
 * Project - NFL Player class 
 * File: NFLPlayer.java
 * Summary: The NFL Player class for the project. 
 * Author: Evan W Wilson 
 * Date: November 19, 2017
 **/
package NFLDraft;

public class OffensivePlayer extends NFLPlayer {

    String offensePosition;
    int interceptions;
    int passingYards;
    double QBRating;
    int receivingYards;
    int fumbles;
    int rushYards;
    int touchdowns;

    public OffensivePlayer() {

    }

    public OffensivePlayer(String position, int interceptions, int passingYards, double QBRating,
            int receivingYards, int fumbles, int rushYards) {
    }

    //following methods set and get all variables
    public void setOffensePosition(String p) {
        this.offensePosition = p;
    }

    public String getOffensePosition() {
        return offensePosition;
    }

    public void setInterceptions(int i) {
        this.interceptions = i;
    }

    public int getInterceptions() {
        return interceptions;
    }

    public void setPassingYards(int p) {
        this.passingYards = p;
    }

    public int getPassingYards() {
        return passingYards;
    }

    public void setQBRating(double q) {
        this.QBRating = q;
    }

    public double getQBRating() {
        return QBRating;
    }

    public void setReceivingYards(int r) {
        this.receivingYards = r;
    }

    public int getReceivingYards() {
        return receivingYards;
    }

    public void setFumbles(int f) {
        this.fumbles = f;
    }

    public int getFumbles() {
        return fumbles;
    }

    public void setRushingYards(int r) {
        this.rushYards = r;
    }

    public int getRushingYards() {
        return rushYards;
    }

    public void setTouchdowns(int t) {
        this.touchdowns = t;
    }

    public int getTouchdowns() {
        return touchdowns;
    }

    @Override
    public String toString() {

        //converts height into feet/inches
        int feet = height / 12;
        int inches = height % 12;

        if (null != offensePosition) switch (offensePosition) {
            case "Quarterback":
                return "Name:  " + firstName + " " + lastName
                        + "\nTeam:  " + team
                        + "\nPosition:  " + offensePosition
                        + "\nCollege:  " + college
                        + "\n40 Yard dash time:  " + dash40
                        + "\nAge:  " + age
                        + "\nHeight:  " + feet + " foot " + inches + " inches"
                        + "\nWeight:  " + weight
                        + "\nBMI:  " + BMI
                        + "\nYears College Experiennce:  " + experience
                        + "\n" + injury
                        + "\nInterceptions this year:  " + interceptions
                        + "\nPassing Yards this year:  " + passingYards
                        + "\nRushing Yards this year:  " + rushYards
                        + "\nTouchdowns this year:  " + touchdowns
                        + "\nQuarterback Rating this year:  " + QBRating
                        + "\nFumbles this year:  " + fumbles;
            case "Running Back":
            case "Wide Receiver":
            case "Tight End":
                return "Name:  " + firstName + " " + lastName
                        + "\nTeam:  " + team
                        + "\nPosition:  " + offensePosition
                        + "\nCollege:  " + college
                        + "\n40 Yard dash time:  " + dash40
                        + "\nAge:  " + age
                        + "\nHeight:  " + feet + " foot " + inches + " inches"
                        + "\nWeight:  " + weight
                        + "\nBMI:  " + BMI
                        + "\nYears College Experiennce:  " + experience
                        + "\n" + injury
                        + "\nRushing Yards this year:  " + rushYards
                        + "\nReceiving Yards this year:  " + receivingYards
                        + "\nTouchdowns this year:  " + touchdowns
                    + "\nFumbles this year:  " + fumbles;
            case "Center":
            case "Offensive Guard":
            case "Offensive Tackle":
                return "Name:  " + firstName + " " + lastName
                        + "\nTeam:  " + team
                        + "\nPosition:  " + offensePosition
                        + "\nCollege:  " + college
                        + "\n40 Yard dash time:  " + dash40
                        + "\nAge:  " + age
                        + "\nHeight:  " + feet + " foot " + inches + " inches"
                        + "\nWeight:  " + weight
                        + "\nBMI:  " + BMI
                    + "\nYears College Experiennce:  " + experience
                    + "\n" + injury;
        }
        return "";
    }
}
