/**
 * Write a description of class Prob1 here.
 *
 * @Steven Nguyen
 * @HW 828
 */

import static java.lang.System.*;

public class Prob1
{
    public static void main(String args[])
	{
	           //Start	  Stop      Increment
		for(int  i=0;   i<5;   i++)
		{
for (int j = 0; j < 5 - i; j++) { 
System.out.print(" ");
 }
 for (int k = 0; k <= i; k++) { 
System.out.print("*");
 } 

System.out.println();
 }
}
}
