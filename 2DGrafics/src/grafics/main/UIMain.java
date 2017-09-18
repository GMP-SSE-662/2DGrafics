package grafics.main;


import grafics.popup.CirclePopup;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

@SuppressWarnings("restriction")
public class UIMain extends Application {
    
    @Override
    public void start(Stage primaryStage) {
    	GridPane grid = new GridPane();
    	Canvas canvas = new Canvas(400, 300);
    	final GraphicsContext gc = canvas.getGraphicsContext2D();
    	gc.setFill(Color.SNOW);
    	gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
    	grid.setAlignment(Pos.BOTTOM_CENTER);
    	
        javafx.scene.control.Button btn = new javafx.scene.control.Button();
        btn.setText("Circle");
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
            public void handle(ActionEvent event) {
            	CirclePopup popup = new CirclePopup();
            	Circle c = popup.pop();
            	gc.strokeOval(c.getCenterX(),
            			c.getCenterY(),
            			c.getRadius(),
            			c.getRadius());
            	
            }
        });
        javafx.scene.control.Button btn2 = new javafx.scene.control.Button();
        btn2.setText("Square");
        btn2.setOnAction(new EventHandler<ActionEvent>() {
 
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        javafx.scene.control.Button btn3 = new javafx.scene.control.Button();
        btn3.setText("Triangle");
        btn3.setOnAction(new EventHandler<ActionEvent>() {
 
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        javafx.scene.control.Button btn4 = new javafx.scene.control.Button();
        btn4.setText("Line");
        btn4.setOnAction(new EventHandler<ActionEvent>() {
 
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        grid.add(canvas, 0,0,4,1);
        grid.add(btn,0,1);
        grid.add(btn2, 1, 1);
        grid.add(btn3, 2, 1);
        grid.add(btn4, 3, 1);
        
        Scene scene = new Scene(grid, 400, 330);

        primaryStage.setTitle("Canvas");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
 public static void main(String[] args) {
        launch(args);
    }
}