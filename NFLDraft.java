/**
 * Program: NFL Draft Final Project 
 * File: NFLDraft.java 
 * Summary: Generates players for a simulated NFL draft
 * Author: Evan W Wilson 
 * Date: November 19, 2017
 **/
package NFLDraft;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class NFLDraft extends Application {

    @Override
    public void start(Stage primaryStage) {

        //instantiate Manager createPlayers method
        Manager manager = new Manager();
        manager.createPlayers(20);

        //create listView nodes
        ListView<String> draftedPlayers = new ListView();
        ListView<String> blackListedPlayers = new ListView();
        ListView<String> statsListView = new ListView();
        ListView<String> availablePlayers = new ListView();
        
        //populate availablePlayers with player names and positions only
        for (String playerName : manager.playerNames) {
            availablePlayers.getItems().add(playerName);
        }

        //observable list for getting selected index value
        ObservableList index1 = availablePlayers.getSelectionModel().getSelectedIndices();

        //create button nodes and actions
        Button stats = new Button();
        stats.setText("VIEW STATS");
        stats.setOnAction(e -> {
            //if statsListView is not empty, it empties data before adding new data
            if (!statsListView.getItems().isEmpty()) {
                statsListView.getItems().remove(0);
            }
            statsListView.getItems().add(manager.availablePlayers.get(indexToInt(index1)).toString());
        });

        Button draft = new Button();
        draft.setText("DRAFT");
        draft.setOnAction(e -> {
            if (!statsListView.getItems().isEmpty()) {
                statsListView.getItems().remove(0);
            }
            draftedPlayers.getItems().add(availablePlayers.getSelectionModel().getSelectedItem());
            availablePlayers.getItems().remove(availablePlayers.getSelectionModel().getSelectedItem());
            manager.availablePlayers.remove(availablePlayers.getSelectionModel().getSelectedIndex());
        });

        Button blackList = new Button();
        blackList.setText("BLACKLIST");
        blackList.setOnAction(e -> {
            if (!statsListView.getItems().isEmpty()) {
                statsListView.getItems().remove(0);
            }
            blackListedPlayers.getItems().add(availablePlayers.getSelectionModel().getSelectedItem());
            availablePlayers.getItems().remove(availablePlayers.getSelectionModel().getSelectedItem());
            manager.availablePlayers.remove(availablePlayers.getSelectionModel().getSelectedIndex());
        });

        Button quit = new Button();
        quit.setText("QUIT");
        quit.setOnAction(e -> primaryStage.close());

        //create labels
        Label statsLabel = new Label("Player Stats");
        statsLabel.setFont(javafx.scene.text.Font.font("Times New Roman", FontWeight.BOLD, 14));

        Label blackListedLabel = new Label("Black Listed Players");
        blackListedLabel.setFont(javafx.scene.text.Font.font("Times New Roman", FontWeight.BOLD, 14));

        Label drafted = new Label("Drafted Players");
        drafted.setFont(javafx.scene.text.Font.font("Times New Roman", FontWeight.BOLD, 14));
        
        Label available = new Label("Available Players");
        available.setFont(javafx.scene.text.Font.font("Times New Roman", FontWeight.BOLD, 14));

        //root BorderPane
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(10, 10, 10, 10));

        //Vbox for left BorderPane
        VBox left = new VBox(20);        
        left.getChildren().addAll(available, availablePlayers);

        //BorderPane for center of BorderPane
        BorderPane center = new BorderPane();

        //vbox for stats
        VBox centerLeft = new VBox(20);
        centerLeft.getChildren().addAll(statsLabel, statsListView);

        //vbox for blackList
        VBox centerRight = new VBox(20);
        centerRight.getChildren().addAll(blackListedLabel, blackListedPlayers);
        
        //vbox for center buttons
        VBox centerButtons = new VBox(40);
        centerButtons.setAlignment(Pos.CENTER);
        center.setPadding(new Insets(40));
        centerButtons.getChildren().addAll(stats, blackList, draft, quit);
        center.setCenter(centerButtons);

        center.setPadding(new Insets(20, 20, 20, 20));
        center.setLeft(centerLeft);
        center.setRight(centerRight);

        //VBox for right of BorderPane
        VBox right = new VBox(20);
        right.getChildren().addAll(drafted, draftedPlayers);

        //HBox for NFL draft image
        HBox top = new HBox();
        Image NFLImage = new Image("image/nfl draft.png");
        ImageView NFLImageView = new ImageView(NFLImage);
        top.setAlignment(Pos.CENTER);
        top.getChildren().add(NFLImageView);

        //sets layouts on the root pane
        root.setLeft(left);
        root.setTop(top);
        root.setCenter(center);
        root.setRight(right);

        //creates the scene
        Scene scene = new Scene(root);

        //displays primaryStage maximized to the user
        primaryStage.setMaximized(true);
        primaryStage.setTitle("NFL Draft: Interactive Selection Aid Tool -- Designed by Evan Wilson");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //converts ObservableList index to usable integer value to reference index of NFL Players
    private int indexToInt(ObservableList index) {
        String string = index.toString();
        int int1;

        switch (string) {
            case "[0]":
                int1 = 0;
                return int1;
            case "[1]":
                int1 = 1;
                return int1;
            case "[2]":
                int1 = 2;
                return int1;
            case "[3]":
                int1 = 3;
                return int1;
            case "[4]":
                int1 = 4;
                return int1;
            case "[5]":
                int1 = 5;
                return int1;
            case "[6]":
                int1 = 6;
                return int1;
            case "[7]":
                int1 = 7;
                return int1;
            case "[8]":
                int1 = 8;
                return int1;
            case "[9]":
                int1 = 9;
                return int1;
            case "[10]":
                int1 = 10;
                return int1;
            case "[11]":
                int1 = 11;
                return int1;
            case "[12]":
                int1 = 12;
                return int1;
            case "[13]":
                int1 = 14;
                return int1;
            case "[14]":
                int1 = 14;
                return int1;
            case "[15]":
                int1 = 15;
                return int1;
            case "[16]":
                int1 = 16;
                return int1;
            case "[17]":
                int1 = 17;
                return int1;
            case "[18]":
                int1 = 18;
                return int1;
            case "[19]":
                int1 = 19;
                return int1;
            default:
                break;
        }
        return -1;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
