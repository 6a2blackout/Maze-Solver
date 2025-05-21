 🧩 Maze Solver (Java):

This is a fully functional Java program that solves mazes using text file inputs. Simply load a `.txt` maze file and watch the algorithm find a path from start to finish (if one exists)!

🗺️ About the Project:

This program takes a maze defined in a `.txt` file and solves it using a search algorithm. It reads the maze structure, identifies the start and end points, and finds a valid path through the maze.

✅ Features:

- Reads maze data from `.txt` files  
- Finds and prints a path if one exists  
- Handles invalid or unsolvable mazes gracefully  
- Simple, clean Java code structure for easy modification or integration


Output:
maze is built by having walls (1)s and the path (0)s.
if the program found a path through the maze it will change the 0s to 2s.

Output when there is no path through the Maze:

<img width="309" alt="outputno" src="https://github.com/user-attachments/assets/47074f4b-f66d-4f48-ba12-ee9a2b8a7567" />

Output when there is a path through the maze:

<img width="415" alt="outputyes" src="https://github.com/user-attachments/assets/85cac60b-a4c0-4d30-8fd2-d0686dc14127" />





📚 What I Learned

File handling in Java:
- Reading structured data from .txt files and converting it into a usable format for algorithmic processing.

Algorithmic thinking:
- Applying search algorithms (like Depth-First Search or Breadth-First Search) to explore possible paths and handle backtracking.

Edge case handling:
- Validating input files, managing unsolvable mazes, and avoiding common errors like out-of-bounds access.

Debugging and testing:
- Creating multiple test mazes and verifying the accuracy and robustness of the solution.

🧠 Future Ideas:
- Add GUI using JavaFX.
- Allow multiple solving algorithms.
- Highlight or visualize the path.
