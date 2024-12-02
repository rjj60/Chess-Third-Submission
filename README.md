# Chess Game Final Submission
## Team Name: Starz
## Semester and Course
#### Semester: Fall, 2024
#### Course Number: CS 3354
#### Section Number: 003

## Team Members:
### - Bala Parthasarathy
### - Jay McCall


## Preview Picture Chess Interface
### 1. 
<img width="797" alt="Screenshot 2024-12-01 at 11 12 11 PM" src="https://github.com/user-attachments/assets/3ab758a0-6e8e-4331-8bee-67f816cbaf0e">

### 2.

<img width="800" alt="Screenshot 2024-12-01 at 11 27 30 PM" src="https://github.com/user-attachments/assets/edad9dbc-4478-47c4-926b-266fa2e50223">

### 3.
<img width="801" alt="Screenshot 2024-12-01 at 11 31 30 PM" src="https://github.com/user-attachments/assets/662cf33f-3f71-4669-9392-efd46b70bf6a">



## Class Diagram

<img width="3000" alt="Screenshot 2024-12-01 at 10 49 47 PM" src="https://github.com/user-attachments/assets/c8b87502-04c5-4372-88ae-8b33a2a6d4d0">


## Compilation and Execution Instructions

### 1. Clone the Repository


**git clone** [https://github.com/rjj60/Chess-Third-Submission]

### 2. Compile the Code

javac -d bin src/**/*.java

### 3. Run the Game

java -cp bin ChessMain

## Chess Project Files:

### Pieces:

- **King.java**: Implements the specific movement rules and restrictions for the King piece.
- **Queen.java**: Defines the movement capabilities of the Queen, combining both rook and bishop movements.
- **Rook.java**: Handles the movement logic for the Rook, which moves in straight lines across the board.
- **Bishop.java**: Manages the diagonal movement rules of the Bishop piece.
- **Knight.java**: Implements the unique "L-shaped" movement pattern for the Knight.
- **Pawn.java**: Defines the movement and capturing behavior of the Pawn, including special moves like en passant and promotion.

### Board Design & Logic:
- **BoardSquare.java**: Represents a single cell on the chessboard, managing its position, piece, and display updates.
- **ChessGameBoard.java**: Manages the 8x8 grid of BoardSquare objects, initializes the board with pieces, and provides access to board state and individual cells.
- **ChessGameEngine.java**: Handles the game's backend logic, including player turns, move validation, game conditions like check/checkmate, and resetting the game.
- **ChessGameLog.java**: Maintains a scrollable log of all game actions and moves, allowing players to review the game history.
- **ChessGamePiece.java**: Abstract class defining common attributes and behaviors for all chess pieces, such as move calculation and enemy detection
- **ChessGraveyard.java**: Tracks and displays captured chess pieces for each player on the GUI.
- **ChessMain.java**: The entry point for the application, responsible for launching the GUI.
- **ChessMenuBar.java**: Provides a menu with options for restarting the game, toggling views, and accessing help information.
- **ChessPanel.java**: Serves as the main container for the chess game, integrating the board, graveyards, menu, game log, and game engine.
  


## Features Checklist
 ####  Fully functional GUI for chess.
 ####  Interactive chessboard with move highlighting.
  #### Turn-based gameplay with enforcement of chess rules.
 ####  Captured pieces moved to "Graveyard" section.
  #### Real-time game log for moves.
 ####  Restart and exit game options in the menu bar.
  #### Validations for check and checkmate.
 
