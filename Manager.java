/**
 * Program: NFL Draft Final Project - NFL Manager class
 * File: Manager.java 
 * Summary: The NFL Player manager class for the project.
 * Author: Evan W Wilson 
 * Date: November 19, 2017
 **/

package NFLDraft;

import java.util.ArrayList;
import java.util.Random;

public class Manager {

    //declare and initialize ArrayList<>
    ArrayList<NFLPlayer> availablePlayers = new ArrayList<>();

    //ArrayList for storing names in same Array position as availablePlayers
    ArrayList<String> playerNames = new ArrayList<>();

    //Method to create players based on int x constructor
    public void createPlayers(int howMany) {
        for (int cnt = 0; cnt < howMany; cnt++) {

            //creates new NFLPlayers
            DefensivePlayer defense = new DefensivePlayer();
            OffensivePlayer offense = new OffensivePlayer();

            //creates 50% chance of offense or defense player
            Random random = new Random();
            int offenseOrDefense = random.nextInt(2);
            if (offenseOrDefense == 0) {
                defense.setTeam("Defense");
            } else {
                offense.setTeam("Offense");
            }

            //sets random first name
            String[] randomFirstNames = new String[]{"Billy", "Javier", "Archie", "Buck", "Neville", "Doyle", "Christopher", "Harrison", "Ernie", "Marcus", "Aaron", "Abraham", "Adam", "Caleb", "Conrad", "Kyle", "Kenneth", "Paul", "Santiago"};
            String randomFirstName = randomFirstNames[(int) (Math.random() * randomFirstNames.length)];
            if (offenseOrDefense == 0) {
                defense.setFirstName(randomFirstName);
            }
            offense.setFirstName(randomFirstName);

            //sets random last name
            String[] randomLastNames = new String[]{"Johnson", "Huskins", "Linhart", "Matson", "Madriz", "Newcombe", "Fender", "Brown", "Gleason", "Campo", "Smith", "Hall", "Williams", "Jones", "Miller", "Wilson", "Jenkins", "Wright", "Flores"};
            String randomLastName = randomLastNames[(int) (Math.random() * randomLastNames.length)];
            if (offenseOrDefense == 0) {
                defense.setLastName(randomLastName);
            }
            offense.setLastName(randomLastName);

            //sets random height
            int randomHeight = (int) ((Math.random() * 25) + 60);
            if (offenseOrDefense == 0) {
                defense.setHeight(randomHeight);
            }
            offense.setHeight(randomHeight);

            //sets random weight
            int randomWeight = (int) ((Math.random() * 200) + 160);
            if (offenseOrDefense == 0) {
                defense.setWeight(randomWeight);
            }
            offense.setWeight(randomWeight);

            //sets random age
            int randomAge = (int) (Math.random() * 3) + 20;
            if (offenseOrDefense == 0) {
                defense.setAge(randomAge);
            }
            offense.setAge(randomAge);

            //sets random 40 yard dash time
            double randomDash40 = (((Math.random() * 4) + 4));
            double roundDash40 = Math.round(randomDash40 * 100.0) / 100.0;
            if (offenseOrDefense == 0) {
                defense.setDash40(roundDash40);
            }
            offense.setDash40(roundDash40);

            //sets random college
            String[] randomColleges = new String[]{"Oregon", "Ohio State", "Washington", "Arizona", "Alabama",
                "Penn State", "Iowa State", "Georgia", "Kansas State", "Michigan"};
            String randomCollege = randomColleges[(int) (Math.random() * randomColleges.length)];
            if (offenseOrDefense == 0) {
                defense.setCollege(randomCollege);
            }
            offense.setCollege(randomCollege);

            //creates 20% chance player has a history of injuries
            int randomInjury = (int) (Math.random() * 5);
            if (randomInjury == 0) {
                String injury = "Player has a history of injuries.";
                if (offenseOrDefense == 0) {
                    defense.setInjury(injury);
                }
                offense.setInjury(injury);
            } else {
                String injury = "Player has no history of injuries.";
                if (offenseOrDefense == 0) {
                    defense.setInjury(injury);
                }
                offense.setInjury(injury);
            }

            //sets player college experience
            if (offenseOrDefense == 0) {
                defense.setExperience(randomAge);
            }
            offense.setExperience(randomAge);

            //sets BMI
            if (offenseOrDefense == 0) {
                defense.setBMI(randomWeight, randomHeight);
            }
            offense.setBMI(randomWeight, randomHeight);

            //sets all defense specific variables
            if (offenseOrDefense == 0) {
                //sets random defense position
                String[] randomDefensePositions = new String[]{"Defensive Tackle", "Defensive End", "Line Backer", "Cornerback", "Safety"};
                String defensePosition = randomDefensePositions[(int) Math.floor(Math.random() * randomDefensePositions.length)];
                defense.setDefensePosition(defensePosition);

                int randomTackles = (int) (Math.random() * 50) + 10;
                defense.setTackles(randomTackles);

                int randomSacks = (int) (Math.random() * 20) + 5;
                defense.setSacks(randomSacks);

                int randomForcedFumbles = (int) (Math.random() * 10) + 2;
                defense.setForcedFumbles(randomForcedFumbles);

                int randomInterceptions = (int) (Math.random() * 20) + 5;
                defense.setInterceptions(randomInterceptions);

                if (offenseOrDefense == 0) {
                    playerNames.add(randomFirstName + " " + randomLastName + " - " + defense.getDefensePosition());
                }

                //adds defense player to available players
                availablePlayers.add(defense);
            }

            //sets all offense specific variables
            if (offenseOrDefense == 1) {
                //sets random offense position
                String[] randomOffensePositions = new String[]{"Center", "Offensive Guard", "Offensive Tackle", "Quarterback", "Running Back", "Wide Receiver", "Tight End"};
                String offensePosition = randomOffensePositions[(int) Math.floor(Math.random() * randomOffensePositions.length)];
                offense.setOffensePosition(offensePosition);

                //sets quarterback specific stats
                if ("Quarterback".equals(offensePosition)) {
                    int randomInterceptions = (int) (Math.random() * 10) + 2;
                    offense.setInterceptions(randomInterceptions);

                    int randomPassingYards = (int) (Math.random() * 4000) + 1000;
                    offense.setPassingYards(randomPassingYards);

                    double randomQBRating = (Math.random() * 158.3);
                    randomQBRating = Math.round(randomQBRating * 100.0) / 100.0;
                    offense.setQBRating(randomQBRating);
                }

                //sets running back, wide receiver and tight end specific stats
                if ("Running Back".equals(offensePosition) || "Wide Receiver".equals(offensePosition)
                        || "Tight End".equals(offensePosition)) {
                    int randomReceivingYards = (int) (Math.random() * 2500) + 500;
                    offense.setReceivingYards(randomReceivingYards);
                }

                int randomRushingYards = (int) (Math.random() * 2000) + 200;
                offense.setRushingYards(randomRushingYards);

                int randomFumbles = (int) (Math.random() * 10);
                offense.setFumbles(randomFumbles);

                int randomTouchdowns = (int) (Math.random() * 50) + 10;
                offense.setTouchdowns(randomTouchdowns);

                if (offenseOrDefense == 1) {
                    playerNames.add(randomFirstName + " " + randomLastName + " - " + offense.getOffensePosition());
                }

                //adds offense player to availablePlayers
                availablePlayers.add(offense);
            }
        }
    }

    //method to print all players using NFLPlayer class toString()
    public void printAllPlayers() {
        printOffense();
        printDefense();
    }

    //method to print specific player using NFLPlayer class toString()
    public String printSpecificPlayer(int whichPlayerIndex) {
        NFLPlayer playerX = availablePlayers.get(whichPlayerIndex);
        String string = playerX.toString();
        System.out.println(playerX);
        System.out.println("----------------------------------");
        return string;
    }

    public void printDefense() {
        for (NFLPlayer availablePlayer : availablePlayers) {
            if (availablePlayer.toString().contains("Defense")) {
                System.out.println(availablePlayer);
                System.out.println("----------------------------------");
            }

        }
    }

    public void printOffense() {

        for (NFLPlayer availablePlayer : availablePlayers) {
            if (availablePlayer.toString().contains("Offense")) {
                System.out.println(availablePlayer);
                System.out.println("----------------------------------");
            }

        }
    }

    public void printNames(int whichPlayerIndex) {
        System.out.println(playerNames.get(whichPlayerIndex));
    }

    public void printNames() {
        int i;
        for (i = 0; i < playerNames.size(); i++) {
            String name = playerNames.get(i);
            System.out.println(name);
        }
    }

}
