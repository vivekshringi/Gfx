package GfxTest.GfxTest;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import io.restassured.response.Response;


public class WeatherInfo {

	String API_KEY = "";
	String WeatherApiURL = "http://api.openweathermap.org/data/2.5/weather?";
	String arg = "";
	String city = "Hamburg";
	String defaultContentType = "application/json";
	HashMap<String, String> hmap = new HashMap<String, String>();

	// {
	// "coord": {
	// "lon": 10,
	// "lat": 53.55
	// },
	// "weather": [
	// {
	// "id": 800,
	// "main": "Clear",
	// "description": "clear sky",
	// "icon": "01d"
	// }
	// ],
	// "base": "stations",
	// "main": {
	// "temp": 290.51,
	// "pressure": 1020,
	// "humidity": 42,
	// "temp_min": 290.15,
	// "temp_max": 291.15
	// },
	// "visibility": 10000,
	// "wind": {
	// "speed": 4.1,
	// "deg": 230
	// },
	// "clouds": {
	// "all": 0
	// },
	// "dt": 1536918600,
	// "sys": {
	// "type": 1,
	// "id": 4883,
	// "message": 0.0027,
	// "country": "DE",
	// "sunrise": 1536900730,
	// "sunset": 1536946657
	// },
	// "id": 2911298,
	// "name": "Hamburg",
	// "cod": 200
	// }

	public void setCity(String cityName) {
		city = cityName;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setWeatherAPI(String apiURL) {
		WeatherApiURL = apiURL;
	}
	
	public String getWeatherAPI() {
		return WeatherApiURL;
	}
	
	public void setAPIKey(String key) {
		API_KEY = key;
	}
	
	public String getAPIKey() {
		return API_KEY;
	}
	

	private String getFinalURL(String city) {
		String argumentSet = WeatherApiURL + "q=" + city;
		HashMap<String, String> map = defaultMap();
		Set<?> set = map.entrySet();
		Iterator<?> iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			argumentSet += ("&" + mentry.getKey() + "=" + mentry.getValue());
		}
		return argumentSet;
	}

	public String getInfo(String arg) {
		String finalInfo = "";
		if (arg == null) {
			arg = "";
		}
		String f = getFinalURL(city);
		Response response = given().contentType(defaultContentType).get(f);
	    finalInfo = response.jsonPath().getString(arg);
		return finalInfo;
	}

	public String getInfo() {
		arg = "";
		String f = getFinalURL(city);
		Response response = given().contentType(defaultContentType).get(f);
		return response.jsonPath().getString(arg);
	}

	public static void main(String[] args) {
		WeatherInfo w = new WeatherInfo();
		w.setCity(null);
		System.out.println(w.setImage(w.getInfo("weather[0].main")));
	}

	private HashMap<String, String> addArgument(String propName, String Value) {
		hmap.put(propName, Value);
		return hmap;
	}

	private HashMap<String, String> defaultMap() {
		addArgument("appid", API_KEY);
		addArgument("units", "metric");
		return hmap;
	}

	public String setImage(String s) {
		switch (s) {
		case "Clear": {
			return "sun-128.png";
		}
		case "Cloudy": {
			return "cloudy-128.png";
		}
		case "Cold": {
			return "cold-128.png";
		}
		case "Rain": {
			return "rain-128.png";
		}
		case "ThunderStorm": {
			return "thumderstorm-128.png";
		}
		default: {
			return "weather.png";
		}

		}
	}

}
