package java_collections;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WeatherRecorder {
	static Scanner scn = new Scanner(System.in);
	HashMap<String, HashMap<String, Double>> weatherMap;

	/**
	 * This the ENUM class the holds the valid weather names
	 */
	public enum Weather {
		RAINY, SUNNY, WINDY, STORMY, CLOUDY, SNOWY;
	}

	/**
	 * This the ENUM class the holds the valid day names
	 */
	public enum Days {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
	}

	public static class InvalidWeatherException extends Exception {
		private static final long serialVersionUID = 1L;

		/**
		 * This function throws an exception if the parameter is invalid
		 * 
		 * @param input holds the value String
		 */
		public static void validateWeather(String input) throws InvalidWeatherException {
			boolean isValid = false;
			for (Weather weather : Weather.values()) {
				if (input.equalsIgnoreCase(weather.name())) {
					isValid = true;
				}
			}

			if (isValid == false) {
				throw new InvalidWeatherException();
			}
		}

	}

	/**
	 * This is the WeatherRecorder class constructor. This initializes the HashMap
	 * weatherMap.
	 */
	public WeatherRecorder() {
		weatherMap = new HashMap<>();
		HashMap<String, Double> sundayWeatherTemp = new HashMap<>();
		sundayWeatherTemp.put(Weather.RAINY.name(), 25.6);
		weatherMap.put("SUNDAY", sundayWeatherTemp);

		HashMap<String, Double> mondayWeatherTemp = new HashMap<>();
		mondayWeatherTemp.put(Weather.SUNNY.name(), 28.8);
		weatherMap.put("MONDAY", mondayWeatherTemp);

		HashMap<String, Double> tuesdayWeatherTemp = new HashMap<>();
		tuesdayWeatherTemp.put(Weather.SNOWY.name(), -11.2);
		weatherMap.put("TUESDAY", tuesdayWeatherTemp);

		HashMap<String, Double> wednesdayWeatherTemp = new HashMap<>();
		wednesdayWeatherTemp.put(Weather.STORMY.name(), 25.1);
		weatherMap.put("WEDNESDAY", wednesdayWeatherTemp);

		HashMap<String, Double> thursdayWeatherTemp = new HashMap<>();
		thursdayWeatherTemp.put(Weather.CLOUDY.name(), 26.4);
		weatherMap.put("THURSDAY", thursdayWeatherTemp);

		HashMap<String, Double> fridayWeatherTemp = new HashMap<>();
		fridayWeatherTemp.put(Weather.SUNNY.name(), 30.1);
		weatherMap.put("FRIDAY", fridayWeatherTemp);

		HashMap<String, Double> saturdayWeatherTemp = new HashMap<>();
		saturdayWeatherTemp.put(Weather.SNOWY.name(), -10.11);
		weatherMap.put("SATURDAY", saturdayWeatherTemp);

	}

	/**
	 * Prompts the user to input a VALID weather and temperature of a day puts the
	 * input values into the weatherMap HashMap
	 * 
	 * @return void
	 */
	public void start() {
		Days[] days = Days.values();
		for (int i = 0; i < days.length;) {
			System.out.print("Enter the weather for " + days[i] + ": ");

			try {
				String tempWeather = scn.nextLine();
				InvalidWeatherException.validateWeather(tempWeather);
				String weather = tempWeather;

				boolean isValid = false;
				while (!isValid) {
					System.out.print("Enter the temperature for " + days[i] + ": ");
					try {
						Double temperature = scn.nextDouble();
						isValid = true;
						scn.nextLine();
						HashMap<String, Double> weatherTemp = new HashMap<>();
						;
						weatherTemp.put(weather, temperature);
						weatherMap.put(days[i].name(), weatherTemp);
					} catch (InputMismatchException e) {
						isValid = false;
						System.out.println("Please enter a valid number for the temperature.");
						scn.nextLine();
					}
				}
				i++;// only move to the next day once the former day is inputed with valid values

			} catch (InvalidWeatherException e) {
				System.out.println("Please make sure to input a valid weather name.");
				for (int j = 0; j < Weather.values().length; j++) {
					System.out.print(Weather.values()[j]);
					if (j < Weather.values().length - 1) {
						System.out.print(", ");
					} else {
						System.out.println("\n");
					}
				}
			}
		}
	}

	/**
	 * Displays the weather and temperature of the parameter day in the HashMap
	 * 
	 * @param day holds the value String
	 * @return void
	 */
	public void displayWeatherTemp(String day) {
		try {
			Days dayEnum = Days.valueOf(day.toUpperCase());
			HashMap<String, Double> weatherTemp = weatherMap.get(day.toUpperCase());
			if (weatherTemp != null) {
				for (String weather : weatherTemp.keySet()) {
					Double temperature = weatherTemp.get(weather);
					System.out.println("The weather on " + dayEnum + " was " + weather.toLowerCase()
							+ " with a temperature of " + temperature + "°C.");
				}
			} else {
				System.out.println("No weather data available for " + dayEnum);
			}

		} catch (IllegalArgumentException e) {
			System.out.println("Invalid day: " + day);
		}
	}
	public void getWeatherTemp() {
		System.out.print("Enter a day to check its weather and temperture: ");
		displayWeatherTemp(scn.nextLine());
		
	}

}
