package edu.nyu.cs;

import java.util.Scanner;

/**
 * Complete the methods within this class according to the instructions in the comments.
 */
public class LoopsQuestion1 {
    
    /*
     * studyManager
     * Complete a method named studyManager such that it uses a loop to ask a user 
     * how many hours they studied for each day of the week and prints out the total at the end.
     * 
     * Requirements:
     * - each iteration of the loop should ask about one day, using human-friendly sentences.  
     * - you can assume the user will always respond with a valid integer value
     * - once the loop has completed, the program should return the total number of hours studied.
     * 
     * An example session may look as follows. Your program should follow the formatting of this output exactly:
     * (user responses are shown on the same line for ease-of-reading only):
     * 
     *      How many hours did you study on Monday? 4
     *      How many hours did you study on Tuesday? 2
     *      How many hours did you study on Wednesday? 1
     *      How many hours did you study on Thursday? 6
     *      How many hours did you study on Friday? 9
     *      How many hours did you study on Saturday? 0
     *      How many hours did you study on Sunday? 1
     *      You studied a total of 23 hours this week.
     */
    public static void studyManager() {
        int total = 0;
        Scanner scn = new Scanner(System.in);
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        // loop as many times as there are days
        for (int i=0; i<days.length; i++) {
          // ask the user how many hours they studied this day
          String day = days[i];
          System.out.println(String.format("How many hours did you study on %s?", day));
          String response = scn.nextLine(); // get the user's response
          total += Integer.parseInt(response); // add to running total
        }
        // output the total
        System.out.printf("You studied a total of %d hours this week.\n", total);
        scn.close(); // be nice to Java
    }

  /**
   * main
   * Complete this main method such that it calls the studyManager function defined above.
   * 
   * @param args An array of any command-line arguments.
   */
  public static void main(String[] args) throws Exception {
    studyManager();
  }


}
