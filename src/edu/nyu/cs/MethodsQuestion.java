package edu.nyu.cs;

import java.util.Scanner;

/**
 * Complete the methods within this class according to the instructions in the comments.
 */
public class MethodsQuestion {
    
    /**
     * bmiCalc
     * Complete a method named bmiCalc that calculates a person's body mass index (BMI), 
     * and determines whether that person's weight is categorized by the US Centers for Disease Control as 
     * "underweight" (BMI < 18.5), "normal weight" (18.5 < BMI < 24.9), "overweight" (25 < BMI < 29.9), 
     * or "obese" (BMI >= 29.9).  
     * 
     * The formula for calculating BMI is as follows:
     *      BMI = (weight * 703) / (height)^2
     * 
     * @param height The person's height, in inches, as an int
     * @param weight The person's weight, in pounds, as an int
     * @return The user's CDC-approved BMI category, as a String (i.e. "underweight", "normal weight", "overweight", or "obese")
     */
    public static String bmiCalc(double height, double weight) {
        // calculate bmi
        double bmi = (weight * 703.0) / Math.pow(height, 2);

        if (bmi < 18.5) return "underweight";
        else if (bmi < 24.9) return "normal weight";
        else if (bmi < 29.9) return "overweight";
        else return "obese";
    }    


    /**
     * main
     * Complete this main method such that it asks the user for their height and weight and
     * calls the bmiCalc function defined above to calculate the user's CDC-approved weight category.
     * 
     * Requirements:
     * - Assume the user will respond appropriately to the questions with integer values.
     * 
    * An example session may look as follows/ Your program should follow the formatting of this output exactly.
    * (user responses are shown on the same line for ease-of-reading only):
    * 
    *      Height (inches): 66
    *      Weight (pounds): 156
    *      The CDC thinks you are overweight!
    * 
    * @param args An array of any command-line arguments.
    */
  public static void main(String[] args) throws Exception {
        // get height and weight from the user
        Scanner scn = new Scanner(System.in);
        System.out.println("Height (inches): ");
        double height = Double.parseDouble(scn.nextLine());
        System.out.println("Weight (pounds): ");
        double weight = Double.parseDouble(scn.nextLine());
        scn.close(); // be nice to Java

        // calculate the bmi
        String bmi = bmiCalc(height, weight);
        System.out.printf("The CDC thinks you are %s!\n", bmi);

  }    
}
