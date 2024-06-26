# Recursive_Java_Programs
This repository contains several Java programs that demonstrate the use of recursion in solving different problems, from fractals to mathematical computations.

## Programs Included:
  ### 1. Sierpinski Triangle
    File: Sierpinski.java
    Description: Draws the Sierpinski Triangle fractal using recursion.
  ### 2. Binomial Coefficient Calculation
    File: Binomial.java
    Description: Computes the binomial coefficient using recursion and memoization.
  ### 3. Palindrome Checker
    File: Palindrome.java
    Description: Checks if a given string is a palindrome using recursive comparison.
  ### 4. Koch Curve and Snowflake
    File: Koch.java
    Description: Draws the Koch Curve and Koch Snowflake fractals using recursion.
  ### 5. Integer to Binary Conversion
    File: IntegerToBinary.java
    Description: Converts an integer to its binary representation using recursion.

## How to Use:
Each program can be compiled and executed individually. Here’s a general guide:

### 1. Compilation:
    javac ProgramName.java
### 2. Execution:
    java ProgramName [arguments]
  
  Replace ProgramName with the actual Java file name (Sierpinski, Binomial, etc.) and [arguments] with appropriate inputs as required by each program.


## Example Usage:
- ### Sierpinski Triangle:
  To draw a Sierpinski Triangle of depth 5:  

      java Sierpinski 5

- ### Binomial Coefficient:
  To calculate the binomial coefficient C(6, 2):

      java Binomial 6 2

- ### Palindrome Checker:
  To check if "radar" is a palindrome:

      java Palindrome radar
  
- ### Koch Curve:
  To draw a Koch Curve with Snowflake of depth 3 from (0, 0) to (1, 0):
  
      java Koch 3 0.0 0.0 1.0 0.0

- ### Integer to Binary Conversion:
  To convert the integer 13 to binary:

      java IntegerToBinary 13

## Dependencies:
    
- **StdDraw Library:** Used for graphical output in `Sierpinski.java` and `Koch.java`.
- **Installation:** The code of `StdDraw.java` is available [here](https://introcs.cs.princeton.edu/java/stdlib/StdDraw.java).
                    place it in the same directory as the Java files.



