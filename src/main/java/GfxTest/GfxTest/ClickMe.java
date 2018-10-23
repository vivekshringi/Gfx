package GfxTest.GfxTest;

import java.util.Calendar;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ClickMe extends Application {
	Button btn;
	Button close;
	Button time;
	Scene scene2;
	Stage stage;
	public static void main(String[] args) {
		System.out.print("Starting");
		launch(args);
		System.out.print("Stoping");
	}
	@Override public void start(Stage primaryStage) {
		stage=primaryStage;
		btn = new Button("Click Me Please");
		btn.setOnAction(e->buttonClick());
		close = new Button("Close");
		time = new Button("Time");
		time.setOnAction(e->buttonClick());
		close.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent e) {
				primaryStage.close();
			}
			
		});
		BorderPane p = new BorderPane();
		p.setCenter(btn);
		BorderPane.setAlignment(close, Pos.CENTER);
		p.setBottom(close);
		Scene scene = new Scene(p,300,300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("ClickMe");
		System.out.println(primaryStage.getMaxHeight());
		primaryStage.show();
	
		BorderPane p1 = new BorderPane();
		p1.setCenter(time);
	    scene2 = new Scene(p1, 300, 300);
		
	}
	
	public void buttonClick() {
		if(btn.getText() == "Click Me Please") {
			stage.setScene(scene2);
		}
		if(time.getText()=="Time") {
			Calendar c = Calendar.getInstance();
			time.setText(String.format("%tT", c));
		}
		else {
			btn.setText("Click Me Please");
		}
	}
	
	
}
