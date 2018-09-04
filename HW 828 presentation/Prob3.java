
/**
 * Write a description of class Prob3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Prob3
{
   System.out.println("Now enter " + n + " integers: ");
while(n >= 0) {
    int num = input.nextInt();
    if(num > 0) {
       if (num % 2 == 0)
         System.out.println(“Even”,num);
       else  
         System.out.println(“Odd”,num)
   }
   n--;
  }

  System.out.println("You entered " + odd + " odd numbers and " + even + " even numbers.");

}
