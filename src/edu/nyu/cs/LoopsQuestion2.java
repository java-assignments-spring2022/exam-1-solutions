package edu.nyu.cs;

import java.util.Scanner;

/**
 * Complete the methods within this class according to the instructions in the comments.
 */
public class LoopsQuestion2 {
    
    /**
     * getResponse
     * Complete a method named getResponse such that it repeatedly asks the user a question 
     * until they enter an acceptable response.
     * 
     * Requirements:
     * - the capitalization or case of the user's response does not matter.
     * 
     * @param question The question to ask the user, as a String
     * @param possibleResponses A String array of acceptable responses to the question.
     * @return The acceptable response that the user entered.
     */
    public static String getResponse(String question, String[] possibleResponses) {
        Scanner scn = new Scanner(System.in);
        boolean keepGoing = true;
        String response = "";
        // keep looping until we receive an acceptable response
        while (keepGoing) {
            System.out.println(question); // print the question
            response = scn.nextLine(); // get the user's response
            // loop through each acceptable response
            for (String possibleResponse : possibleResponses) {
                // check if it matches what the user entered
                if (response.toLowerCase().equals(possibleResponse.toLowerCase())) {
                    // if it's a match, don't loop anymore
                    keepGoing = false;
                }
            }
        }
        scn.close(); // be nice to Java
        return response; // return what the user entered
    }

  /**
   * Complete this main method such that it calls the getResponse function defined above
   * and asks the user a question of your choosing and prints "Thank you for your response!" 
   * once the user has entered one of the acceptable responses of your choosing.
   * 
   * @param args An array of any command-line arguments.
   */
  public static void main(String[] args) throws Exception {
    String question = "What is your favorite vegetable?";
    String[] possibleResponses = {
        "cheetos",
        "carrots",
        "kale",
        "beef jerky"
    };
    String response = getResponse(question, possibleResponses);
    System.out.println("Thank you for your response!");
  }

}
