
/**
 * Write a description of class MazeWalker here.
 *
 * @author Steven Nguyen
 * @version (830)
 */
public class MazeWalker
{
    // instance variables - replace the example below with your own
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void walkMaze(Maze maze, MazeBot mazeBot) {
        while(mazeBot.didNotReachGoal()== true){
            while(mazeBot.canMoveForward()){
                mazeBot.moveForward();
            }
            if(mazeBot.canMoveForward() == true){
                mazeBot.moveForward();
            }
            else if (mazeBot.turnRight == true){
                mazeBot.turnRight();
            }
            else if(mazeBot.turnLeft == true){
                mazeBot.turnLeft();
            }
            mazeBot.turnRight();

            while(mazeBot.canMoveForward()){
                mazeBot.moveForward();
            }

            //mazeBot.turnLeft();

            while(mazeBot.canMoveForward()){
                mazeBot.moveForward();
            }

            //mazeBot.turnLeft();

            while(mazeBot.canMoveForward()){
                mazeBot.moveForward();
            }

            //mazeBot.turnRight();

            while(mazeBot.canMoveForward()){
                mazeBot.moveForward();
            }

            //mazeBot.turnRight();

            while(mazeBot.canMoveForward()){
                mazeBot.moveForward();
            }

            //mazeBot.turnLeft();

            while(mazeBot.canMoveForward()){
                mazeBot.moveForward();
            }
            if(mazeBot.didReachGoal()) {
                mazeBot.signalSuccess();

            }
            else {
                mazeBot.signalError();
            }
        }
    }

}

