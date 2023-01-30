package com.techelevator;

import java.util.Scanner;

import static jdk.internal.logger.DefaultLoggerFinder.SharedLoggers.system;

public class Fibonacci {

	public static void main(String[] args) {

		System.out.print("0,1,");

		int upTo = 21;

		int firstVal = 0;
		int secondVal = 1;

		for (int i = 0; secondVal < upTo; i++) {

			int newVal = firstVal + secondVal;

			Systemsystem.out.print(newVal + ", ");

			firstVal = secondVal;
			secondVal = newVal;
		}

	}
}