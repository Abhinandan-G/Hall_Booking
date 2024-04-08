package application;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Audi_avail2 {
	 private DatePicker checkInDatePicker;
	 
	 private Stage p;
	 
	 public void goback() {
		 Faculty_selection_page ci = new Faculty_selection_page();
	        Scene scene = ci.getScene(p);

	        // set new title
	        p.setTitle("Selection Page");

	        // change the scene on the stage
	        p.setScene(scene);
	}
	 
	 public Scene getScene(Stage p) {
		 
		 this.p=p;
		 
	    	Text t = new Text("Hall availability");
	    	t.setFill(Color.BLACK);
	        t.setStroke(Color.GREEN);
	        t.setStrokeWidth(1);
	        t.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 30));
	    
	        Label l1 = new Label("Date of the event :");
	        Label l2 = new Label("Start Period :");
	        Label l3 = new Label("End Period :");
	        Label l4 = new Label("Choose hall :");
	        
			final Label lblMessage = new Label();
	        
	        Button btn1 = new Button("Check");
	        btn1.setTextFill(Color.WHITE);
	        btn1.setStyle("-fx-background-color: #47AB11");
	        
	        Button btn2 = new Button("Back");
	        btn2.setTextFill(Color.WHITE);
	        btn2.setStyle("-fx-background-color: GREY");
	        
	        btn2.setOnAction(new EventHandler<ActionEvent>(){
	            public void handle(ActionEvent event) {
	            	goback();
	            }
	        });
	        
	        btn1.setOnAction(new EventHandler<ActionEvent>(){
	            public void handle(ActionEvent event) {
	            	lblMessage.setText("AVAILABLE");
	           	 	lblMessage.setTextFill(Color.GREEN);
	            }
	        });
	        
	        TextField tf1=new TextField();
	    	TextField tf2=new TextField();
	    	tf1.setPromptText("Start period");
	    	tf2.setPromptText("End period");
	    	
	        String hall[] = {"Convention center","Maharaja Auditorium","Sir C V Raman Hall"};
	    	ComboBox<String> cb1 = new ComboBox<String>(FXCollections.observableArrayList(hall));
	        checkInDatePicker = new DatePicker();
	        
	        GridPane grid=new GridPane();
	        BorderPane bp = new BorderPane();
	        
	        grid.add(t, 0, 0);
	        grid.add(l1, 0, 1);
	        grid.add(l2, 0, 2);
	        grid.add(l3, 0, 3);
	        grid.add(l4, 0, 4);
	        grid.add(checkInDatePicker, 1, 1);
	        grid.add(cb1, 1, 4);
	        grid.add(tf1, 1, 2);
	        grid.add(tf2, 1, 3);
	        grid.add(lblMessage, 1, 8);
	        grid.setAlignment(Pos.CENTER);
	        
	        HBox hb1 = new HBox(10);
	        hb1.getChildren().addAll(btn2,btn1);
	        grid.add(hb1, 1, 6);
	        grid.setVgap(10);
	        grid.setHgap(10);
	        
	        VBox vb = new VBox();
	        vb.getChildren().addAll(t, grid);
	        vb.setAlignment(Pos.CENTER);
	        vb.setSpacing(10);
	        
	        bp.setCenter(vb);
	        bp.setAlignment(vb, Pos.TOP_CENTER);
	        
	        Scene s1 = new Scene(bp,500,500);
	        
	        return s1;
	    }
}
