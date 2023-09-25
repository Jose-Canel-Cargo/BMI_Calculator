import java.util.Scanner;

public class ComputeAndInterpretBMI {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    // Prompt the user to enter weight in pounds
    System.out.print("Enter weight in pounds: ");
    double weight_in_pounds = input.nextDouble();
    
    // Prompt the user to enter height in feet and then the remaining inches
    System.out.print("\nEnter just the feet of your height (example: 5'6, enter 5): ");
    int height_feet = input.nextInt();

    System.out.print("\nEnter the inches of your height (example: 5'6, enter 6): ");
    int height_inches = input.nextInt();
    
    final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
    final double METERS_PER_INCH = 0.0254; // Constant 
    final int INCHES_PER_FEET = 12; // Constant
    
    // Compute BMI

    int height_to_inches = (height_feet * INCHES_PER_FEET) + height_inches;

    double weight_in_kilograms = weight_in_pounds * KILOGRAMS_PER_POUND; 
    double height_in_meters = height_to_inches * METERS_PER_INCH; 
    double bmi = weight_in_kilograms / (height_in_meters * height_in_meters);

    // Display result
    System.out.println("\nBMI is " + String.format("%.1f", bmi));
    if (bmi < 18.5)
      System.out.println("Underweight");
    else if (bmi < 25)
      System.out.println("Normal");
    else if (bmi < 30)
      System.out.println("Overweight");
    else
      System.out.println("Obese");

   input.close(); 
  }
}