
/**
 * Write a description of class Prob4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Prob4
{
    public class SumEvenNum {

public static void main (String[] arg)
{

    int sum = 0;
    for(int i = 1; i <= 200; i++)
    {
        if(i%2 == 0)
        {
            System.out.println("Summan blir : " + i);
            sum = sum + i;

    }
    }
        System.out.println("Sum : " + sum);     
}   
}

}
