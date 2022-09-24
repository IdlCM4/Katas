# List of katas:

### ReverseWords
Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.


### CountBy
Create a function with two arguments that will return an array of the first n multiples of x.
Assume both the given number and the number of times to count will be positive numbers greater than 0.
Return the results as an array or list ( depending on language ). 

Examples:

    countBy(1,10)  // should return  {1,2,3,4,5,6,7,8,9,10}
    countBy(2,5)  // should return {2,4,6,8,10}
    

### Convert
Implement a function which convert the given boolean value into its string representation.


### FindNextSquare
You might know some pretty large perfect squares. But what about the NEXT one? Complete the findNextSquare method that finds the next integral perfect
square after the one passed as a parameter. Recall that an integral perfect square is an integer n such that sqrt(n) is also an integer. If the parameter 
is itself not a perfect square then -1 should be returned. You may assume the parameter is non-negative.

Examples (Input --> Output):

    121 --> 144
    625 --> 676
    114 --> -1 since 114 is not a perfect square
    

### Bmi
Write function bmi that calculates body mass index (bmi = weight / height2). If bmi <= 18.5 return "Underweight", if bmi <= 25.0 return "Normal", 
if bmi <= 30.0 return "Overweight", if bmi > 30 return "Obese"


### DisemVowel
Trolls are attacking your comment section!
A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat. Your task is to write a 
function that takes a string and return a new string with all vowels removed.

Example: 

    "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
    
Note: for this kata y isn't considered a vowel.


### Number
Your team is writing a fancy new text editor and you've been tasked with implementing the line numbering. Write a function which takes a list of 
strings and returns each line prepended by the correct number. The numbering starts at 1. The format is n: string. Notice the colon and space in 
between.

Examples: (Input --> Output)

    [] --> []
    ["a", "b", "c"] --> ["1: a", "2: b", "3: c"]



### Rps
Rock, Paper, Scissors. Let's play! You have to return which player won! In case of a draw return Draw!.

Examples (Input1, Input2 --> Output):

    "scissors", "paper" --> "Player 1 won!"
    "scissors", "rock" --> "Player 2 won!"
    "paper", "paper" --> "Draw!"
    
    
### AreaOrPerimeter
You are given the length and width of a 4-sided polygon. The polygon can either be a rectangle or a square.
If it is a square, return its area. If it is a rectangle, return its perimeter.
Example (Input1, Input2 --> Output):

    6, 10 --> 32
    3, 3 --> 9
Note: for the purposes of this kata you will assume that it is a square if its length and width are equal, 
otherwise it is a rectangle.


### IsLove
Timmy & Sarah think they are in love, but around where they live, they will only know once they pick a flower each. 
If one of the flowers has an even number of petals and the other has an odd number of petals it means they are in love. 
Write a function that will take the number of petals of each flower and return true if they are in love and false if 
they aren't.


### SeriesSum
Your task is to write a function which returns the sum of following series upto nth term(parameter).

Series: 
1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...

Rules:

    You need to round the answer to 2 decimal places and return it as String.
    If the given value is 0 then it should return 0.00
    You will only be given Natural Numbers as arguments.

Examples (Input --> Output):

    1 --> 1 --> "1.00"
    2 --> 1 + 1/4 --> "1.25"
    5 --> 1 + 1/4 + 1/7 + 1/10 + 1/13 --> "1.57"



### Greet
Create a function that gives a personalized greeting. This function takes two parameters: name and owner.
Use conditionals to return the proper message:
        
    case	                return
    name equals owner	'Hello boss'
    otherwise	        'Hello guest'


