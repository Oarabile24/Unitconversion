/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unitconversion;

/**
 *
 * @author CAPACITI-JHB
 */
import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the unit you want to convert from:");
        String fromUnit = scanner.nextLine();

        System.out.println("Enter the unit you want to convert to:");
        String toUnit = scanner.nextLine();

        System.out.println("Enter the quantity to be converted:");
        double quantity = scanner.nextDouble();

        double result = 0;

        if (fromUnit.equalsIgnoreCase("Feet") && toUnit.equalsIgnoreCase("Meters")) {
            result = quantity * 0.3048;
        } else if (fromUnit.equalsIgnoreCase("Pounds") && toUnit.equalsIgnoreCase("Kgs")) {
            result = quantity * 0.453592;
        } else if (fromUnit.equalsIgnoreCase("Fahrenheit") && toUnit.equalsIgnoreCase("Celsius")) {
            result = (quantity - 32) * 5.0/9.0;
        } else {
            System.out.println("Invalid unit conversion. Please try again.");
            return;
        }

        System.out.println("The result of the conversion is: " + result);
    }
}
