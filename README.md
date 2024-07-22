# Unitconversion

# Unit Converter Program

- **This Unit Converter program is a simple tool that converts quantities from one unit to another. It currently supports conversions between the following units:**

- **Feet to Meters**
- **Pounds to Kilograms**
- **Fahrenheit to Celsius**

# How to Use the Program
- **Download and Install Java:**
- **Ensure you have Java installed on your computer. You can download it from here.**

# Open Your Code Editor:
- **Open any code editor or Integrated Development Environment (IDE) such as IntelliJ IDEA, Eclipse, or Visual Studio Code.**

# Copy the Code:
- **Copy the following code into your editor:**
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

# Run the Program:

- **In your code editor, find the option to run or execute the code. This will start the program.**
- **Follow the prompts that appear in the console.**

  # Output the Result:
