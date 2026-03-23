# Java Calculator - Swing GUI

## Description

This project is a simple **Calculator** developed in **Java** using **JOptionPane (Swing)** for graphical user interaction. The program allows the user to perform basic arithmetic operations between two numbers.

The calculator supports addition, subtraction, multiplication, and division, and includes error handling for invalid inputs.

---

## Features

* Graphical interface using dialog boxes
* Supports basic operations:

  * Addition
  * Subtraction
  * Multiplication
  * Division
* Input validation
* Error handling for non-numeric inputs
* Prevents invalid menu options

---

## Technologies Used

* Java
* Java Swing (JOptionPane)

---

## How It Works

1. The program displays a menu with the available operations:

   * 1 → Add
   * 2 → Subtract
   * 3 → Multiplication
   * 4 → Division

2. The user selects an operation.

3. The user enters two integer numbers.

4. The program performs the selected operation.

5. The result is displayed in a dialog box.

6. If the user enters invalid data, the program displays an error message and restarts.

---

## Operations

| Option | Operation      | Formula |
| ------ | -------------- | ------- |
| 1      | Addition       | a + b   |
| 2      | Subtraction    | a - b   |
| 3      | Multiplication | a * b   |
| 4      | Division       | a / b   |

---

## How to Run the Program

1. Make sure Java JDK is installed.
2. Compile the program:

   ```
   javac Calculator.java
   ```
3. Run the program:

   ```
   java Calculator
   ```

---

## Error Handling

The program handles the following errors:

* Invalid menu option (must be between 1 and 4)
* Non-numeric input (NumberFormatException)
* Input mismatch errors

If an error occurs, the program shows an error message and restarts automatically.

---

## Notes

This project is useful for practicing:

* Conditional statements
* Exception handling
* User input using Swing
* Basic arithmetic operations in Java

---

## Author

Developed as a basic Java practice project to practice programming logic, exception handling, and GUI interaction using Java Swing.
