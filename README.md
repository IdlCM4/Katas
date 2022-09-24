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
        
        case	return
        name equals owner	'Hello boss'
        otherwise	'Hello guest'


### Grow
Given a non-empty array of integers, return the result of multiplying the values together in order. 
Example:
 
        [1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24