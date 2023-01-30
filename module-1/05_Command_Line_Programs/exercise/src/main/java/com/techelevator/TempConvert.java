package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {

		System.out.println("Please enter the (temperature");
		Scanner input = new Scanner(System.in);

		String temperatureStr = input.nextLine();
		int temperatureInt = Integer.parseInt(temperatureStr);
		temperatureInt = Integer.parseInt(temperatureStr);

		System.out.println("Is the temperature in (C)elsius, or (F)ahrenheit?)");
		String optionSelected = input.nextLine();

		if (optionSelected.equals("C")) {
			double temperatureFahrenheit = temperatureInt * 1.8 + 32;

			System.out.println(temperatureStr + "C is" + temperatureFahrenheit);

			if (optionSelected.equals("F")) {
				double temperatureCelsius = (temperatureInt - 32) / 1.8;

				System.out.println(temperatureStr + "F is" + temperatureCelsius);

			}
		}
	}
}