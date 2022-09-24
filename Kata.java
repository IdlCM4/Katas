package Katas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A set of katas resolved on java from www.codewars.com
 */
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
    if(splitted.length == 0) sol += original;
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
   * Examples (Input --> Output):
   *    121 --> 144
   *    625 --> 676
   *    114 --> -1 since 114 is not a perfect square
   * @param sq
   * @return
   */
  public static long findNextSquare(long sq) {
    int i = (int)Math.sqrt(sq);
    double sol = 0;
    if(sq%i != 0) sol = -1;
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
   * Example: 
   *    "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
   * 
   * Note: for this kata y isn't considered a vowel.
   * @param str
   * @return
   */
  public static String disemVowel(String str) {
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

  /**
   * You are given the length and width of a 4-sided polygon. The polygon can either be a rectangle or a square.
   * If it is a square, return its area. If it is a rectangle, return its perimeter.
   * Example (Input1, Input2 --> Output):
   *    6, 10 --> 32
   *    3, 3 --> 9
   * Note: for the purposes of this kata you will assume that it is a square if its length and width are equal, 
   *  otherwise it is a rectangle.
   * @param l
   * @param w
   * @return
   */
  public static int areaOrPerimeter (int l, int w) {
    return (l == w) ? l * w : l*2 + w*2;
  }

  /**
   * Timmy & Sarah think they are in love, but around where they live, they will only know once they pick a flower each. 
   * If one of the flowers has an even number of petals and the other has an odd number of petals it means they are in love. 
   * Write a function that will take the number of petals of each flower and return true if they are in love and false if 
   * they aren't.
   * @param flower1
   * @param flower2
   * @return
   */
  public static boolean isLove(final int flower1, final int flower2) {
    if((flower1%2 == 0 && flower2%2 != 0) || (flower1%2 != 0 && flower2%2 == 0)) return true;
    else return false;
  }

  /**
   * Your task is to write a function which returns the sum of following series upto nth term(parameter).
   * Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...
   * Rules:
   *    You need to round the answer to 2 decimal places and return it as String.
   *    If the given value is 0 then it should return 0.00
   *    You will only be given Natural Numbers as arguments.
   * Examples (Input --> Output):
   *    1 --> 1 --> "1.00"
   *    2 --> 1 + 1/4 --> "1.25"
   *    5 --> 1 + 1/4 + 1/7 + 1/10 + 1/13 --> "1.57"
   * @param n
   * @return
   */
  public static String seriesSum(int n) {
    float d = 1, s = 0;
    if(n == 0) return "0.00";
    else{
      for(int i = 0; i < n; i++){
        s += 1 / d;
        d += 3;
      }
      return String.format("%.2f", s);
    }
	}

/**
 * Create a function that gives a personalized greeting. This function takes two parameters: name and owner.
 * Use conditionals to return the proper message:
 *    case	return
 *    name equals owner	'Hello boss'
 *    otherwise	'Hello guest'
 * @param name
 * @param owner
 * @return
 */
  public static String greet(String name, String owner) {
    return (name.equals(owner)) ? "Hello boss" : "Hello guest";
  }
    
  /**
   * Given a non-empty array of integers, return the result of multiplying the values together in order. 
   * Example:
   *    [1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24
   *    [4, 1, 1, 4] => 1 * 1 * 4 * 4 = 16
   * @param x
   * @return
   */
  public static int grow(int[] x){
    int r = 1;
    for(int i = 0; i < x.length; i++){
      r *= x[i];
    }
    return r;
  }

  /**
   * Consider an array/list of sheep where some sheep may be missing from their place. We need a function 
   * that counts the number of sheep present in the array (true means present).
   * For example,
   *    [true,  true,  true,  false,
   *     true,  true,  true,  true ,
   *     true,  false, true,  false,
   *     true,  false, false, true ,
   *     true,  true,  true,  true ,
   *     false, false, true,  true]
   * The correct answer would be 17.
   * Hint: Don't forget to check for bad values like null/undefined
   * @param arrayOfSheeps
   * @return
   */
  public int countSheeps(Boolean[] arrayOfSheeps) {
    int sum = 0;
    for(int i = 0; i < arrayOfSheeps.length; i++){
      if(arrayOfSheeps[i] != null && arrayOfSheeps[i] != false){
        sum++;
      }
    }
    return sum;
  }

  /**
   * Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and 
   * be case insensitive. The string can contain any char.Examples input/output:
   *    XO("ooxx") => true
   *    XO("xooxx") => false
   *    XO("ooxXm") => true
   *    XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
   *    XO("zzoo") => false
   * @param str
   * @return
   */
  public static boolean getXO (String str) {
    return str.toLowerCase().chars().filter(ch -> ch == 'x').count() == str.toLowerCase().chars().filter(ch -> ch == 'o').count();
  }

  /**
   * Code as fast as you can! You need to double the integer and return it.
   */
  public static int doubleInteger(int i) {
    return i*2;
  }

  /**
   * We need a function that can transform a number (integer) into a string.
   * What ways of achieving this do you know?
   * Examples (input --> output):
   *    123  --> "123"
   *    999  --> "999"
   *    -100 --> "-100"
   * @param num
   * @return
   */
  public static String numberToString(int num) {
    return String.valueOf(num);
  }

  /**
   * Simple, remove the spaces from the string, then return the resultant string.
   * @param x
   * @return
   */
  public static String noSpace(final String x) {
    return x.replaceAll(" ", "");
  }

  /**
   * Write a function which converts the input string to uppercase.
   * @param str
   * @return
   */
  public static String MakeUpperCase(String str){
    return str.toUpperCase();
  }

  /**
   * Implement a function that accepts 3 integer values a, b, c. The function should return true if a triangle can 
   * be built with the sides of given length and false in any other case.
   * (In this case, all triangles must have surface greater than 0 to be accepted).
   * @param a
   * @param b
   * @param c
   * @return
   */
  public static boolean isTriangle(int a, int b, int c){
    return (a+b>c && a+c>b && b+c>a) ? true : false;
  }

  /**
   * An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that 
   * determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. 
   * Ignore letter case.
   * Example (Input --> Output):
   *    "Dermatoglyphics" --> true "aba" --> false "moOse" --> false (ignore letter case)
   * @param str
   * @return
   */
  public static boolean  isIsogram(String str) {
    str = str.toLowerCase();
    return (str.chars().distinct().count() == str.length());

  } 

  /**
   * Note: This kata is inspired by Convert a Number to a String!. Try that one too.
   * We need a function that can transform a string into a number. What ways of achieving this do you know?
   * Note: Don't worry, all inputs will be strings, and every string is a perfectly valid representation of an integral number.
   * Examples:
   *    "1234" --> 1234
   *    "605"  --> 605
   *    "1405" --> 1405
   *    "-7" --> -7
   * @param str
   * @return
   */
  public static int stringToNumber(String str) {
    return Integer.valueOf(str);
  }

  /**
   * This kata is about multiplying a given number by eight if it is an even number and by nine otherwise.
   * @param n
   * @return
   */
  public static int simpleMultiplication(int n) {
    return n%2 != 0 ? n*9 : n*8;
  }

  /**
   * Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. 
   * Return the resulting string.
   * Note: input will never be an empty string
   * @param numberString
   * @return
   */
  public static String fakeBin(String numberString) {
    return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
  }

  /**
   * Your task is to create a function that does four basic mathematical operations.
   * The function should take three arguments - operation(string/char), value1(number), value2(number).
   * The function should return result of numbers after applying the chosen operation.
   * Examples (Operator, value1, value2) --> output :
   *    ('+', 4, 7) --> 11
   *    ('-', 15, 18) --> -3
   *    ('*', 5, 5) --> 25
   *    ('/', 49, 7) --> 7
   * @param op
   * @param v1
   * @param v2
   * @return
   */
  public static Integer basicMath(String op, int v1, int v2){
    switch(op){
      case "+": return v1 + v2;
      case "-": return v1 - v2;
      case "*": return v1 * v2;
      case "/": return v1 / v2;
      default: return 0;
    }
  }

  /**
   * Write a function that takes an array of numbers (integers for the tests) and a target number. It should find two different 
   * items in the array that, when added together, give the target value. The indices of these items should then be returned in 
   * a tuple / list (depending on your language) like so: (index1, index2).
   * For the purposes of this kata, some tests may have multiple answers; any valid solutions will be accepted.
   * The input will always be valid (numbers will be an array of length 2 or greater, and all of the items will be numbers; target 
   * will always be the sum of two different items from that array).
   * Based on: http://oj.leetcode.com/problems/two-sum/
   * @param numbers
   * @param target
   * @return
   */
  public static int[] twoSum(int[] numbers, int target) {
    boolean result = false;
    int k = 0;
    int[] sol = new int[2];
    while(!result && k < numbers.length){
      int attempt = numbers[k];
      sol[0] = k;
      for(int i = k + 1; i < numbers.length; i++){
        if((attempt + numbers[i]) == target){
          sol[1] = i;
          result = true;
        }
      }
      k++;
    }
    return sol;
  }

  /**
   * Create a function which answers the question "Are you playing banjo?".
   * If your name starts with the letter "R" or lower case "r", you are playing banjo!
   * The function takes a name as its only argument, and returns one of the following strings:
   *    name + " plays banjo" 
   *    name + " does not play banjo"
   * Names given are always valid strings.
   * @param name
   * @return
   */
  public static String areYouPlayingBanjo(String name) {
    if(name.charAt(0) == 'R' || name.charAt(0) == 'r') return name + " plays banjo";
    else return name + " does not play banjo";
  }

  /**
   * Given a list of integers, determine whether the sum of its elements is odd or even.
   * Give your answer as a string matching "odd" or "even".
   * If the input array is empty consider it as: [0] (array with a zero).
   * Examples:
   *    Input: [0]
   *    Output: "even"
   * 
   *    Input: [0, 1, 4]
   *    Output: "odd"
   *    
   *    Input: [0, -1, -5]
   *    Output: "even"
   * @param array
   * @return
   */
  public static String oddOrEven (int[] array) {
    int number = 0;
    for(int i = 0; i < array.length; i++){
        number += array[i];
    }
    return (number%2==0)?"even":"odd";
  }

  /**
   * Write a function that accepts an integer n and a string s as parameters, and returns a string of s repeated exactly 
   * n times.
   * Examples (input -> output): 
   *    6, "I"     -> "IIIIII"
   *    5, "Hello" -> "HelloHelloHelloHelloHello"
   * @param repeat
   * @param string
   * @return
   */
  public static String repeatStr(final int repeat, final String string) {
    String result = "";
    for(int i = 0; i < repeat; i++){
      result += string;
    }  
    return result;
  }

  /**
   * Given an array of ones and zeroes, convert the equivalent binary value to an integer.
   * Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.
   * Examples:
   *    Testing: [0, 0, 0, 1] ==> 1
   *    Testing: [0, 0, 1, 0] ==> 2
   *    Testing: [0, 1, 0, 1] ==> 5
   *    Testing: [1, 0, 0, 1] ==> 9
   *    Testing: [0, 0, 1, 0] ==> 2
   *    Testing: [0, 1, 1, 0] ==> 6
   *    Testing: [1, 1, 1, 1] ==> 15
   *    Testing: [1, 0, 1, 1] ==> 11
   * @param binary
   * @return
   */
  public static int convertBinaryArrayToInt(List<Integer> binary) {
    int result = 0, j = 0;
    for(int i = binary.size() - 1; i >= 0; i--){
        result += binary.get(i)*(Math.pow(2, j));
        j++;
    }
    return result;
  }

  /**
   * You are going to be given a word. Your job is to return the middle character of the word. If the word's length is odd, return 
   * the middle character. If the word's length is even, return the middle 2 characters.
   * #Examples:
   *    Kata.getMiddle("test") should return "es"
   *    Kata.getMiddle("testing") should return "t"
   *    Kata.getMiddle("middle") should return "dd"
   *    Kata.getMiddle("A") should return "A"
   * #Input
   * A word (string) of length 0 < str < 1000 (In javascript you may get slightly more than 1000 in some test cases due to an error 
   * in the test cases). You do not need to test for this. This is only here to tell you that you do not need to worry about your 
   * solution timing out.
   * #Output
   * The middle character(s) of the word represented as a string.
   * @param word
   * @return
   */
  public static String getMiddle(String word) {
    if(word.length()%2 == 0){ //It's Even
      return word.substring(word.length()/2 - 1, word.length()/2 + 1);
    }
    else{   //It's odd
      return (word.substring(word.length()/2, word.length()/2 + 1));
    }
  }

  /**
   * Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.
   * @param number
   * @return
   */
  public static String evenOrOdd(int number) {
    return (number%2!=0) ? "Odd" : "Even";
  }

  /**
   * Complete the solution so that it reverses the string passed into it.
   *    'world'  =>  'dlrow'
   *    'word'   =>  'drow'
   * @param str
   * @return
   */
  public static String reversedStrings(String str) {
    String sol = "";
    for(int i = str.length()-1; i >= 0; i--){ //go trough the String from end to beginning 
      sol += str.charAt(i); //save each character on a solution String
    }
    return sol;
  }

  /**** TESTS *****/
  public static void main(String[] args) {
    System.out.println(grow(new int[]{1,2,3}));
  }
}