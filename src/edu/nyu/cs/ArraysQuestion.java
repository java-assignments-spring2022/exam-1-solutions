package edu.nyu.cs;

import java.util.Arrays;

/**
 * Complete the methods within this class according to the instructions in the comments.
 */
public class ArraysQuestion {
    
    /**
     * Finds the maximum value in an array of integers.
     * 
     * Requirements:
     * - you are not allowed to use any helper functions to find the maximum value in the array.
     * 
     * @param nums An array of integers in no particular order.
     * @return The maximum value in the array.
     */
    public static int maxFinder(int[] nums) {
        int max = 0;
        // loop through each value in the array
        for (int num : nums) {
            // compare each value to the existing max
            if (num > max) {
                // if it is greater, update the existing max
                max = num;
            }
        }
        return max; // return the max once the loop is complete
    }

  /**
   * main
   * Complete this main method such that it calls the maxFinder function defined above
   * and passes it an array of the integers of your choosing, e.g. 10, 5, 4145, 5, 249, 41
   * 
   * The method should print out a message following this format exactly 
   * (the numbers displayed here are examples only and should be replaced by the actual values in the array and the actual maximum value that the code calculated):
   * 
   *    The maximum value in [10, 5, 4145, 5, 249, 41] is 4145.
   * 
   * @param args An array of any command-line arguments.
   */
  public static void main(String[] args) throws Exception {
    int[] nums = {10, 5, 4145, 5, 249, 41};
    int max = maxFinder(nums);
    System.out.printf("The maximum value in %s is %d.\n", Arrays.toString(nums), max);
  }    

}
