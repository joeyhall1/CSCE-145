/*
 * Written by Joey Hall
 */

package BelowAverageWinter;
import java.util.Scanner;
public class ABelowAverageWinter {

	public static void main(String[] args) {
		
		// Beginning of code and importing scanner
		System.out.println("Welcome to the below average temperature tester program");
			Scanner k = new Scanner(System.in); {
			
				// Using double to create the array
				
				double[] temperatures = new double[10];
			System.out.println("Enter temperatures for the next 10 days");
			for (int i = 0; i < temperatures.length; i++) {
			    temperatures[i] = k.nextDouble();
			}
			
			// using double for the sum of the temperatures
			double sumTemperature = 0;
			for (double temperature : temperatures) {
			    sumTemperature += temperature;
			}
			// creating average temperature using double

			double averageTemperature = sumTemperature / temperatures.length; 
			// Using for-loop to get all the days below average temperature
			
			System.out.println("The days that were below average temperature were:");
			for (int i = 0; i < temperatures.length; i++) {
			    if (temperatures[i] < averageTemperature) {
			        System.out.println("Day " + (i + 1) + " with " + temperatures[i]);
			    }
			}
			System.out.println("The average temperature is: " + averageTemperature);
		}
    }
}


