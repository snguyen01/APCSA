
/**
 * StatTester finds loads an Array of int
 * and finds the sum, mean, median, and mode.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

// imports go here
import java.util.Arrays;
public class StatTester{
    //  Instance variables
    int nums[] = new int[10];             //  declaration
    int sum = 0;
    // Constructor
    public double meanArray(double[] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i];
        }
        return sum / m.length;
    }

    public double medianArray(double[] m) {
        int middle = m.length/2;
        if (m.length%2 == 1) {
            return m[middle];
        } else {
            return (m[middle-1] + m[middle]) / 2.0;
        }
    }
    //  Methods
    public void loadArray(){
        for(int i = 0; i < nums.length; i++){ //  length 10
            nums[i] = (int)Math.random()*10 + 1;      //  last index = 9
        }
    }
    
    public void printArray() {
        System.out.println("The sum:" + nums);
        
        
    }
}
