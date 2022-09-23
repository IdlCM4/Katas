package Katas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kata{

  /**
   * Complete the function that accepts a string parameter, and reverses each word in the string. 
   * All spaces in the string should be retained.
   * @param original
   * @return
   */
  public static String reverseWords(final String original){
    String[] splitted = original.split("[ ]");
    String sol = "";
    if(splitted.length == 0){
      sol += original;
    }
    else{
      StringBuilder s = new StringBuilder(splitted[0]);
        s.reverse();
        sol += s.toString() ;
        for(int i = 1; i < splitted.length; i++){
            s = new StringBuilder(splitted[i]);
            s.reverse();
            sol += " "+s.toString();
        }
    }
    return sol;
  }

  /**
   * Create a function with two arguments that will return an array of the first n multiples of x.
   * Assume both the given number and the number of times to count will be positive numbers greater than 0.
   * Return the results as an array or list ( depending on language ).
   * Examples:
   *    countBy(1,10)  // should return  {1,2,3,4,5,6,7,8,9,10}
   *    countBy(2,5)  // should return {2,4,6,8,10}
   * @param x
   * @param n
   * @return
   */
  public static int[] countBy(int x, int n){

    int i = 0, d = 1;
    int[] sol = new int[n];
    while(i < n){
      sol[i] = x * d;
      d++;
      i++;
    }
    return sol;
  }
  
  /**
   * Implement a function which convert the given boolean value into its string representation.
   * @param b
   * @return
   */
  public static String convert(boolean b){
    return b ? "true" : "false";
  }

  /**
   * You might know some pretty large perfect squares. But what about the NEXT one?
   * Complete the findNextSquare method that finds the next integral perfect square after the one passed as a parameter. 
   * Recall that an integral perfect square is an integer n such that sqrt(n) is also an integer.
   * If the parameter is itself not a perfect square then -1 should be returned. You may assume the parameter is non-negative.
   * Examples:(Input --> Output)
   *    121 --> 144
   *    625 --> 676
   *    114 --> -1 since 114 is not a perfect square
   * @param sq
   * @return
   */
  public static long findNextSquare(long sq) {
  int i = (int)Math.sqrt(sq);
  double sol = 0;
  if(sq%i != 0){
    sol = -1;
  }
  else{
    i++;
    sol = Math.pow(i, 2);
  }
  return (long)sol; 
}

  /**
   * Write function bmi that calculates body mass index (bmi = weight / height2).
   * If bmi <= 18.5 return "Underweight"
   * if bmi <= 25.0 return "Normal"
   * if bmi <= 30.0 return "Overweight"
   * if bmi > 30 return "Obese"
   * @param weight
   * @param height
   * @return
   */
  public static String bmi(double weight, double height) {
    double bmi = weight / Math.pow(height, 2);
    if(bmi <= 18.5) return "Underweight";
    else if(bmi <= 25.0) return "Normal";
    else if(bmi <= 30.0) return "Overweight";
    else return "Obese";
  }

  /**
   * Trolls are attacking your comment section!
   * A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.
   * Your task is to write a function that takes a string and return a new string with all vowels removed.
   * Example 
   *    "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
   * 
   * Note: for this kata y isn't considered a vowel.
   * @param str
   * @return
   */
  public static String disemvowel(String str) {
    return str.replaceAll("[aeiouAEIOU]", "");
}

  /**
   * Your team is writing a fancy new text editor and you've been tasked with implementing the line numbering.
   * Write a function which takes a list of strings and returns each line prepended by the correct number.
   * The numbering starts at 1. The format is n: string. Notice the colon and space in between.
   * Examples: (Input --> Output)
   *    [] --> []
   *    ["a", "b", "c"] --> ["1: a", "2: b", "3: c"]
   * @param lines
   * @return
   */
  public static List<String> number(List<String> lines) {
    List<String> sol = new ArrayList<String>();
    int i = 1;
    for(String a : lines) {
      sol.add(i+": "+a);
      i++;
    }
    System.out.println(sol);
    return sol;
  }

  
  /**
   * Rock Paper Scissors
   * Let's play! You have to return which player won! In case of a draw return Draw!.
   * Examples(Input1, Input2 --> Output):
   *    "scissors", "paper" --> "Player 1 won!"
   *    "scissors", "rock" --> "Player 2 won!"
   *    "paper", "paper" --> "Draw!"
   * @param p1
   * @param p2
   * @return
   */
  public static String rps(String p1, String p2) {
    // your code
    if(p1.equals(p2)) return "Draw!";
    else{
      switch(p1){
        case "scissors":
          if(p2.equals("paper")) return "Player 1 won!";
          else return "Player 2 won!";
        case "paper":
        if(p2.equals("rock")) return "Player 1 won!";
          else return "Player 2 won!";
        case "rock":
        if(p2.equals("scissors")) return "Player 1 won!";
          else return "Player 2 won!";
          default: return "Error";
      }
    }
  }


  
  /**** TESTS *****/
  public static void main(String[] args) {
    System.out.println(rps("rock", "scissors"));
  }
}