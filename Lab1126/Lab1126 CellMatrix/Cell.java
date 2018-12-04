
/**
 * @author (Steven Nguyen) 
 * @version (11 26 18)
 */

public class Cell
{
    // instance variables - replace the example below with your own
    private int x;
    private Cell[] neighbors;

    /**
     * Constructor for objects of class Cell
     */
    public Cell(int a)    {
        x = a;
        neighbors = new Cell[4]; // North, East, South, and West only
    }

    /**

     * ++++++++++++++  methods

     */

    public int getInt(){

        return x;

    }


    public void setNeighbors(int index, int num) { // setter for neighbors

        neighbors[index] = new Cell(num);

    }


    public Cell[] getNeighbors() { // getter for neighbors

        return neighbors;

    }

}