### Grow
Given a non-empty array of integers, return the result of multiplying the values together in order. 
Example:
 
    [1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24



### CountSheeps
Consider an array/list of sheep where some sheep may be missing from their place. We need a function 
that counts the number of sheep present in the array (true means present).
For example: 

    [true,  true,  true,  false,
     true,  true,  true,  true ,
     true,  false, true,  false,
     true,  false, false, true ,
     true,  true,  true,  true ,
     false, false, true,  true]

The correct answer would be 17.
Hint: Don't forget to check for bad values like null/undefined


### GetXO
Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.
Examples input/output:

    XO("ooxx") => true
    XO("xooxx") => false
    XO("ooxXm") => true
    XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
    XO("zzoo") => false


### DoubleInteger
Code as fast as you can! You need to double the integer and return it.


### NumberToString
We need a function that can transform a number (integer) into a string.
What ways of achieving this do you know?

Examples (input --> output):
    
    123  --> "123"
    999  --> "999"
    -100 --> "-100"
    
    
### NoSpace
Simple, remove the spaces from the string, then return the resultant string.


### MakeUpperCase
Write a function which converts the input string to uppercase.


### IsTriangle
Implement a function that accepts 3 integer values a, b, c. The function should return true if a triangle can 
be built with the sides of given length and false in any other case.
(In this case, all triangles must have surface greater than 0 to be accepted).


### IsIsogram
An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that 
determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. 
Ignore letter case.

Example: (Input --> Output)

    "Dermatoglyphics" --> true "aba" --> false "moOse" --> false (ignore letter case)


### StringToNumber
Note: This kata is inspired by Convert a Number to a String!. Try that one too.
We need a function that can transform a string into a number. What ways of achieving this do you know?
Note: Don't worry, all inputs will be strings, and every string is a perfectly valid representation of an integral number.

Examples

    "1234" --> 1234
    "605"  --> 605
    "1405" --> 1405
    "-7" --> -7
    
    
### SimpleMultiplication
This kata is about multiplying a given number by eight if it is an even number and by nine otherwise.


### FakeBin
Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. 
Return the resulting string.
Note: input will never be an empty string


### BasicMath
Your task is to create a function that does four basic mathematical operations.
The function should take three arguments - operation(string/char), value1(number), value2(number).
The function should return result of numbers after applying the chosen operation.

Examples(Operator, value1, value2) --> output
   
    ('+', 4, 7) --> 11
    ('-', 15, 18) --> -3
    ('*', 5, 5) --> 25
    ('/', 49, 7) --> 7
    
    
### TwoSum
Write a function that takes an array of numbers (integers for the tests) and a target number. It should find two different 
items in the array that, when added together, give the target value. The indices of these items should then be returned in 
a tuple / list (depending on your language) like so: (index1, index2).
For the purposes of this kata, some tests may have multiple answers; any valid solutions will be accepted.

The input will always be valid (numbers will be an array of length 2 or greater, and all of the items will be numbers; target 
will always be the sum of two different items from that array).

Based on: http://oj.leetcode.com/problems/two-sum/


### AreYouPlayingBanjo
Create a function which answers the question "Are you playing banjo?".
If your name starts with the letter "R" or lower case "r", you are playing banjo!
The function takes a name as its only argument, and returns one of the following strings:

    name + " plays banjo" 
    name + " does not play banjo"
    Names given are always valid strings.
    
    
### OddOrEven
Given a list of integers, determine whether the sum of its elements is odd or even.
Give your answer as a string matching "odd" or "even".
If the input array is empty consider it as: [0] (array with a zero).
Examples:

    Input: [0]
    Output: "even"

    Input: [0, 1, 4]
    Output: "odd"

    Input: [0, -1, -5]
    Output: "even"
    
    
### RepeatStr
Write a function that accepts an integer n and a string s as parameters, and returns a string of s repeated exactly n times.
Examples (input -> output):

    6, "I"     -> "IIIIII"
    5, "Hello" -> "HelloHelloHelloHelloHello"
    
    
### ConvertBinaryArrayToInt
Given an array of ones and zeroes, convert the equivalent binary value to an integer.
Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.
Examples:

    Testing: [0, 0, 0, 1] ==> 1
    Testing: [0, 0, 1, 0] ==> 2
    Testing: [0, 1, 0, 1] ==> 5
    Testing: [1, 0, 0, 1] ==> 9
    Testing: [0, 0, 1, 0] ==> 2
    Testing: [0, 1, 1, 0] ==> 6
    Testing: [1, 1, 1, 1] ==> 15
    Testing: [1, 0, 1, 1] ==> 11


### GetMiddle
You are going to be given a word. Your job is to return the middle character of the word. If the word's length is odd, return 
he middle character. If the word's length is even, return the middle 2 characters.
#Examples:

    Kata.getMiddle("test") should return "es"

    Kata.getMiddle("testing") should return "t"

    Kata.getMiddle("middle") should return "dd"

    Kata.getMiddle("A") should return "A"
    
Input
A word (string) of length 0 < str < 1000 (In javascript you may get slightly more than 1000 in some test cases due to an error 
in the test cases). You do not need to test for this. This is only here to tell you that you do not need to worry about your 
solution timing out.
Output
The middle character(s) of the word represented as a string.


### EvenOrOdd
Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.


### ReversedStrings
Complete the solution so that it reverses the string passed into it.

    'world'  =>  'dlrow'
    'word'   =>  'drow'
