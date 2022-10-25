import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/*
Stage : Top Level, can be multiple
        Contains a Scene, scenes can be swapped with others
Scene : Contains Root Node
Root Node : Contains all other nodes
*/

public class JavaFXMain extends Application {
    
    //STAGES
    /*
    App's window
    Notable Properties :
    - Title
    - Scene in the stage
    */
    @Override
    public void start(Stage primaryStage) {
        //remove code from here 
	Button btn = new Button(); //INSTANTIATE NODE
        Button btn1 = new Button();


        //ROOT NODES
        //Nodes need to be added to a ROOT NODE OF ALL NODES
        //1. Group : Root node with no preset
        //2. ***Pane : Root node with preset layouts, restricts moving nodes manualy and clicking and dragging. 
        //EX : StackPane root
        /*
        Stacks all nodes on top of each other (layers).
        */
        //OTHERS : AnchorPane, BorderPane, ect
        
        //O> You can add Panes and Groups inside themselves
        Group root = new Group(); 
        StackPane root2 = new StackPane();
        HBox bar = new HBox();
        for(int x = 1; x <= 3; x++){
            Button temp = new Button("UI " + x);
            bar.getChildren().add(temp);
        }
        root.getChildren().add(btn); //Adds "btn" node to root
        root.getChildren().add(bar);
        bar.setLayoutY(200);
        root2.getChildren().addAll(btn1); //Add multiple nodes at the same time
        
        //SCENE
        /*
        1. Container for all contents in JavaFX Scene Graph
        2. Properties : - Size
                        - Background color/image
                        - Cursor Info : Mouse events and cursor properties
        */
        Scene scene = new Scene(root, 300, 250);
        Scene scene2 = new Scene(root2, 100, 300);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        btn.setText("Change Scene");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Scene Changed!");
                primaryStage.setScene(scene2);
            }
            
        });
        btn1.setText("Return");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Returns to main scene!");
                primaryStage.setScene(scene);
            }
            
        });
	//to here to add your own code
    }

    public static void main(String[] args) {
        launch(args);
    }
}
