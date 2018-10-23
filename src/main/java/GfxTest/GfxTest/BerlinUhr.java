package GfxTest.GfxTest;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class BerlinUhr extends Application {

	Timer timer = new Timer();
	Scene mengenlehreuhrScene;
	Stage stage;
	Label lblTime = new Label();

	Button five1;
	Button five2;
	Button five3;
	Button five4;
	Button one1;
	Button one2;
	Button one3;
	Button one4;
	Button fiveMinute1;
	Button fiveMinute2;
	Button fiveMinute3;
	Button fiveMinute4;
	Button fiveMinute5;
	Button fiveMinute6;
	Button fiveMinute7;
	Button fiveMinute8;
	Button fiveMinute9;
	Button fiveMinute10;
	Button fiveMinute11;

	Button oneMinute1;
	Button oneMinute2;
	Button oneMinute3;
	Button oneMinute4;
	int Width = 440 ;
	int Height= 400 ;
	int Width11 = Width/22;
	int Height11 = Height/11;
	int radius = 30;
	int Width4 = Width/7;
	int Height4 = Height/16;
	Label titleUhr;
	Circle circle;

	@Override
	public void start(Stage primaryStage) {
		stage = primaryStage;
		titleUhr = new Label("Mengenlehreuhr");
		titleUhr.setPadding(new Insets(10,50,50,50));
		titleUhr.setStyle("-fx-font-weight: bold; -fx-font-size: 20px;");

		circle = new Circle();
		circle.setRadius(radius);
		circle.setStroke(javafx.scene.paint.Color.BLACK);
		circle.setStrokeWidth(2);
		HBox h = new HBox(circle);
		h.setAlignment(Pos.CENTER);
	
      
		five1 = new Button();
		five1.setPrefHeight(Height4);
		five1.setPrefWidth(Width4);
		five2 = new Button();
		five2.setPrefHeight(Height4);
		five2.setPrefWidth(Width4);
		five3 = new Button();
		five3.setPrefHeight(Height4);
		five3.setPrefWidth(Width4);
		five4 = new Button();
		five4.setPrefHeight(Height4);
		five4.setPrefWidth(Width4);
		HBox fiveHourRow = new HBox(five1, five2, five3, five4);
		fiveHourRow.setPadding(new Insets(5,0,5,0));
		fiveHourRow.setAlignment(Pos.CENTER);


		one1 = new Button();
		one1.setPrefHeight(Height4);
		one1.setPrefWidth(Width4);
		one2 = new Button();
		one2.setPrefHeight(Height4);
		one2.setPrefWidth(Width4);
		one3 = new Button();
		one3.setPrefHeight(Height4);
		one3.setPrefWidth(Width4);
		one4 = new Button();
		one4.setPrefHeight(Height4);
		one4.setPrefWidth(Width4);
		HBox oneHourRow = new HBox(one1, one2, one3, one4);
		oneHourRow.setAlignment(Pos.CENTER);

		fiveMinute1 = new Button();
		fiveMinute1.setPrefWidth(Width11);
		fiveMinute1.setPrefHeight(Height11);
		fiveMinute2 = new Button();
		fiveMinute2.setPrefWidth(Width11);
		fiveMinute2.setPrefHeight(Height11);
		fiveMinute3 = new Button();
		fiveMinute3.setPrefWidth(Width11);
		fiveMinute3.setPrefHeight(Height11);
		fiveMinute4 = new Button();
		fiveMinute4.setPrefWidth(Width11);
		fiveMinute4.setPrefHeight(Height11);
		fiveMinute5 = new Button();
		fiveMinute5.setPrefWidth(Width11);
		fiveMinute5.setPrefHeight(Height11);
		fiveMinute6 = new Button();
		fiveMinute6.setPrefWidth(Width11);
		fiveMinute6.setPrefHeight(Height11);
		fiveMinute7 = new Button();
		fiveMinute7.setPrefWidth(Width11);
		fiveMinute7.setPrefHeight(Height11);
		fiveMinute8 = new Button();
		fiveMinute8.setPrefWidth(Width11);
		fiveMinute8.setPrefHeight(Height11);
		fiveMinute9 = new Button();
		fiveMinute9.setPrefWidth(Width11);
		fiveMinute9.setPrefHeight(Height11);
		fiveMinute10 = new Button();
		fiveMinute10.setPrefWidth(Width11);
		fiveMinute10.setPrefHeight(Height11);
		fiveMinute11 = new Button();
		fiveMinute11.setPrefWidth(Width11);
		fiveMinute11.setPrefHeight(Height11);
		HBox fiveMinuteRow = new HBox(fiveMinute1, fiveMinute2, fiveMinute3, fiveMinute4, fiveMinute5, fiveMinute6,
				fiveMinute7, fiveMinute8, fiveMinute9, fiveMinute10, fiveMinute11);
		fiveMinuteRow.setPadding(new Insets(5,0,5,0));
		fiveMinuteRow.setAlignment(Pos.CENTER);

		oneMinute1 = new Button();
		oneMinute1.setPrefHeight(Height4);
		oneMinute1.setPrefWidth(Width4);
		oneMinute2 = new Button();
		oneMinute2.setPrefHeight(Height4);
		oneMinute2.setPrefWidth(Width4);
		oneMinute3 = new Button();
		oneMinute3.setPrefHeight(Height4);
		oneMinute3.setPrefWidth(Width4);
		oneMinute4 = new Button();
		oneMinute4.setPrefHeight(Height4);
		oneMinute4.setPrefWidth(Width4);
		HBox oneMinuteRow = new HBox(oneMinute1, oneMinute2, oneMinute3, oneMinute4);
		oneMinuteRow.setAlignment(Pos.CENTER);
		lblTime.setPadding(new Insets(20,20,20,20));
		VBox finalUhr = new VBox(titleUhr,h, fiveHourRow, oneHourRow, fiveMinuteRow, oneMinuteRow,lblTime);
		finalUhr.setAlignment(Pos.CENTER);
		
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(finalUhr);

		mengenlehreuhrScene = new Scene(borderPane, Height, Width);
		mengenlehreuhrScene.getStylesheets().add(Test2.class.getResource("berlinUhr.css").toExternalForm());
		stage.setScene(mengenlehreuhrScene);
		stage.show();
		
		class RemindTask extends TimerTask {
			public void run() {
				Platform.runLater(() -> {
					Calendar c = Calendar.getInstance();
					lblTime.setText(String.format("%tT", c));
					lblTime.setStyle("-fx-font-weight: bold; -fx-font-size: 40px;");
					String time = String.format("%tT", c);
					int hour = Integer.parseInt(time.substring(0, 2));
					int minutes = Integer.parseInt(time.substring(3, 5));
					int seconds = Integer.parseInt(time.substring(6, 8));
					int rowHour5;
					int rowLastHours = 0;
					int rowMinutes5 = 0;
					int rowLastMinutes = 0;
					boolean secondCircle;
					rowHour5 = hour / 5;
					rowLastHours = hour % 5;
					rowMinutes5 = minutes / 5;
					rowLastMinutes = minutes % 5;
					secondCircle = (seconds % 2 == 0);
					
					String red = "#FF0000";
					String orange = "#FFFF00";
					if(secondCircle) {
						circle.setFill(javafx.scene.paint.Color.YELLOW);
					}
					else	
					{
						circle.setFill(javafx.scene.paint.Color.AZURE);
					}
					fillColor(five1, getSequence(rowHour5, 4,0), red);
					fillColor(five2, getSequence(rowHour5, 4,1), red);
					fillColor(five3, getSequence(rowHour5, 4,2), red);
					fillColor(five4, getSequence(rowHour5, 4,3), red);
					fillColor(one1, getSequence(rowLastHours, 4,0), red);
					fillColor(one2, getSequence(rowLastHours, 4,1), red);
					fillColor(one3, getSequence(rowLastHours, 4,2), red);
					fillColor(one4, getSequence(rowLastHours, 4,3), red);
					fillColor(fiveMinute1, getSequence(rowMinutes5, 11,0), orange);
					fillColor(fiveMinute2, getSequence(rowMinutes5, 11,1), orange);
					fillColor(fiveMinute3, getSequence(rowMinutes5, 11,2), red);
					fillColor(fiveMinute4, getSequence(rowMinutes5, 11,3), orange);
					fillColor(fiveMinute5, getSequence(rowMinutes5, 11,4), orange);
					fillColor(fiveMinute6, getSequence(rowMinutes5, 11,5), red);
					fillColor(fiveMinute7, getSequence(rowMinutes5, 11,6), orange);
					fillColor(fiveMinute8, getSequence(rowMinutes5, 11,7), orange);
					fillColor(fiveMinute9, getSequence(rowMinutes5, 11,8), red);
					fillColor(fiveMinute10, getSequence(rowMinutes5, 11,9), orange);
					fillColor(fiveMinute11, getSequence(rowMinutes5, 11,10), orange);
					fillColor(oneMinute1, getSequence(rowLastMinutes, 4,0), orange);
					fillColor(oneMinute2, getSequence(rowLastMinutes, 4,1), orange);
					fillColor(oneMinute3, getSequence(rowLastMinutes, 4,2), orange);
					fillColor(oneMinute4, getSequence(rowLastMinutes, 4,3), orange);

				});
			}
		}

		timer.schedule(new RemindTask(), 0, 1 * 1000);
		
	}

	@Override
	public void stop() {
		timer.cancel();
		stage.close();
	}

	public static void main(String[] args) {
		launch(args);
	}


	private String getSequence(int value, int size, int index) {
		String a = "";
		for (int i = 0; i < size; i++) {
			if (i < value) {
				a += "1";
			} else {
				a += "0";
			}
		}
		return a.substring(index, index+1);
	}

	private void fillColor(Button b, String s, String color) {
		if (s.equals("1")) {
			b.setStyle("-fx-background-color:" + color+";-fx-border-color: black;-fx-border-width: 2px;");
		}
		else {
			b.setStyle("-fx-background-color:white;-fx-border-color: black;-fx-border-width: 2px;");
		}
	}

}
