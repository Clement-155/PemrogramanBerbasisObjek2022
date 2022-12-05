/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalproject_155.menu;


import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Christopher Clement
 */
public class MenuHighScr {
    
    Scene back;
    
    public class Entry {

        private String Name = null;
        private Integer Score = null;

        public Entry(String Name, Integer Score) {
            this.Name = Name;
            this.Score = Score;
        }
        /**
         * @return the Name
         */
        public String getName() {
            return Name;
        }

        /**
         * @param Name the Name to set
         */
        public void setName(String Name) {
            this.Name = Name;
        }

        /**
         * @return the Score
         */
        public Integer getScore() {
            return Score;
        }

        /**
         * @param Score the Score to set
         */
        public void setScore(Integer Score) {
            this.Score = Score;
        }


    }

        
    public Scene create(Stage stage, Scene back){
        
        BorderPane bp = new BorderPane();
        Text title = new Text("High Scores");
        TableView<Entry> tableView = new TableView<Entry>();
        Button rtr = new Button("Return");
        bp.setTop(title);
        bp.setCenter(tableView);
        bp.setBottom(rtr);
        /*---------------------------------*/
        /*---------------------------------*/
        //Membuat dan membaca data highscore
        TableColumn<Entry, String> firstColumn = 
            new TableColumn<>("Name");
        firstColumn.setCellValueFactory(
            new PropertyValueFactory<>("Name"));

        TableColumn<Entry, Integer> lastColumn = 
            new TableColumn<>("Score");
        lastColumn.setCellValueFactory(
            new PropertyValueFactory<>("Score"));
        
        tableView.getColumns().add(firstColumn);
        tableView.getColumns().add(lastColumn);
        
        tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        
        lastColumn.setSortType(TableColumn.SortType.DESCENDING);
        tableView.getSortOrder().add(lastColumn);
        
        /*---------------------------------*/
        String line = "";
        String input[];
        Path path = Paths.get("HighScore.txt");
        System.out.println(path);
        try{
            BufferedReader fileInput = Files.newBufferedReader(path);
            line = fileInput.readLine();
            while (line != null) {
                input = line.split("-");
                tableView.getItems().add(new Entry(input[0], Integer.valueOf(input[1])));
                line = fileInput.readLine();
            }
            tableView.sort();
        }catch(IOException io){
            System.out.println("File location error!!");
            System.exit(1);
        }
        
        /*---------------------------------*/
        /*---------------------------------*/
        Scene scene = new Scene(bp);
        rtr.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                stage.setScene(back);

            }
            
        });
            

        
        return scene;
        
    }
    
}
