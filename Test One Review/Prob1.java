
/**
 * Write a description of class Prob1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Prob1
{
    public static void main( String ... args ) { 

        Random random = new Random();

        int[][] array = new int[10][10];

        for( int i = 0 ; i < array.length ; i++ ) { 
           for ( int j = 0 ; j < array[i].length ; j++ ) { 
              array[i][j] = random.nextInt(10);
           }
        }

        for( int[] a : array ) { 
            System.out.println( Arrays.toString( a ));
        }
    }

}
