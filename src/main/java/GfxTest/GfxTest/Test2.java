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
import javafx.scene.control.TextField;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Test2 extends Application implements EventHandler<ActionEvent> {
	
	WeatherInfo weatherInfo = new WeatherInfo();
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
	Button back;
	
	GetDate dateInstance = new GetDate();
	Button btnSubmit;
	Button btnClear;
	Button btnSetting;
	Button btnBack;
	Button btnMengenlehreuhr;
	
	Label lblTempValue;
	Label lblPressureValue ;
	Label lblHumidityValue ;
	Label lblVisibility;
	Label lblWindSpeed;
	Label lblWindDegree;
	
	TextField textEnterCity;

	Text textErrorText;
	
	Label lblWeatherMain;
	Label lblWeatherDesc;
	Label lblWeatherClouds;
	Label lblCountry;
	
	
	Button btnDate;
	Button btnYear;
	Button btnMonth;
	Button btnTime;
	
	Scene scene;
	Scene settingScene;
	
	
	Label lblWeatherAPIURL;
	Label lblAPI;
	Label lblCity;
	
	TextField textWeatherAPIURL;
	TextField textAPI;
	TextField textCity;
	
	Button btnSaveSetting;
	Button btnBackSetting;
	 
	 HBox h1Setting ;
	 HBox h2Setting ;
	 HBox h3Setting ;
	 HBox h4Setting ;

	@Override
	public void start(Stage primaryStage) {
		titleUhr = new Label("Mengenlehreuhr");
		titleUhr.setPadding(new Insets(10,50,50,50));
		titleUhr.setId("titleStyle");

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
		back = new Button("Back");
		VBox finalUhr = new VBox(titleUhr,h, fiveHourRow, oneHourRow, fiveMinuteRow, oneMinuteRow,lblTime, back);
		finalUhr.setAlignment(Pos.CENTER);
		
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(finalUhr);

		mengenlehreuhrScene = new Scene(borderPane, Height, Width);
		mengenlehreuhrScene.getStylesheets().add(Test2.class.getResource("berlinUhr.css").toExternalForm());
        stage = primaryStage;

		btnSubmit = new Button("Submit");
		btnClear = new Button("Clear");
		btnSetting = new Button("Settings");
		btnMengenlehreuhr = new Button("Mengenlehreuhr");
		
		

		
		lblTempValue = new Label("Temperature in °C: ");
		lblPressureValue = new Label("Pressure in PSI: ");
		lblHumidityValue = new Label("Humidity: ");
		lblVisibility = new Label("Visibility: ");
		lblWindSpeed = new Label("Wind Speed: ");
		lblWindDegree = new Label("Wind in degree: ");
		
		
		
		textEnterCity = new TextField();
		textEnterCity.setPromptText("Please enter the city");
		textEnterCity.setMaxWidth(160);
		lblWeatherMain = new Label("Weather: ");
		lblWeatherDesc = new Label("Weather desc");
		lblWeatherClouds = new Label("Clouds :");
		lblCountry = new Label("Country Code: ");
		// Image image1 = new Image(Test.class.getResourceAsStream("sun-128.png"));
		// final ImageView selectedImage = new ImageView();
		// selectedImage.setPreserveRatio(true);
		// selectedImage.setLayoutX(100);
		// selectedImage.setLayoutY(100);
		// selectedImage.setImage(image1);

		textErrorText = new Text();
		HBox h1 = new HBox(20);
		h1.getChildren().addAll(btnSubmit, btnClear);

		btnDate = new Button();
		btnDate.setMaxWidth(160);
		btnDate.setPrefHeight(30);
		
		btnYear = new Button();
		btnYear.setMaxWidth(160);
		btnYear.setPrefHeight(30);
		
		btnMonth = new Button();
		btnMonth.setMaxWidth(160);
		btnMonth.setPrefHeight(30);
		
		btnTime = new Button();
		btnTime.setMaxWidth(160);
		btnTime.setPrefHeight(30);

		class RemindTask extends TimerTask {
			public void run() {
				Platform.runLater(() -> {
					Calendar c = Calendar.getInstance();
					lblTime.setText(String.format("%tT", c));
					lblTime.setId("labelTime");
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
					btnDate.setText(dateInstance.getCurrentDate(c));
					btnYear.setText(dateInstance.getCurrentYear(c));
					btnMonth.setText(dateInstance.getCurrentMonth(c));
					btnTime.setText(dateInstance.getCurrentTime(c));
				});
			}
		}
		timer.schedule(new RemindTask(), 0, 1 * 1000);

		VBox vboxTL = new VBox(20);
		vboxTL.getStyleClass().add("vbox");
		vboxTL.getChildren().addAll(btnSetting,textEnterCity,textErrorText, h1, btnMengenlehreuhr);
	

		VBox vboxTR = new VBox(20);
		vboxTR.getStyleClass().add("vbox");
		vboxTR.getChildren().addAll( lblWeatherMain, lblWeatherDesc, lblWeatherClouds, lblCountry); // selectedImage);

		VBox vboxBL = new VBox(20);
		vboxBL.getStyleClass().add("vbox");
		vboxBL.getChildren().addAll(btnDate, btnMonth, btnYear, btnTime);
		
		

		VBox vboxBR = new VBox(20);
		vboxBR.getStyleClass().add("vbox");
		vboxBR.getChildren().addAll(lblTempValue, lblPressureValue, lblHumidityValue, lblVisibility, lblWindSpeed, lblWindDegree);

		GridPane root = new GridPane();
		ColumnConstraints column1 = new ColumnConstraints();
		column1.setPercentWidth(50);
		ColumnConstraints column2 = new ColumnConstraints();
		column2.setPercentWidth(50);
		RowConstraints row1 = new RowConstraints();
		row1.setPercentHeight(50);
		RowConstraints row2 = new RowConstraints();
		row2.setPercentHeight(50);
		root.getColumnConstraints().addAll(column1, column2);
		root.getRowConstraints().addAll(row1, row2);
		GridPane.setConstraints(vboxTL, 0, 0, 2, 2);
		GridPane.setConstraints(vboxTR, 1, 0, 2, 2);
		GridPane.setConstraints(vboxBL, 0, 1, 2, 2);
		GridPane.setConstraints(vboxBR, 1, 1, 2, 2);
		root.getChildren().addAll(vboxTL, vboxTR, vboxBL, vboxBR);
	  
		btnSubmit.setOnAction(this);
		btnClear.setOnAction(this); 
		back.setOnAction(this);
     
		
		scene = new Scene(root,400,400);
		scene.getStylesheets().add(Test2.class.getResource("login.css").toExternalForm());
		stage.setTitle("Weather App");
		stage.setScene(scene);
		stage.show();
	    
	    h1Setting = new HBox(20);
	    h2Setting = new HBox(20);
	    h3Setting = new HBox(20);
	    h4Setting = new HBox(20);

	    lblWeatherAPIURL = new Label("Weather API URL");
	    lblWeatherAPIURL.setPrefWidth(160);
	    lblWeatherAPIURL.setPadding(new Insets(10,10,10,10));
	    
	    textWeatherAPIURL = new TextField(weatherInfo.getWeatherAPI());
	
	    lblAPI=new Label("API Key");
	    lblAPI.setPadding(new Insets(10,10,10,10));
	    lblAPI.setPrefWidth(160);
	    
	    textAPI = new TextField(weatherInfo.getAPIKey());
	    
	    lblCity=new Label("City");
	    lblCity.setPrefWidth(160);
	    lblCity.setPadding(new Insets(10,10,10,10));
 
	    textCity = new TextField(weatherInfo.getCity());
 
	    btnSaveSetting = new Button("Save");
	    btnSaveSetting.setPrefWidth(160);
	    btnBack = new Button("Back");
	    btnBack.setPrefWidth(160);
	    h1Setting.getChildren().addAll(lblWeatherAPIURL, textWeatherAPIURL);
	    h2Setting.getChildren().addAll(lblAPI,textAPI);
	    h3Setting.getChildren().addAll(lblCity, textCity);
	    h4Setting.getChildren().addAll(btnSaveSetting,btnBack);

	    VBox vBoxSetting = new VBox(20);
	    vBoxSetting.getChildren().addAll(h1Setting,h2Setting, h3Setting);
	    BorderPane b = new BorderPane();
	    BorderPane.setMargin(h1Setting, new Insets(10));
	    BorderPane.setMargin(h2Setting, new Insets(10));
	    BorderPane.setMargin(h3Setting, new Insets(10));
	    BorderPane.setMargin(h4Setting, new Insets(10));
	    b.setPadding(new Insets(50, 50, 50, 50));
	    b.setCenter(vBoxSetting);
	    b.setBottom(h4Setting);
	    settingScene = new Scene(b,400,400);   
	    settingScene.getStylesheets().add(Test2.class.getResource("login.css").toExternalForm());
	    btnSetting.setOnAction(this);
	    btnBack.setOnAction(this);
	    btnSaveSetting.setOnAction(this);
	    btnMengenlehreuhr.setOnAction(this);
	    
	}
	
	@Override
	public void stop(){
		timer.cancel();
        stage.close();
	    System.out.println("Stage is closing");
	}

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void handle(ActionEvent e) {
		if (e.getSource() == btnSubmit) {
			weatherInfo.setCity(textEnterCity.getText());
			System.out.println("Entered Value:" + textEnterCity.getText());
			try {
				lblWeatherMain.setText("Weather: "+weatherInfo.getInfo("weather[0].main"));
			    lblWeatherDesc.setText("Weather desc: "+weatherInfo.getInfo("weather[0].description"));
				lblWeatherClouds.setText("Clouds "+weatherInfo.getInfo("clouds.all"));
				lblCountry.setText("Country Code: "+weatherInfo.getInfo("sys.country"));
				lblPressureValue.setText("Pressure in PSI: "+weatherInfo.getInfo("main.pressure"));
				lblHumidityValue.setText("Humidity: "+weatherInfo.getInfo("main.humidity"));
				lblVisibility.setText("Visibility: "+weatherInfo.getInfo("visibility"));
				lblWindSpeed.setText("Wind Speed: "+weatherInfo.getInfo("wind.speed"));
				lblWindDegree.setText("Wind in degree: " +weatherInfo.getInfo("wind.deg"));
				lblTempValue.setText("Temperature in °C: "+weatherInfo.getInfo("main.temp"));
				textErrorText.setFill(Color.GREEN);
				textErrorText.setText("Success");
				// Image image2 = new
				// Image(Test.class.getResourceAsStream(w.setImage(w.getInfo("weather[0].main"))));
				// selectedImage.setImage(image2);
			} catch (NullPointerException e1) {
				textErrorText.setFill(Color.FIREBRICK);
				textErrorText.setText("Please enter a city");
			} catch (IllegalArgumentException e1) {
				textErrorText.setFill(Color.FIREBRICK);
				textErrorText.setText(textEnterCity.getText() + "city does not exist");
			}
		}
		if (e.getSource() == btnClear) {
			textEnterCity.setText("");
			lblPressureValue.setText("Pressure in PSI: ");
			lblHumidityValue.setText("Humidity: ");
			lblVisibility.setText("Visibility: ");
			lblWindSpeed.setText("Wind Speed: ");
			lblWindDegree.setText("Wind in degree: ");
			lblTempValue.setText("Temperature in °C: ");
			lblWeatherMain.setText("Weather :");
		    lblWeatherDesc.setText("Weather description");
			lblWeatherClouds.setText("Clouds ");
			lblCountry.setText("Country Code: ");
			textErrorText.setText("");
			// Image image1 = new Image(Test.class.getResourceAsStream("sun-128.png"));
			// selectedImage.setImage(image1);
		}
		if (e.getSource() == btnSetting) {
			stage.setScene(settingScene);
	        
		}
		if (e.getSource() == btnBack || e.getSource()==back) {
			stage.setScene(scene);
	        
		}
		if (e.getSource() == btnMengenlehreuhr) {
			stage.setTitle("Berlin Uhr");
			stage.setScene(mengenlehreuhrScene);
			
	        
		}
		if (e.getSource() == btnSaveSetting) {
			weatherInfo.setAPIKey(textAPI.getText());
			weatherInfo.setCity( textCity.getText());
			textEnterCity.setText(textCity.getText());
			weatherInfo.setWeatherAPI(textWeatherAPIURL.getText());
			try {
				lblPressureValue.setText("Pressure in PSI: "+weatherInfo.getInfo("main.pressure"));
				lblHumidityValue.setText("Humidity: "+weatherInfo.getInfo("main.humidity"));
				lblVisibility.setText("Visibility: "+weatherInfo.getInfo("visibility"));
				lblWindSpeed.setText("Wind Speed: "+weatherInfo.getInfo("wind.speed"));
				lblWindDegree.setText("Wind in degree: " +weatherInfo.getInfo("wind.deg"));
				lblTempValue.setText("Temperature in °C: "+weatherInfo.getInfo("main.temp"));
				lblWeatherMain.setText("Weather :"+weatherInfo.getInfo("weather[0].main"));
			    lblWeatherDesc.setText("Weather descr "+weatherInfo.getInfo("weather[0].description"));
				lblWeatherClouds.setText("Clouds "+weatherInfo.getInfo("clouds.all"));
				lblCountry.setText("Country Code: "+weatherInfo.getInfo("sys.country"));
				textErrorText.setFill(Color.GREEN);
				textErrorText.setText("Success");
				// Image image2 = new
				// Image(Test.class.getResourceAsStream(w.setImage(w.getInfo("weather[0].main"))));
				// selectedImage.setImage(image2);
			} catch (NullPointerException e1) {
				textErrorText.setFill(Color.FIREBRICK);
				textErrorText.setText("Please enter a city");
			} catch (IllegalArgumentException e1) {
				textErrorText.setFill(Color.FIREBRICK);
				textErrorText.setText(textEnterCity.getText() + "city does not exist");
			}
		}
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
			b.setStyle("-fx-background-color:" + color +";-fx-border-color: black;-fx-border-width: 2px;");
		}
		else {
			b.setStyle("-fx-background-color:white;-fx-border-color: black;-fx-border-width: 2px;");
		}
	}
	
}
