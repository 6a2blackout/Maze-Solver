import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Loay Abu Saifan
 */



public class Maze {
    /*this is the main method */
    public static void main(String[] args){


        try{

            File infile = new File(args[0]);
            Scanner scan = new Scanner(infile);

            int numRows = scan.nextInt();
            int numColumns = scan.nextInt();
            int startIndex = scan.nextInt();
            

            int[][] maze = new int[numRows][numColumns];

            String line = "";
            while(scan.hasNext()){
                line += scan.nextLine();
            }
            int counter = 0;
            for(int i=0; i<numRows; i++){
                for(int j=0; j<numColumns; j++){
                    if(line.charAt(counter) == '0'){
                        maze[i][j] = 0;
                    }
                    else if(line.charAt(counter) == '1'){
                        maze[i][j] = 1;
                    }
                    counter++;
                }
            }

            for(int i=0; i<numRows; i++){
                for(int j=0; j<numColumns; j++){
                    System.out.print(maze[i][j]);
                }
                System.out.println();
            }

            

            if(maze[0][startIndex] == 0){
                boolean result = PartAMaze.isTraversable(maze, 0, startIndex);

                if(result){
                    System.out.println("\n\nYes, there is a path through the maze\n\n");

                    for(int i=0; i<numRows; i++){
                        for(int j=0; j<numColumns; j++){
                            System.out.print(maze[i][j]);
                        }
                        System.out.println();
                    }
                }
                else{
                    System.out.println("there is no path womp womp\n\n");
                }
            }

        }
        catch (FileNotFoundException e){
            System.err.println("file not found");
            System.exit(1);
        }
    }

    /*this is the isTraversable method it returns a boolean */
    public static boolean isTraversable(int[][] mazeIn, int rowIndex, int columnIndex){

        mazeIn[rowIndex][columnIndex] = 2;

        if(rowIndex == (mazeIn.length-1)){
            return true;
        }

        if((mazeIn[rowIndex+1][columnIndex] == 0)){
            if(isTraversable(mazeIn, rowIndex+1, columnIndex)){
                return true;
            }
        }
        if((columnIndex != 0) && (mazeIn[rowIndex][columnIndex-1] == 0)){
            if(isTraversable(mazeIn, rowIndex, columnIndex-1)){
                return true;
            }
        }
        if((columnIndex != mazeIn[0].length-1) && (mazeIn[rowIndex][columnIndex+1] == 0)){
            if(isTraversable(mazeIn, rowIndex, columnIndex+1)){
                return true;
            }
        }
        else if((rowIndex != 0) && (mazeIn[rowIndex-1][columnIndex] == 0)){
            if(isTraversable(mazeIn, rowIndex-1, columnIndex)){
                return true;
            }
        }

        return false;

    }
}
