
/**
 * Write a description of class Prob2 here.
 *
 * @author Steven Nguyen
 * @version 828
 */
import static java.lang.System.*;
public class Prob2
{
  
 
public class Prob2
{
    public static void main(String[] args)
    {
         
        int midRow = (noOfRows)/2;
  
        int row = 1;
         
        for (int i = midRow; i > 0; i--)
        {
  
            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }
  
            for (int j = 1; j <= row; j++)
            {
                System.out.print("*");
            }
  
            System.out.println();

            row++;
        }
         
        //Printing lower half of the diamond
         
        for (int i = 0; i <= midRow; i++) 
        {
           
             
            for (int j = row; j > 0; j--) 
            {
                    System.out.print("* ");
            }
             
            System.out.println();
            row--;
        }
    }
}
}
