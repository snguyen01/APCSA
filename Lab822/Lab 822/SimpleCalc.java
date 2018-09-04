
/**
 * Write a description of class SimpleCalc here.
 *
 * @author (Steven Nguyen)
 * @version (Lab 822)
 */
public class SimpleCalc
{
   double n1 = 1.0;
   double n2 = 2.0;
    // instance variables - replace the example below with your own
    private double number;

    //public SimpleCalc(double n1, double n2)
    //{
        
    //}
    public double add(double n1, double n2)
    {
        double answer = n1 + n2;
       
        return answer;
    }
    
    public double subtract(double n1, double n2)
    {
        double answer = n1 - n2;
        
        return answer;
    }
    public double multiply(double n1, double n2)
    {
        double answer = n1 * n2;
        
        return answer;
    }
    public double divide(double n1, double n2)
    {
        double answer = n1/n2;
        
        return answer;
    }
}
