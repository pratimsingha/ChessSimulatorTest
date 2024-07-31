# ChessSimulatorTest
Chess Simulator Game that accepts the piece and displays all the possible moves from its current position.

# Requirements
- Java 17
- Maven (recommended version: 3.9.8)

# Setup Instructions
- Clone the repository
  
  ```git clone https://github.com/pratimsingha/ChessSimulatorTest.git```
  
  ```cd chess ```
- Build the project
  ```mvn clean install```
- Run the Application
  ```mvn exec:java -Dexec.mainClass="com.simulator.main.ChessSimulator"```

# Setup in IDE
- Import the project into your IDE.
- Locate the ChessSimulator class in the com.simulator.main package.
- Run the ChessSimulator class

# How to Run the Program
- Run the main class - ChessSimulator.
  
  When you run this class, it will prompt you to input a piece type and its position. The application will then display all possible movements for that piece.
  
  ![image](https://github.com/user-attachments/assets/731f1faa-b2eb-41a9-aa9c-a7ee2534572f)

  ![image](https://github.com/user-attachments/assets/ecfa95fd-f919-4717-b77e-33cbf77d4f2f)
- Input Format:
  -  Enter the piece type (e.g., King, Queen, Pawn). The input is case-insensitive. For now, the application will accept only the input of King, Queen, and Pawn. In case the user wants to Exit from the application, the input can be: Exit.
  -  Enter the position in standard chess notation (e.g., D4, E2). The input is case-insensitive.
  -  After every given input as piece type and position, the output of possible movements will be displayed. After that, the application will re-prompt the user for another input.
 
- Output of the application:
  The program will list possible movements for the specified piece from the given position. If no movements are possible, it will display a message accordingly.

# Testing
- To run the unit tests, use the following Maven command. This will execute all tests in the project and provide a report of the results.
  
  ```mvn test```
  
