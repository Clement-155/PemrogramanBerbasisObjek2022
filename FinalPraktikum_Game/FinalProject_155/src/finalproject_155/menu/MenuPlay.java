/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalproject_155.menu;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Christopher Clement
 */
public class MenuPlay extends Application {


    @Override
    public void start(Stage primaryStage) {
        
        //Inisialisasi scene utama
        Button play = new Button("Play");
        Button highScr = new Button("High Scores");
        Button exit = new Button("Exit");
        //Fungsi button
        exit.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                System.exit(0);
                
            }
            
        });
        
        VBox buttons = new VBox(play, highScr, exit);
        BorderPane root = new BorderPane();
        root.setCenter(buttons);
        buttons.setAlignment(Pos.CENTER);
        Scene mainScene = new Scene(root);
        primaryStage.setScene(mainScene);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }//end method main
    
}
