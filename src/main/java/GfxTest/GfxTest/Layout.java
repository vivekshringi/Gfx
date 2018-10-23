package GfxTest.GfxTest;

import java.util.Calendar;

import com.sun.java.swing.plaf.gtk.GTKConstants.Orientation;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Layout extends Application {
	TextField btn1;
	Button btn2;
	Button btn3;
	Button btn4;
	Button switchBtn;
	Button btn5;
	Button btn6;
	Button btn7;
	Button btn8;
	Button btn9;
	Button btn10;
	Button btn11;
	Button btn12;
	Button btn13;
	Button btn14;
	Button btn15;
	Button btn16;
	Button btn17;
	WeatherInfo w;
	Scene sceneHBox;
	Scene sceneVBox;
	Scene sceneFlowPane;
	Scene sceneBorderPane;

	Stage stage;

	public static void main(String[] args) {
		System.out.print("Starting");
		launch(args);
		System.out.print("Stoping");
	}

	@Override
	public void start(Stage primaryStage) {
		w = new WeatherInfo();
		stage = primaryStage;
		btn1 = new TextField();
		btn1.setPromptText("Enter city");
		btn2 = new Button("Submit");
		btn3 = new Button("Clear");
		btn4 = new Button("Time");
		
		btn4.setMinWidth(100);
		btn3.setMinWidth(100);
		btn2.setMinWidth(100);
		btn1.setMinWidth(200);
		
		switchBtn = new Button("VBox");

		btn5 = new Button("Button Five");
		btn6 = new Button("Button Six");
		btn7 = new Button("Button Seven");
		btn8 = new Button("FlowPane");

		btn9 = new Button("Button Nine");
		btn10 = new Button("Button Ten");
		btn11 = new Button("Button Eleven");
		btn12 = new Button("Border Pane");

		btn13 = new Button("Button Thirteen");
		btn14 = new Button("Button Fourteen");
		btn15 = new Button("Switch to Hbox");
		btn16 = new Button("Button Sixteen");
		btn17 = new Button("Button Seventeen");
		Region spacer = new Region();

		btn1.setMaxWidth(Double.MAX_VALUE);
		btn2.setMaxWidth(Double.MAX_VALUE);
		btn3.setMaxWidth(Double.MAX_VALUE);
		btn4.setMaxWidth(Double.MAX_VALUE);
		btn5.setMaxWidth(Double.MAX_VALUE);
		btn6.setMaxWidth(Double.MAX_VALUE);
		btn7.setMaxWidth(Double.MAX_VALUE);
		btn8.setMaxWidth(Double.MAX_VALUE);
		btn9.setMaxWidth(Double.MAX_VALUE);
		btn10.setMaxWidth(Double.MAX_VALUE);
		btn11.setMaxWidth(Double.MAX_VALUE);
		btn12.setMaxWidth(Double.MAX_VALUE);
		btn13.setMaxWidth(Double.MAX_VALUE);
		btn14.setMaxWidth(Double.MAX_VALUE);
		btn15.setMaxWidth(Double.MAX_VALUE);
		btn16.setMaxWidth(Double.MAX_VALUE);
		// Hbox
		HBox hBox = new HBox(50, btn1, btn2, btn3, btn4, switchBtn);
		hBox.setPadding(new Insets(10, 10, 10, 10));
		HBox.setMargin(btn1, new Insets(10));
		HBox.setMargin(btn2, new Insets(10));
		HBox.setMargin(btn3, new Insets(10));
		HBox.setMargin(btn4, new Insets(10));
		HBox.setMargin(switchBtn, new Insets(10));
		//HBox.setHgrow(btn4, Priority.ALWAYS);
		//HBox.setHgrow(btn1, Priority.ALWAYS);
		//hBox.setSpacing(10);

		HBox.setHgrow(spacer, Priority.NEVER);
		// hBox.getChildren().addAll( btn1,spacer, btn2, btn3, btn4, switchBtn);
		sceneHBox = new Scene(hBox);
		stage.setScene(sceneHBox);
		stage.setTitle("ClickMe");
		stage.show();
		switchBtn.setOnAction(e -> buttonClickSwitchButton());
		btn2.setOnAction(e -> buttonClickSubmitButton());
		btn3.setOnAction(e -> buttonClickClearButton());
		VBox vBox = new VBox(10);
		VBox.setVgrow(btn5, Priority.ALWAYS);
		vBox.setPadding(new Insets(10, 10, 10, 10));
		VBox.setMargin(btn5, new Insets(10));
		VBox.setMargin(btn6, new Insets(10));
		VBox.setMargin(btn7, new Insets(10));
		VBox.setMargin(btn8, new Insets(10));
		vBox.getChildren().addAll(btn5, btn6, btn7, btn8);
		sceneVBox = new Scene(vBox);
		btn8.setOnAction(e -> buttonClickButton8());

		FlowPane flowPane = new FlowPane(50, 50, btn9, btn10, btn11, btn12);
		flowPane.setPadding(new Insets(10, 10, 10, 10));
		FlowPane.setMargin(btn9, new Insets(10));
		FlowPane.setMargin(btn10, new Insets(10));
		FlowPane.setMargin(btn11, new Insets(10));
		FlowPane.setMargin(btn12, new Insets(10));
		flowPane.setAlignment(Pos.CENTER);
		// flowPane.setPrefWrapLength(800);
		// FlowPane.setOrientation(Orientation.HORIZONTAL);
		// flowPane.getChildren().addAll(btn9, btn10, btn11, btn12);
		sceneFlowPane = new Scene(flowPane);
		btn12.setOnAction(e -> buttonClickButton12());

		BorderPane borderPane = new BorderPane(btn15, btn14, btn13, btn16, btn17);
		borderPane.setPadding(new Insets(10, 10, 10, 10));
		BorderPane.setMargin(btn13, new Insets(10));
		BorderPane.setMargin(btn14, new Insets(10));
		BorderPane.setMargin(btn15, new Insets(10));
		BorderPane.setMargin(btn16, new Insets(10));
		BorderPane.setMargin(btn17, new Insets(10));
		btn13.setAlignment(Pos.CENTER);
		btn14.setAlignment(Pos.CENTER);
		btn15.setAlignment(Pos.CENTER);
		btn16.setAlignment(Pos.CENTER);
		btn17.setAlignment(Pos.CENTER);
		sceneBorderPane = new Scene(borderPane);
		btn15.setOnAction(e -> buttonClickButton15());

	}

	public void buttonClickSwitchButton() {

		stage.setScene(sceneVBox);
	}

	public void buttonClickButton8() {

		stage.setScene(sceneFlowPane);
	}

	public void buttonClickButton12() {

		stage.setScene(sceneBorderPane);
	}

	public void buttonClickButton15() {
		System.out.println("Switch to HBox");
		stage.setScene(sceneHBox);
	}

	public void buttonClickSubmitButton() {
		String enterText = btn1.getText();
		if (enterText.isEmpty()) {
			btn1.setText("Please enter a valid city");
		}
		if (isInt(enterText)) {
			btn1.setText("Numbers are not alllowed");
		} else {
			try {
				w.setCity(enterText);
				btn1.setText("Temp \b"+w.getInfo("main.temp")+"\b Weather \b"+w.getInfo("weather[0].main")+"\b");
				//btn4.setText(w.getInfo("weather[0].main"));
				stage.setTitle("Entered city is "+enterText);
				Calendar c = Calendar.getInstance();
				GetDate d = new GetDate();
				btn4.setText(d.getCurrentTime(c));
				Tooltip t = new Tooltip();
				t.setText(d.getCurrentTime(c));
				btn4.setTooltip(t);
			} catch (IllegalArgumentException e1) {
				btn1.setText("Invalid city entered");
				stage.setTitle("ClickMe");
			}
		}

	}

	public void buttonClickClearButton() {
		btn1.setText("Enter the city");
		Calendar c = Calendar.getInstance();
		GetDate d = new GetDate();
		btn4.setText(d.getCurrentTime(c));
		stage.setTitle("ClickMe");
	}

	private boolean isInt(String text) {
		try {
			Integer.parseInt(text);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}
