# DAA MINI PROJECT - Kadane's Algorithm Java Implementation

## Created by 
Shiv Chauhan 
22BCS15180

## Overview

This project implements Kadane's Algorithm, which is used to find the maximum sum of a contiguous subarray within a one-dimensional array of numbers. The program includes a graphical user interface (GUI) for user interaction, allowing users to input an array of integers and receive the maximum subarray sum as output.

## Features

- Input an array of integers separated by commas.
- Calculate and display the maximum contiguous subarray sum using Kadane's Algorithm.
- User-friendly GUI built with Java Swing.

## Requirements

- Java Development Kit (JDK) 8 or higher
- An IDE or text editor for Java (e.g., IntelliJ IDEA, Eclipse, NetBeans)

## How to Run the Program

1. **Clone the Repository** (if applicable):
   ```bash
   git clone https://github.com/yourusername/kadane-algorithm.git
   cd kadane-algorithm
   ```

2. **Compile the Program**:
   You can compile the program using the command line or your IDE. If using the command line:
   ```bash
   javac KadaneAlgorithm.java
   ```

3. **Run the Program**:
   Execute the main class:
   ```bash
   java KadaneAlgorithm
   ```

4. **Using the GUI**:
   - A window will appear prompting you to enter array elements separated by commas (e.g., `1, -2, 3, 4, -1`).
   - Click the "Calculate Maximum Subarray Sum" button to see the result displayed below.

## Code Structure

- **KadaneAlgorithm.java**: Contains the implementation of Kadane's Algorithm.
- **MaxSubArrayAlgorithm.java**: An interface defining the `maxSubArraySum` method.
- **KadaneUI.java**: Contains the GUI components and logic to handle user input and display results.

## Example

If you enter `-2,1,-3,4,-1,2,1,-5,4`, the program will output:
```
Result: Maximum Subarray Sum is 6
```
The contiguous subarray `[4,-1,2,1]` has the largest sum of 6.

## Error Handling

If invalid input is entered (e.g., non-integer values), the program will display an error message:
```
Error: Please enter valid integers separated by commas.
```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- Inspired by the need for efficient algorithms to solve problems in computer science.
- Thanks to the Java community for their ongoing support and resources.

---

Feel free to customize the links and sections based on your project's specifics, such as your GitHub username or any additional features you may want to include.
