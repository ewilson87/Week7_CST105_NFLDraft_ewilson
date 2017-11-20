/**
 * Program: NFL Draft Final 
 * Project - NFL Player class 
 * File: NFLPlayer.java
 * Summary: The NFL Player class for the project. 
 * Author: Evan W Wilson 
 * Date: November 19, 2017
 **/
package NFLDraft;

public class DefensivePlayer extends NFLPlayer {
    
    String defensePosition;
    int tackles;
    int sacks;
    int forcedFumbles;
    int interceptions;
    
    public DefensivePlayer(){

    }
    
    public DefensivePlayer(String Team, String position, int tackles, int sacks, int forcedFumbles, int interceptions){
    
    }
    
    //following methods set and get all variables

        
    public void setDefensePosition(String p) {
        this.defensePosition = p;
    }

    public String getDefensePosition() {
        return defensePosition;
    }

    public void setTackles(int t) {
        this.tackles = t;
    }

    public int getTackles() {
        return tackles;
    }

    public void setSacks(int s) {
        this.sacks = s;
    }

    public int getSacks() {
        return sacks;
    }

    public void setForcedFumbles(int f) {
        this.forcedFumbles = f;
    }

    public int getForcedFumbles() {
        return forcedFumbles;
    }
    
    public void setInterceptions(int i) {
        this.interceptions = i;
    }

    public int getInterceptions() {
        return interceptions;
    }
    
    @Override
        public String toString() {

        //converts height into feet/inches
        int feet = height / 12;
        int inches = height % 12;

       
        return "Name:  " + firstName + " " + lastName
                + "\nTeam:  " + team
                + "\nPosition:  " + defensePosition
                + "\nCollege:  " + college
                + "\n40 Yard Dash Time:  " + dash40
                + "\nAge:  " + age
                + "\nHeight:  " + feet + " foot " + inches + " inches"
                + "\nWeight:  " + weight
                + "\nBMI:  " + BMI
                + "\nYears College Experiennce:  " + experience
                + "\n" + injury
                + "\nTackles This Year:  " + tackles
                + "\nSacks This Year:  " + sacks
                + "\nForced Fumbles This Year:  " + forcedFumbles
                + "\nInterceptions This Year:  " + interceptions;
    }
    
}
