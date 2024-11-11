package java_collections;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WeatherRecorder {
	static Scanner scn = new Scanner(System.in);
	HashMap<String, HashMap<String, Double>> weatherMap;

	public static class InvalidWeatherException extends Exception {
		private static final long serialVersionUID = 1L;

		/**
		 * This function throws an exception if the parameter is invalid
		 * @param input holds the value String
		 * */
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

	public enum Weather {
		RAINY, SUNNY, WINDY, STORMY, CLOUDY, SNOWY
	}

	public enum Days {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}

	public WeatherRecorder() {
		weatherMap = new HashMap<>();
	}
	/**
	 * Prompts the user to input a VALID weather and temperature of a day
	 * puts the input values into the weatherMap HashMap
	 * 
	 * @return void
	 * */
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
						weatherTemp.put(weather, temperature);
						weatherMap.put(days[i].name(), weatherTemp);
					} catch (InputMismatchException e) {
						isValid = false;
						System.out.println("Please enter a valid number for the temperature.");
						scn.nextLine();
					}
				}
				i++;//only move to the next day once the former day is inputed with valid values

			} catch (InvalidWeatherException e) {
				System.out.println("Please make sure to input a valid weather.");
				for (int j = 0; j < Weather.values().length; j++) {
					System.out.print(Weather.values()[j]);
					if (j < Weather.values().length - 1) {
						System.out.print(", ");
					} else {
						System.out.println();
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
			System.out.println("Valid day: " + dayEnum);

			HashMap<String, Double> weatherTemp = weatherMap.get(dayEnum.name());
			if (weatherTemp != null) {
				for (String weather : weatherTemp.keySet()) {
					Double temperature = weatherTemp.get(weather);
					System.out.println("The weather on " + dayEnum + " was " + weather + " with a temperature of "
							+ temperature + "°C.");
				}
			} else {
				System.out.println("No weather data available for " + dayEnum);
			}

		} catch (IllegalArgumentException e) {
			System.out.println("Invalid day: " + day);
		}
	}

}
