
/**
 * Write a description of class MyFirstProgram here.
 * 
 * @author Steven Nguyen
 * @version 830
 */
public class MyFirstProgram
{
    public static void run()
    {
        Maze maze = new Maze();
        MazeWalker mazeWalker = new MazeWalker();
        mazeWalker.walkMaze(maze, maze.getMazeBot());
        
    }
}
