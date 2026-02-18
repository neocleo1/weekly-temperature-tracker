package Temp_tracker;

import java.util.Scanner;
import java.util.ArrayList;


public class TempCalc {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> days = new ArrayList<String>();
		ArrayList<Double> temps = new ArrayList<Double>();
		for (int i = 0; i < 7; i++){
			System.out.print("Enter Day: ");
			 String day = input.nextLine();
			 days.add(day);
			System.out.print("Enter Temperature: ");
			 double temp = input.nextDouble();
			 temps.add(temp);
			 input.nextLine();
		}
		System.out.print("Enter a day of the week or 'week' for the weekly summary: ");
		String userInput = input.nextLine();
		
		if (userInput.equalsIgnoreCase("week")) {
			System.out.println("Weekly Summary:");
			double sum = 0.0;
			for (int i = 0; i < days.size(); i ++) {
				System.out.println(days.get(i) + " : " + temps.get(i));
				sum += temps.get(i);

			}
			sum = sum / temps.size();
			System.out.println("The weekly average temperature was : " + sum);
		}
		else {
			System.out.print("Searching for the day: ");
			for (int i = 0; i < days.size(); i ++) {
				if (userInput.equalsIgnoreCase(days.get(i))) {
				System.out.println("On " + days.get(i) + " , The temperature was " + temps.get(i));
				} 
				
			}
		}

		
	}

}
